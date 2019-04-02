package interfaces;

import java.awt.Color;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import elementos.Background;
import elementos.Cadastro;
import elementos.Item;
import elementos.Usuario;
import pattern.FlyweightFactory.Sprite;
import utils.EventosCadastro;

public class CadastroAdm extends JFrame implements Cadastro {

	private JPanel panel;
	private JLabel identificacao, nomeT, sobrenomeT, emailT, senhaT;
	private JTextField nome, sobrenome, email;
	private JPasswordField senha;
	private JButton voltar, finalizar;
	Background construtorImage = null;

	public CadastroAdm(Usuario user,boolean UsuarioLogado, List<Item> livrosCarrinho) {
		super("Cadastro do Administrador - Livraria Online");
		ImageIcon icone = PaginaInicial.factory.getFlyweight(Sprite.ICONE);
		setIconImage(icone.getImage());
		construtorImage = new Background("fundoPrincipal.png");
		construtorImage.setSize(2000, 1500);

		panel = new JPanel();
		panel.setLayout(null);

		ImageIcon logomarca = PaginaInicial.factory.getFlyweight(Sprite.LOGO);
		JLabel label = new JLabel(logomarca);
		label.setBounds(20, 10, 650, 65);

		identificacao = new JLabel();
		identificacao.setText("<html><font color = #FFFFFF size = 7>Identificação</font></html>");
		identificacao.setBounds(125, 160, 250, 60);

		nomeT = new JLabel();
		nomeT.setText("<html><font color = #FFFFFF size = 5>Nome*</font></html>");
		nomeT.setBounds(125, 200, 250, 60);

		nome = new JTextField();
		nome.setBounds(125, 250, 350, 35);

		sobrenomeT = new JLabel();
		sobrenomeT.setText("<html><font color = #FFFFFF size = 5>Sobrenome*</font></html>");
		sobrenomeT.setBounds(625, 200, 250, 60);

		sobrenome = new JTextField();
		sobrenome.setBounds(625, 250, 350, 35);

		senhaT = new JLabel();
		senhaT.setText("<html><font color = #FFFFFF size = 5>Senha*</font></html>");
		senhaT.setBounds(1025, 200, 250, 60);

		senha = new JPasswordField();
		senha.setBounds(1025, 250, 200, 35);

		emailT = new JLabel();
		emailT.setText("<html><font color = #FFFFFF size = 5>E-mail*</font></html>");
		emailT.setBounds(125, 300, 250, 60);

		email = new JTextField();
		email.setBounds(125, 355, 350, 35);

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

		panel.add(identificacao);
		panel.add(voltar);
		panel.add(finalizar);
		panel.add(nomeT);
		panel.add(nome);
		panel.add(sobrenome);
		panel.add(sobrenomeT);
		panel.add(senha);
		panel.add(senhaT);
		panel.add(email);
		panel.add(emailT);
		panel.add(label);
		panel.add(construtorImage);
		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Handler para eventos registradores
		EventosCadastro handler1 = new EventosCadastro(this, true,user,UsuarioLogado, livrosCarrinho);
		voltar.addActionListener(handler1);
		finalizar.addActionListener(handler1);

		handler1.setFinalizar(finalizar);
		handler1.setVoltar(voltar);

	}

	public Usuario getUserInfo() {
		String userName = nome.getText();
		String lastName = sobrenome.getText();
		String userEmail = email.getText();
		String password = senha.getPassword().toString();

		Usuario admin = new Usuario(userName + " " + lastName, password, userEmail);

		return admin;
	}

}
