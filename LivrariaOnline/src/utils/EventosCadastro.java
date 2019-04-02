package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import elementos.Cadastro;
import elementos.Item;
import elementos.Usuario;
import funcionalidades.Cadastrar;
import interfaces.CadastroAdm;
import interfaces.CadastroCliente;
import interfaces.PaginaInicial;

public class EventosCadastro implements ActionListener {

	private CadastroAdm cadastroAdm;
	private CadastroCliente cadastroCliente;
	private boolean admin, login;
	private JButton finalizar;
	private JButton voltar;
	private Usuario user;
	private List<Item> carrinho;
	private double itens;

	public EventosCadastro(Cadastro cadastroScreen, boolean admin, Usuario user, boolean login, List<Item> carrinho) {

		this.carrinho = carrinho;
		if (admin) {
			cadastroAdm = (CadastroAdm) cadastroScreen;
		} else {
			cadastroCliente = (CadastroCliente) cadastroScreen;
		}

		this.admin = admin;
		this.user = user;
		this.login = login;
		this.itens = itens;
	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == finalizar) {
			if (admin) {
				user = cadastroAdm.getUserInfo();
				Cadastrar.setListaAdmin(user);
				PaginaInicial pgi = new PaginaInicial(0, user, login, carrinho, " ");
				cadastroAdm.setVisible(false);
			} else {
				user = cadastroCliente.getUserInfo();
				Cadastrar.cadastrarCliente(user);
				PaginaInicial pgi = new PaginaInicial(0, user, login, carrinho, " ");
				cadastroCliente.setVisible(false);
			}
		} else if (event.getSource() == voltar) {

			PaginaInicial pgi = new PaginaInicial(0, user, login, carrinho, " ");

			if (admin) {
				cadastroAdm.setVisible(false);
			} else {
				cadastroCliente.setVisible(false);
			}

		}

	}

	public void setFinalizar(JButton finalizar) {
		this.finalizar = finalizar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

}
