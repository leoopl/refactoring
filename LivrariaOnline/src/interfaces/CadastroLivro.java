package interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import elementos.Background;
import elementos.Item;
import elementos.Usuario;
import funcionalidades.Cadastrar;
import pattern.FlyweightFactory.Sprite;

public class CadastroLivro extends JFrame {

	private JPanel panel;
	private JLabel cadastro, tituloT, autorT, editoraT, precoT, descricaoT, estoqueT, excluirT, codigoT, categoria;
	private JTextField titulo, autor, editora, preco, descricao, estoque, excluir;
	private JButton voltar, finalizar, excluirB;
	private String[] cat = { "arte", "ajuda", "biografia", "exatas", "humanas", "comidas", "direito", "educacao",
			"historia", "estrangeiro", "infantil", "nacional", "negocios", "hq", "saude", "tecnologia", "turismo" };
	private JComboBox categoriaB = new JComboBox(cat);
	Background construtorImage = null;
	private Usuario user;
	private boolean login;

	public CadastroLivro(Usuario u, boolean l) {
		super("Menu administrador - Livraria Online");
		ImageIcon icone = PaginaInicial.factory.getFlyweight(Sprite.ICONE);
		setIconImage(icone.getImage());
		construtorImage = new Background("fundoPrincipal.png");
		construtorImage.setSize(2000, 1500);

		this.user = u;
		this.login = l;

		panel = new JPanel();
		panel.setLayout(null);

		ImageIcon logomarca = PaginaInicial.factory.getFlyweight(Sprite.LOGO);
		JLabel label = new JLabel(logomarca);
		label.setBounds(20, 10, 650, 65);

		cadastro = new JLabel();
		cadastro.setText("<html><font color = #FFFFFF size = 6>CADASTRO - LIVRO</font></html>");
		cadastro.setBounds(125, 160, 250, 60);

		tituloT = new JLabel();
		tituloT.setText("<html><font color = #FFFFFF size = 5>Título</font></html>");
		tituloT.setBounds(125, 200, 250, 60);

		titulo = new JTextField();
		titulo.setBounds(125, 250, 350, 35);

		autorT = new JLabel();
		autorT.setText("<html><font color = #FFFFFF size = 5>Autor</font></html>");
		autorT.setBounds(625, 200, 250, 60);

		autor = new JTextField();
		autor.setBounds(625, 250, 350, 35);

		editoraT = new JLabel();
		editoraT.setText("<html><font color = #FFFFFF size = 5>Editora</font></html>");
		editoraT.setBounds(1025, 200, 250, 60);

		editora = new JTextField();
		editora.setBounds(1025, 250, 200, 35);

		descricaoT = new JLabel();
		descricaoT.setText("<html><font color = #FFFFFF size = 5>Imagem</font></html>");
		descricaoT.setBounds(125, 300, 250, 60);

		descricao = new JTextField();
		descricao.setBounds(125, 355, 350, 35);

		precoT = new JLabel();
		precoT.setText("<html><font color = #FFFFFF size = 5>Preço</font></html>");
		precoT.setBounds(500, 300, 200, 60);

		preco = new JTextField();
		preco.setBounds(500, 355, 200, 35);

		estoqueT = new JLabel();
		estoqueT.setText("<html><font color = #FFFFFF size = 5>Estoque</font></html>");
		estoqueT.setBounds(725, 300, 250, 60);

		estoque = new JTextField();
		estoque.setBounds(725, 355, 200, 35);

		categoria = new JLabel();
		categoria.setText("<html><font color = #FFFFFF size = 5>Categoria</font></html>");
		categoria.setBounds(950, 300, 250, 60);

		categoriaB.setBounds(950, 355, 280, 35);

		excluirT = new JLabel();
		excluirT.setText("<html><font color = #FFFFFF size = 6>EXCLUIR LIVRO</font></html>");
		excluirT.setBounds(125, 450, 250, 60);

		codigoT = new JLabel();
		codigoT.setText("<html><font color = #FFFFFF size = 5>Nome do Livro</font></html>");
		codigoT.setBounds(125, 490, 250, 60);

		excluir = new JTextField();
		excluir.setBounds(125, 545, 200, 35);

		voltar = new JButton();
		voltar.setText("<html><font size = 4>Voltar</font></html>");
		voltar.setBounds(125, 655, 80, 40);
		voltar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		voltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		voltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		voltar.setBackground(Color.white);
		voltar.setBorderPainted(false);

		finalizar = new JButton();
		finalizar.setText("<html><font size = 4>Finalizar Cadastro</font></html>");
		finalizar.setBounds(210, 655, 180, 40);
		finalizar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		finalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		finalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		finalizar.setBackground(Color.white);
		finalizar.setBorderPainted(false);

		excluirB = new JButton();
		excluirB.setText("<html><font size = 4>Excluir Livro</font></html>");
		excluirB.setBounds(395, 655, 180, 40);
		excluirB.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		excluirB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		excluirB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		excluirB.setBackground(Color.white);
		excluirB.setBorderPainted(false);

		panel.add(cadastro);
		panel.add(voltar);
		panel.add(finalizar);
		panel.add(tituloT);
		panel.add(autorT);
		panel.add(editoraT);
		panel.add(precoT);
		panel.add(descricaoT);
		panel.add(estoqueT);
		panel.add(titulo);
		panel.add(autor);
		panel.add(editora);
		panel.add(preco);
		panel.add(descricao);
		panel.add(estoque);
		panel.add(excluirT);
		panel.add(excluir);
		panel.add(codigoT);
		panel.add(excluirB);
		panel.add(label);
		panel.add(categoria);
		panel.add(categoriaB);
		panel.add(construtorImage);
		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Handler para eventos registradores
		voltarEvento handler1 = new voltarEvento();
		voltar.addActionListener(handler1);
		finalizarEvento handler2 = new finalizarEvento();
		finalizar.addActionListener(handler2);
		excluirEvento handler3 = new excluirEvento();
		excluirB.addActionListener(handler3);

	}

	private class voltarEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == voltar) {
				PaginaInicial pgi = new PaginaInicial(0, user, login, new ArrayList<Item>(), "");
				CadastroLivro.this.dispose();
			}

		}

	}

	private class finalizarEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == finalizar) {
				Cadastrar.cadastrarLivro(titulo.getText(), autor.getText(), categoriaB.getSelectedItem().toString(),
						editora.getText(), Float.parseFloat(preco.getText()), descricao.getText(),
						Integer.parseInt(estoque.getText()));
				PaginaInicial pgi = new PaginaInicial(0, user, login, new ArrayList<Item>(), " ");
				CadastroLivro.this.dispose();
			}

		}

	}

	private class excluirEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == excluirB) {
				Cadastrar.excluirLivro(excluir.getText());
				PaginaInicial pgi = new PaginaInicial(0, user, login, new ArrayList<Item>(), " ");
				CadastroLivro.this.dispose();
			}

		}

	}
}
