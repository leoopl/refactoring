package interfaces;

import java.awt.Color;
import java.util.ArrayList;

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

public class CadastroCliente extends JFrame implements Cadastro {

	private JPanel panel;
	private JLabel identificacao, nomeT, sobrenomeT, emailT, senhaT, cpfT, dataNascT;
	private JLabel cepT, enderecoT, numeroT, complementoT, bairroT, estadoT, cidadeT;
	private JTextField nome, sobrenome, email, cpf, dataNascimento;
	private JTextField cep, endereco, numero, complemento, bairro, estado, cidade;
	private JPasswordField senha;
	private JButton voltar, finalizar;
	Background construtorImage = null;

	public CadastroCliente(Usuario user, boolean l, double i) {
		super("Cadastro do Cliente - Livraria Online");
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

		cpfT = new JLabel();
		cpfT.setText("<html><font color = #FFFFFF size = 5>Número do CPF*</font></html>");
		cpfT.setBounds(625, 300, 250, 60);

		cpf = new JTextField();
		cpf.setBounds(625, 355, 350, 35);

		dataNascT = new JLabel();
		dataNascT.setText("<html><font color = #FFFFFF size = 5>Data de nascimento*(DD/MM/AAAA)</font></html>");
		dataNascT.setBounds(1025, 300, 250, 60);

		dataNascimento = new JTextField();
		dataNascimento.setBounds(1025, 355, 200, 35);

		enderecoT = new JLabel();
		enderecoT.setText("<html><font color = #FFFFFF size = 5>Endereço*</font></html>");
		enderecoT.setBounds(125, 405, 250, 60);

		endereco = new JTextField();
		endereco.setBounds(125, 455, 350, 35);

		numeroT = new JLabel();
		numeroT.setText("<html><font color = #FFFFFF size = 5>Número*</font></html>");
		numeroT.setBounds(625, 405, 250, 60);

		numero = new JTextField();
		numero.setBounds(625, 455, 100, 35);

		complementoT = new JLabel();
		complementoT.setText("<html><font color = #FFFFFF size = 5>Complemento</font></html>");
		complementoT.setBounds(800, 405, 250, 60);

		complemento = new JTextField();
		complemento.setBounds(800, 455, 425, 35);

		bairroT = new JLabel();
		bairroT.setText("<html><font color = #FFFFFF size = 5>Bairro*</font></html>");
		bairroT.setBounds(125, 505, 250, 60);

		bairro = new JTextField();
		bairro.setBounds(125, 555, 350, 35);

		cidadeT = new JLabel();
		cidadeT.setText("<html><font color = #FFFFFF size = 5>Cidade*</font></html>");
		cidadeT.setBounds(625, 505, 250, 60);

		cidade = new JTextField();
		cidade.setBounds(625, 555, 150, 35);

		estadoT = new JLabel();
		estadoT.setText("<html><font color = #FFFFFF size = 5>Estado*</font></html>");
		estadoT.setBounds(880, 505, 250, 60);

		estado = new JTextField();
		estado.setBounds(880, 555, 100, 35);

		cepT = new JLabel();
		cepT.setText("<html><font color = #FFFFFF size = 5>CEP*</font></html>");
		cepT.setBounds(1080, 505, 250, 60);

		cep = new JTextField();
		cep.setBounds(1080, 555, 150, 35);

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
		panel.add(cpf);
		panel.add(cpfT);
		panel.add(dataNascimento);
		panel.add(dataNascT);
		panel.add(endereco);
		panel.add(enderecoT);
		panel.add(numero);
		panel.add(numeroT);
		panel.add(complemento);
		panel.add(complementoT);
		panel.add(bairro);
		panel.add(bairroT);
		panel.add(cidade);
		panel.add(cidadeT);
		panel.add(estado);
		panel.add(estadoT);
		panel.add(cep);
		panel.add(cepT);
		panel.add(label);
		panel.add(construtorImage);

		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Handler para eventos registradores
		EventosCadastro handler1 = new EventosCadastro(this, false, user, l, new ArrayList<Item>());
		voltar.addActionListener(handler1);
		finalizar.addActionListener(handler1);

		handler1.setFinalizar(finalizar);
		handler1.setVoltar(voltar);

	}

	@Override
	public Usuario getUserInfo() {
		Usuario user = new Usuario(nome.getText() + " " + sobrenome.getText(), senha.getPassword().toString(),
				email.getText(), cpf.getText(), dataNascimento.getText(), cep.getText(), endereco.getText(),
				complemento.getText(), numero.getText(), bairro.getText(), estado.getText(), cidade.getText(), "");

		return user;
	}

}
