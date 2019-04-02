package interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import elementos.Background;
import elementos.Item;
import elementos.Livro;
import elementos.Usuario;
import funcionalidades.Cadastrar;
import pattern.FlyweightFactory;
import pattern.FlyweightFactory.Sprite;
import utils.EventosCategorias;

public class PaginaInicial extends JFrame {
	
	static FlyweightFactory factory = new FlyweightFactory();

	private List<Item> carrinhoLivros;
	private int page;
	private Usuario u;
	private boolean l;
	private String cat;
	private JPanel panel;
	private JLabel enderecoT, senhaT;
	private JTextField endereco;
	private JPasswordField senha;
	private JButton acessar, cadastrar, arte, ajuda, biografia, exatas, humanas, comidas, direito;
	private JButton educacao, historia, estrangeiro, infantil, nacional, negocios, hq, saude, tecnologia, turismo;
	private JButton livro1, livro2, livro3, livro4, livro5, livro6, carrinho, next, ret;
	private JButton cadsAdmin, cadsLivro;
	Background construtorImage = null;
	private List<Livro> livros = new ArrayList<Livro>();

	public PaginaInicial(int numberOfPage, Usuario user, boolean usuarioLogado, List<Item> itensCarrinho,
			String categoria) {
		super("Página Inicial - Livraria Online");
		this.carrinhoLivros = itensCarrinho;
		this.u = user;
		this.l = usuarioLogado;
		this.cat = categoria;
		this.page = numberOfPage;
		ImageIcon icone = factory.getFlyweight(Sprite.ICONE);
		setIconImage(icone.getImage());
		construtorImage = new Background("fundoPrincipal.png");
		construtorImage.setSize(2000, 1500);
		boolean u1, u2, u3, u4, u5, u6;
		u1 = u2 = u3 = u4 = u5 = u6 = false;

		panel = new JPanel();
		panel.setLayout(null);

		ImageIcon logomarca = factory.getFlyweight(Sprite.LOGO);
		JLabel label = new JLabel(logomarca);
		label.setBounds(20, 10, 600, 65);

		// Cadastro teste
		// Cadastrar.cadastrarLivro("nome", "autor", CategoriaLivro.AJUDA, "",
		// 2, "", 1);
		this.livros = Cadastrar.getListaLivros(categoria);
		int size;
		if (livros == null) {
			size = 0;
		} else {
			size = livros.size() - (6 * numberOfPage);
			if (size > 6) {
				size = 6;
			}
		}
		/*
		 * TODO Cada case terá a função de modificar estas variáveis booleanas,
		 * que por sua vez são responsáveis por tornar vísiveis os livros de
		 * acordo com a demanda já que nas possíveis dimensões só serão
		 * suportados 8 livros.
		 */
		switch (size) {
		case 1:
			u1 = true;
			break;
		case 2:
			u1 = u2 = true;
			break;
		case 3:
			u1 = u2 = u3 = true;
			break;
		case 4:
			u1 = u2 = u3 = u4 = true;
			break;
		case 5:
			u1 = u2 = u3 = u4 = u5 = true;
			break;
		case 6:
			u1 = u2 = u3 = u4 = u5 = u6 = true;
			break;
		}

		if (u1 == true) {
			livro1 = new JButton(new ImageIcon(livros.get(0 + (3 * numberOfPage)).getImagem()));
			livro1.setText(livros.get(0 + (3 * numberOfPage)).getTitulo() + " R$: "
					+ livros.get(0 + (3 * numberOfPage)).getPreco());
			livro1.setBounds(270, 220, 200, 200);
			livro1.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			livro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			livro1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			livro1.setBackground(Color.white);
			panel.add(livro1);
			livroEvento handler10 = new livroEvento();
			livro1.addActionListener(handler10);
		}
		if (u2 == true) {
			livro2 = new JButton(new ImageIcon(livros.get(1 + (3 * numberOfPage)).getImagem()));
			livro2.setText(livros.get(1 + (3 * numberOfPage)).getTitulo() + " R$: "
					+ livros.get(1 + (3 * numberOfPage)).getPreco());
			livro2.setBounds(680, 220, 200, 200);
			livro2.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			livro2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			livro2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			livro2.setBackground(Color.white);
			panel.add(livro2);
			livroEvento handler10 = new livroEvento();
			livro2.addActionListener(handler10);
		}
		if (u3 == true) {
			livro3 = new JButton(new ImageIcon(livros.get(2 + (3 * numberOfPage)).getImagem()));
			livro3.setText(livros.get(2 + (3 * numberOfPage)).getTitulo() + " R$: "
					+ livros.get(2 + (3 * numberOfPage)).getPreco());
			livro3.setBounds(1090, 220, 200, 200);
			livro3.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			livro3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			livro3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			livro3.setBackground(Color.white);
			panel.add(livro3);
			livroEvento handler10 = new livroEvento();
			livro3.addActionListener(handler10);
		}
		if (u4 == true) {
			livro4 = new JButton(new ImageIcon(livros.get(3 + (3 * numberOfPage)).getImagem()));
			livro4.setText(livros.get(3 + (3 * numberOfPage)).getTitulo() + " R$: "
					+ livros.get(3 + (3 * numberOfPage)).getPreco());
			livro4.setBounds(270, 440, 200, 200);
			livro4.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			livro4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			livro4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			livro4.setBackground(Color.white);
			panel.add(livro4);
			livroEvento handler10 = new livroEvento();
			livro4.addActionListener(handler10);
		}
		if (u5 == true) {
			livro5 = new JButton(new ImageIcon(livros.get(4 + (3 * numberOfPage)).getImagem()));
			livro5.setText(livros.get(4 + (3 * numberOfPage)).getTitulo() + " R$: "
					+ livros.get(4 + (3 * numberOfPage)).getPreco());
			livro5.setBounds(680, 440, 200, 200);
			livro5.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			livro5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			livro5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			livro5.setBackground(Color.white);
			panel.add(livro5);
			livroEvento handler10 = new livroEvento();
			livro5.addActionListener(handler10);
		}
		if (u6 == true) {
			livro6 = new JButton(new ImageIcon(livros.get(5 + (3 * numberOfPage)).getImagem()));
			livro6.setText(livros.get(5 + (3 * numberOfPage)).getTitulo() + " R$: "
					+ livros.get(5 + (3 * numberOfPage)).getPreco());
			livro6.setBounds(1090, 440, 200, 200);
			livro6.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			livro6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			livro6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			livro6.setBackground(Color.white);
			panel.add(livro6);
			livroEvento handler10 = new livroEvento();
			livro6.addActionListener(handler10);
		}

		if (size == 6 && livros.size() > (numberOfPage * 6) && numberOfPage != 0) {
			// Adicionando o botão next
			next = new JButton();
			next.setBounds(1190, 650, 100, 28);
			next.setBackground(Color.white);
			next.setText("Next Page");
			panel.add(next);
			nextEvento handler5 = new nextEvento();
			next.addActionListener(handler5);

			// Adicionando o botão return
			ret = new JButton();
			ret.setBounds(1000, 650, 100, 28);
			ret.setBackground(Color.white);
			ret.setText("Previus");
			panel.add(ret);
			retEvento handler6 = new retEvento();
			ret.addActionListener(handler6);

		} else if (size <= 6 && livros.size() >= (numberOfPage * 6) && numberOfPage != 0) {
			ret = new JButton();
			ret.setBounds(1000, 650, 100, 28);
			ret.setBackground(Color.white);
			ret.setText("Previus");
			panel.add(ret);
			retEvento handler6 = new retEvento();
			ret.addActionListener(handler6);
		} else if (livros.size() > 6 && numberOfPage == 0) {

			// Adicionando o botão next
			next = new JButton();
			next.setBounds(1190, 650, 100, 28);
			next.setBackground(Color.white);
			next.setText("Next Page");
			panel.add(next);
			nextEvento handler5 = new nextEvento();
			next.addActionListener(handler5);
		}

		carrinho = new JButton(new ImageIcon("carrinho.jpg"));
		carrinho.setBounds(1270, 25, 80, 65);
		carrinho.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		carrinho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		carrinho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		carrinho.setBackground(Color.white);
		carrinho.setBorderPainted(false);
		if (user != null) {
			if (u.isAdmin() == true) {
				cadsAdmin = new JButton();
				cadsAdmin.setText("<html><font size = 4>Cadastrar Administrador</font></html>");
				cadsAdmin.setBounds(850, 30, 200, 55);
				cadsAdmin.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
				cadsAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
				cadsAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
				cadsAdmin.setBackground(Color.gray);
				cadsAdmin.setBorderPainted(false);

				cadsLivro = new JButton();
				cadsLivro.setText("<html><font size = 4>Cadastrar/Excluir Livro</font></html>");
				cadsLivro.setBounds(1080, 30, 170, 55);
				cadsLivro.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
				cadsLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
				cadsLivro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
				cadsLivro.setBackground(Color.gray);
				cadsLivro.setBorderPainted(false);

				panel.add(cadsAdmin);
				panel.add(cadsLivro);

				cadsAdminEvento handler5 = new cadsAdminEvento();
				cadsAdmin.addActionListener(handler5);

				cadsLivroEvento handler6 = new cadsLivroEvento();
				cadsLivro.addActionListener(handler6);
			}
		}

		if (usuarioLogado == false) {
			enderecoT = new JLabel();
			enderecoT.setText("<html><font color = #0087DD size = 4>E-mail*</font></html>");
			enderecoT.setBounds(890, 0, 200, 35);

			endereco = new JTextField();
			endereco.setBounds(890, 30, 200, 35);

			senhaT = new JLabel();
			senhaT.setText("<html><font color = #0087DD size = 4>Senha*</font></html>");
			senhaT.setBounds(1100, 0, 150, 35);

			senha = new JPasswordField();
			senha.setBounds(1100, 30, 150, 35);

			cadastrar = new JButton();
			cadastrar.setText("<html><font size = 4>Cadastrar</font></html>");
			cadastrar.setBounds(1040, 70, 100, 30);
			cadastrar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			cadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			cadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			cadastrar.setBackground(Color.gray);
			cadastrar.setBorderPainted(false);

			acessar = new JButton();
			acessar.setText("<html><font size = 4>Acessar</font></html>");
			acessar.setBounds(1150, 70, 100, 30);
			acessar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
			acessar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			acessar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
			acessar.setBackground(Color.gray);
			acessar.setBorderPainted(false);

			panel.add(enderecoT);
			panel.add(endereco);
			panel.add(senhaT);
			panel.add(senha);
			panel.add(cadastrar);
			panel.add(acessar);

			// EventoLogin handler1 = new EventoLogin(this);
			loginEvento handler1 = new loginEvento();
			acessar.addActionListener(handler1);
			// handler1.setAcessar(acessar);

			cadastrarEvento handler2 = new cadastrarEvento();
			// EventoCadastrar handler2 = new EventoCadastrar(this);
			cadastrar.addActionListener(handler2);
			// handler2.setCadastrar(cadastrar);
		}
		arte = new JButton();
		arte.setText("<html><font color #FFFFFF size = 4>Arte e Fotografia</font></html>");
		arte.setBounds(0, 159, 200, 32);
		arte.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		arte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		arte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		arte.setBackground(Color.white);

		ajuda = new JButton();
		ajuda.setText("<html><font color #FFFFFF size = 4>Auto-ajuda</font></html>");
		ajuda.setBounds(0, 191, 200, 32);
		ajuda.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		ajuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		ajuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		ajuda.setBackground(Color.white);

		biografia = new JButton();
		biografia.setText("<html><font color #FFFFFF size = 4>Biografia</font></html>");
		biografia.setBounds(0, 223, 200, 32);
		biografia.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		biografia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		biografia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		biografia.setBackground(Color.white);

		exatas = new JButton();
		exatas.setText("<html><font color #FFFFFF size = 4>Ciências Exatas</font></html>");
		exatas.setBounds(0, 255, 200, 32);
		exatas.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		exatas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		exatas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		exatas.setBackground(Color.white);

		humanas = new JButton();
		humanas.setText("<html><font color #FFFFFF size = 4>Ciências Humanas</font></html>");
		humanas.setBounds(0, 287, 200, 32);
		humanas.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		humanas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		humanas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		humanas.setBackground(Color.white);

		comidas = new JButton();
		comidas.setText("<html><font color #FFFFFF size = 4>Comidas e Bebidas</font></html>");
		comidas.setBounds(0, 319, 200, 32);
		comidas.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		comidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		comidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		comidas.setBackground(Color.white);

		direito = new JButton();
		direito.setText("<html><font color #FFFFFF size = 4>Direito</font></html>");
		direito.setBounds(0, 351, 200, 32);
		direito.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		direito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		direito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		direito.setBackground(Color.white);

		educacao = new JButton();
		educacao.setText("<html><font color #FFFFFF size = 4>Educação</font></html>");
		educacao.setBounds(0, 383, 200, 32);
		educacao.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		educacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		educacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		educacao.setBackground(Color.white);

		historia = new JButton();
		historia.setText("<html><font color #FFFFFF size = 4>História</font></html>");
		historia.setBounds(0, 415, 200, 32);
		historia.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		historia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		historia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		historia.setBackground(Color.white);

		estrangeiro = new JButton();
		estrangeiro.setText("<html><font color #FFFFFF size = 4>Literatura Estrangeira</font></html>");
		estrangeiro.setBounds(0, 447, 200, 32);
		estrangeiro.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		estrangeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		estrangeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		estrangeiro.setBackground(Color.white);

		infantil = new JButton();
		infantil.setText("<html><font color #FFFFFF size = 4>Literatura Infanto-juvenil</font></html>");
		infantil.setBounds(0, 479, 200, 40);
		infantil.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		infantil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		infantil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		infantil.setBackground(Color.white);

		nacional = new JButton();
		nacional.setText("<html><font color #FFFFFF size = 4>Literatura Nacional</font></html>");
		nacional.setBounds(0, 519, 200, 32);
		nacional.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		nacional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		nacional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		nacional.setBackground(Color.white);

		negocios = new JButton();
		negocios.setText("<html><font color #FFFFFF size = 4>Negócios e Dinheiro</font></html>");
		negocios.setBounds(0, 551, 200, 32);
		negocios.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		negocios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		negocios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		negocios.setBackground(Color.white);

		hq = new JButton();
		hq.setText("<html><font color #FFFFFF size = 4>Quadrinhos</font></html>");
		hq.setBounds(0, 583, 200, 32);
		hq.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		hq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		hq.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		hq.setBackground(Color.white);

		saude = new JButton();
		saude.setText("<html><font color #FFFFFF size = 4>Saúde</font></html>");
		saude.setBounds(0, 615, 200, 32);
		saude.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		saude.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		saude.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		saude.setBackground(Color.white);

		tecnologia = new JButton();
		tecnologia.setText("<html><font color #FFFFFF size = 4>Tecnologia</font></html>");
		tecnologia.setBounds(0, 647, 200, 32);
		tecnologia.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		tecnologia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		tecnologia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		tecnologia.setBackground(Color.white);

		turismo = new JButton();
		turismo.setText("<html><font color #FFFFFF size = 4>Turismo</font></html>");
		turismo.setBounds(0, 679, 200, 32);
		turismo.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		turismo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		turismo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		turismo.setBackground(Color.white);

		panel.add(turismo);
		panel.add(tecnologia);
		panel.add(saude);
		panel.add(hq);
		panel.add(negocios);
		panel.add(nacional);
		panel.add(infantil);
		panel.add(estrangeiro);
		panel.add(historia);
		panel.add(educacao);
		panel.add(direito);
		panel.add(comidas);
		panel.add(humanas);
		panel.add(exatas);
		panel.add(biografia);
		panel.add(ajuda);
		panel.add(arte);
		panel.add(label);
		panel.add(carrinho);
		panel.add(construtorImage);

		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Handler para eventos registradores

		EventosCategorias handler3 = new EventosCategorias(this, user, usuarioLogado, itensCarrinho);
		arte.addActionListener(handler3);
		ajuda.addActionListener(handler3);
		biografia.addActionListener(handler3);
		exatas.addActionListener(handler3);
		humanas.addActionListener(handler3);
		comidas.addActionListener(handler3);
		direito.addActionListener(handler3);
		educacao.addActionListener(handler3);
		historia.addActionListener(handler3);
		estrangeiro.addActionListener(handler3);
		infantil.addActionListener(handler3);
		nacional.addActionListener(handler3);
		negocios.addActionListener(handler3);
		hq.addActionListener(handler3);
		saude.addActionListener(handler3);
		tecnologia.addActionListener(handler3);
		turismo.addActionListener(handler3);
		handler3.setArte(arte);
		handler3.setAjuda(ajuda);
		handler3.setBiografia(biografia);
		handler3.setExatas(exatas);
		handler3.setHumanas(humanas);
		handler3.setComidas(comidas);
		handler3.setDireito(direito);
		handler3.setEducacao(educacao);
		handler3.setHistoria(historia);
		handler3.setEstrangeiro(estrangeiro);
		handler3.setInfantil(infantil);
		handler3.setNacional(nacional);
		handler3.setNegocios(negocios);
		handler3.setHq(hq);
		handler3.setSaude(saude);
		handler3.setTecnologia(tecnologia);
		handler3.setTurismo(turismo);

		CarrinhoEvento handler4 = new CarrinhoEvento();
		carrinho.addActionListener(handler4);
	}

