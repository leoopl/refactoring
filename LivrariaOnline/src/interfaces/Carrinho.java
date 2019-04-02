package interfaces;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import elementos.Background;
import elementos.Item;
import elementos.Livro;
import elementos.Usuario;
import pattern.FlyweightFactory.Sprite;
import utils.EventosCarrinhoDeCompras;

public class Carrinho extends JFrame {

	private JPanel panel;
	private JLabel item, precoU, quantidade, item1, precoU1, item2, precoU2, entrega, pagamento;
	private static final String[] num = { "1", "2", "3", "4", "5" };
	private JComboBox quant1 = new JComboBox(num);
	private JComboBox quant2 = new JComboBox(num);
	JRadioButton optionE1, optionE2, optionP1, optionP2;
	private JButton continuar, adicionar, next, ret;
	boolean u1, u2;
	Background construtorImage = null;
	private int page;
	private boolean login;
	private Usuario user;
	private double preco1, preco2;
	private List<Item> carrinhoCompras;

	// Colocar como parâmetro o livro escolhido
	public Carrinho(int numberOfPage, Usuario u, boolean l, List<Item> carrinhoCompras) {
		super("Carrinho de Compras - Livraria Online");
		ImageIcon icone = PaginaInicial.factory.getFlyweight(Sprite.ICONE);
		setIconImage(icone.getImage());
		construtorImage = new Background("fundoPrincipal.png");
		construtorImage.setSize(2000, 1500);
		this.user = u;
		this.login = l;
		this.preco1 = 0.0;
		this.preco2 = 0.0;
		this.page = numberOfPage;
		this.carrinhoCompras = carrinhoCompras;

		panel = new JPanel();
		panel.setLayout(null);

		ImageIcon logomarca = PaginaInicial.factory.getFlyweight(Sprite.LOGO);
		JLabel label = new JLabel(logomarca);
		label.setBounds(20, 10, 650, 65);

		item = new JLabel();
		item.setText("<html><font color = #FFFFFF size = 5>ITEM</font></html>");
		item.setBounds(325, 160, 250, 60);

		precoU = new JLabel();
		precoU.setText("<html><font color = #FFFFFF size = 5>PREÇO</font></html>");
		precoU.setBounds(525, 160, 250, 60);

		quantidade = new JLabel();
		quantidade.setText("<html><font color = #FFFFFF size = 5>QUANTIDADE</font></html>");
		quantidade.setBounds(725, 160, 250, 60);

		// Cada item de livro terá essa estrutura

		u1 = u2 = false;

		int size;
		if (carrinhoCompras == null) {
			size = 0;
		} else {
			size = carrinhoCompras.size() - (2 * numberOfPage);
			if (size > 2) {
				size = 2;
			}
		}
		switch (size) {
		case 1:
			u1 = true;
			break;
		case 2:
			u1 = u2 = true;
			break;
		}

		if (u1 == true) {
			int index = 0 + (2 * numberOfPage);
			String preco = "R$" + carrinhoCompras.get(index).getLivro().getPreco();
			preco1 = carrinhoCompras.get(index).getLivro().getPreco();
			ImageIcon livro = new ImageIcon(carrinhoCompras.get(index).getLivro().getImagem());
			JLabel label1 = new JLabel(livro);
			label1.setBounds(60, 250, 100, 80);
			item1 = new JLabel();
			item1.setText(carrinhoCompras.get(index).getLivro().getTitulo());
			item1.setBounds(325, 260, 250, 60);
			precoU1 = new JLabel();
			precoU1.setText(preco);
			precoU1.setBounds(525, 260, 250, 60);
			quant1.setBounds(735, 270, 60, 40);
			quant1.setSelectedIndex(carrinhoCompras.get(index).getQuantidade() - 1);
			panel.add(label1);
			panel.add(item1);
			panel.add(precoU1);
			panel.add(quant1);
		}
		if (u2 == true) {
			int index = 1 + (2 * numberOfPage);
			String preco = "R$" + carrinhoCompras.get(index).getLivro().getPreco();
			preco2 = carrinhoCompras.get(index).getLivro().getPreco();
			ImageIcon livro = new ImageIcon(carrinhoCompras.get(index).getLivro().getImagem());
			JLabel label1 = new JLabel(livro);
			label1.setBounds(50, 500, 100, 80);
			item2 = new JLabel();
			item2.setText(carrinhoCompras.get(index).getLivro().getTitulo());
			item2.setBounds(325, 500, 250, 60);
			precoU2 = new JLabel();
			precoU2.setText(preco);
			precoU2.setBounds(525, 500, 250, 60);
			quant2.setBounds(735, 510, 60, 40);
			quant2.setSelectedIndex(carrinhoCompras.get(index).getQuantidade() - 1);
			panel.add(label1);
			panel.add(item2);
			panel.add(precoU2);
			panel.add(quant2);
		}

		if (size == 2 && carrinhoCompras.size() > (numberOfPage * 2) && numberOfPage != 0) {
			// Adicionando o botão next
			next = new JButton();
			next.setBounds(800, 655, 100, 40);
			next.setBackground(Color.white);
			next.setText("Next Page");
			panel.add(next);
			nextEvento handler5 = new nextEvento();
			next.addActionListener(handler5);

			// Adicionando o botão return
			ret = new JButton();
			ret.setBounds(600, 655, 100, 40);
			ret.setBackground(Color.white);
			ret.setText("Previus");
			panel.add(ret);
			retEvento handler6 = new retEvento();
			ret.addActionListener(handler6);

		} else if (size <= 2 && carrinhoCompras.size() >= (numberOfPage * 2) && numberOfPage != 0) {
			ret = new JButton();
			ret.setBounds(600, 655, 100, 40);
			ret.setBackground(Color.white);
			ret.setText("Previus");
			panel.add(ret);
			retEvento handler6 = new retEvento();
			ret.addActionListener(handler6);
		} else if (carrinhoCompras.size() > 2 && numberOfPage == 0) {

			// Adicionando o botão next
			next = new JButton();
			next.setBounds(800, 655, 100, 40);
			next.setBackground(Color.white);
			next.setText("Next Page");
			panel.add(next);
			nextEvento handler5 = new nextEvento();
			next.addActionListener(handler5);
		}

		continuar = new JButton();
		continuar.setText("<html><font size = 4>CONTINUAR</font></html>");
		continuar.setBounds(1000, 655, 120, 40);
		continuar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		continuar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		continuar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		continuar.setBackground(Color.white);
		continuar.setBorderPainted(false);

		adicionar = new JButton();
		adicionar.setText("<html><font size = 4>ADICIONAR MAIS ITENS</font></html>");
		adicionar.setBounds(1135, 655, 200, 40);
		adicionar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		adicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		adicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		adicionar.setBackground(Color.white);
		adicionar.setBorderPainted(false);

		entrega = new JLabel();
		entrega.setText("<html><font color = #FFFFFF size = 5>ENTREGA</font></html>");
		entrega.setBounds(1100, 150, 250, 60);
		panel.add(entrega);
		optionE1 = new JRadioButton("<html><font color = #FFFFFF size = 4>Sedex - R$ 25.80</font></html>", true);
		optionE1.setBounds(995, 210, 150, 40);
		optionE1.setOpaque(false);
		optionE2 = new JRadioButton("<html><font color = #FFFFFF size = 4>Correios - R$ 7.90</font></html>", false);
		optionE2.setBounds(1150, 210, 150, 40);
		optionE2.setOpaque(false);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(optionE1);
		group1.add(optionE2);
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 0;
		panel.add(optionE1, constraints1);
		constraints1.gridx = 1;
		panel.add(optionE2, constraints1);

		pagamento = new JLabel();
		pagamento.setText("<html><font color = #FFFFFF size = 5>PAGAMENTO</font></html>");
		pagamento.setBounds(1095, 260, 250, 60);
		panel.add(pagamento);
		optionP1 = new JRadioButton("<html><font color = #FFFFFF size = 4>Cartão de crédito</font></html>", true);
		optionP1.setBounds(995, 320, 200, 30);
		optionP1.setOpaque(false);
		optionP2 = new JRadioButton("<html><font color = #FFFFFF size = 4>Cartão de débito</font></html>", false);
		optionP2.setBounds(1150, 320, 200, 30);
		optionP2.setOpaque(false);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(optionP1);
		group2.add(optionP2);
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 0;
		panel.add(optionP1, constraints2);
		constraints2.gridx = 1;
		panel.add(optionP2, constraints2);

		panel.add(label);
		panel.add(item);
		panel.add(precoU);
		panel.add(quantidade);
		panel.add(continuar);
		panel.add(adicionar);
		panel.add(construtorImage);
		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Handler para eventos registradores
		EventosCarrinhoDeCompras handler1 = null;
		if (carrinhoCompras.size() % 2 == 0) {
			handler1 = new EventosCarrinhoDeCompras(this, optionP1, optionP2, optionE1, optionE2, quant2, preco2, user,
					login, carrinhoCompras);
		} else {
			handler1 = new EventosCarrinhoDeCompras(this, optionP1, optionP2, optionE1, optionE2, quant1, preco1, user,
					login, carrinhoCompras);
		}

		continuar.addActionListener(handler1);
		adicionar.addActionListener(handler1);
		handler1.setAdicionar(adicionar);
		handler1.setContinuar(continuar);

	}

	private class nextEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == next) {
				Carrinho pgi = new Carrinho(page + 1, user, login, carrinhoCompras);
				Carrinho.this.dispose();
			}
		}
	}

	private class retEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == ret) {
				Carrinho pgi = new Carrinho(page - 1, user, login, carrinhoCompras);
				Carrinho.this.dispose();
			}

		}

	}
}