	private class nextEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == next) {
				PaginaInicial pgi = new PaginaInicial(page + 1, u, l, carrinhoLivros, cat);
				PaginaInicial.this.dispose();
			}
		}
	}

	private class retEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == ret) {
				PaginaInicial pgi = new PaginaInicial(page - 1, u, l, carrinhoLivros, cat);
				PaginaInicial.this.dispose();
			}

		}

	}

	private class cadastrarEvento implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == cadastrar) {
				CadastroCliente cdc = new CadastroCliente(u, l, carrinhoLivros.size());
				PaginaInicial.this.dispose();
			}
		}
	}

	private class loginEvento implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == acessar) {
				Usuario user = null;
				user = Cadastrar.pegarUser(endereco.getText(), senha.getPassword());
				if (user != null) {
					PaginaInicial pgi = new PaginaInicial(0, user, true, new ArrayList<Item>(), " ");
					PaginaInicial.this.dispose();
				}
			}
		}
	}

	private class CarrinhoEvento implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == carrinho) {
				if (carrinhoLivros.size() != 0) {
					Carrinho crr = new Carrinho(0, u, l, carrinhoLivros);
					PaginaInicial.this.dispose();
				}
			}
		}
	}

	private class cadsAdminEvento implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == cadsAdmin) {
				CadastroAdm cda = new CadastroAdm(u, l, carrinhoLivros);
				PaginaInicial.this.dispose();
			}
		}
	}

	private class cadsLivroEvento implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == cadsLivro) {
				CadastroLivro cdl = new CadastroLivro(u, l);
				PaginaInicial.this.dispose();
			}
		}
	}

	private class livroEvento implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (l == true) {
				if (event.getSource() == livro1) {
					int index = 0 + (3 * page);
					Livro livro = livros.get(index);
					boolean flag = true;
					for (Item i : carrinhoLivros) {
						if (i.getLivro().equals(livro)) {
							i.setQuantidade(i.getQuantidade() + 1);
							flag = false;
						}
					}

					if (flag) {
						Item item = new Item();
						item.setLivro(livros.get(index));
						item.setQuantidade(1);
						item.setValorUnit(livros.get(index).getValorUnit());
						carrinhoLivros.add(item);
					}

					Carrinho crr = new Carrinho(0, u, l, carrinhoLivros);
				} else if (event.getSource() == livro2) {
					int index = 1 + (3 * page);
					Livro livro = livros.get(index);
					boolean flag = true;
					for (Item i : carrinhoLivros) {
						if (i.getLivro().equals(livro)) {
							i.setQuantidade(i.getQuantidade() + 1);
							flag = false;
						}
					}

					if (flag) {
						Item item = new Item();
						item.setLivro(livros.get(index));
						item.setQuantidade(1);
						item.setValorUnit(livros.get(index).getValorUnit());
						carrinhoLivros.add(item);
					}

					Carrinho crr = new Carrinho(0, u, l, carrinhoLivros);
				} else if (event.getSource() == livro3) {
					int index = 2 + (3 * page);
					Livro livro = livros.get(index);
					boolean flag = true;
					for (Item i : carrinhoLivros) {
						if (i.getLivro().equals(livro)) {
							i.setQuantidade(i.getQuantidade() + 1);
							flag = false;
						}
					}

					if (flag) {
						Item item = new Item();
						item.setLivro(livros.get(index));
						item.setQuantidade(1);
						item.setValorUnit(livros.get(index).getValorUnit());
						carrinhoLivros.add(item);
					}

					Carrinho crr = new Carrinho(0, u, l, carrinhoLivros);
				} else if (event.getSource() == livro4) {
					int index = 3 + (3 * page);
					Livro livro = livros.get(index);
					boolean flag = true;
					for (Item i : carrinhoLivros) {
						if (i.getLivro().equals(livro)) {
							i.setQuantidade(i.getQuantidade() + 1);
							flag = false;
						}
					}

					if (flag) {
						Item item = new Item();
						item.setLivro(livros.get(index));
						item.setQuantidade(1);
						item.setValorUnit(livros.get(index).getValorUnit());
						carrinhoLivros.add(item);
					}

					Carrinho crr = new Carrinho(0, u, l, carrinhoLivros);
				} else if (event.getSource() == livro5) {
					int index = 4 + (3 * page);
					Livro livro = livros.get(index);
					boolean flag = true;
					for (Item i : carrinhoLivros) {
						if (i.getLivro().equals(livro)) {
							i.setQuantidade(i.getQuantidade() + 1);
							flag = false;
						}
					}

					if (flag) {
						Item item = new Item();
						item.setLivro(livros.get(index));
						item.setQuantidade(1);
						item.setValorUnit(livros.get(index).getValorUnit());
						carrinhoLivros.add(item);
					}

					Carrinho crr = new Carrinho(0, u, l, carrinhoLivros);
				} else if (event.getSource() == livro6) {
					int index = 5 + (3 * page);
					Livro livro = livros.get(index);
					boolean flag = true;
					for (Item i : carrinhoLivros) {
						if (i.getLivro().equals(livro)) {
							i.setQuantidade(i.getQuantidade() + 1);
							flag = false;
						}
					}

					if (flag) {
						Item item = new Item();
						item.setLivro(livros.get(index));
						item.setQuantidade(1);
						item.setValorUnit(livros.get(index).getValorUnit());
						carrinhoLivros.add(item);
					}

					Carrinho crr = new Carrinho(0, u, l, carrinhoLivros);
				}
			} else {
				CadastroCliente cdc = new CadastroCliente(null, l, carrinhoLivros.size());
			}
			PaginaInicial.this.dispose();
		}
	}

}
