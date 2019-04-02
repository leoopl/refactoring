package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import elementos.Item;
import elementos.Usuario;
import interfaces.Cartao;
import interfaces.PaginaInicial;

public class EventosCarrinhoDeCompras implements ActionListener {

	private JButton continuar, adicionar;
	private Usuario user;
	private boolean login;
	private List<Item> carrinhoCompras;
	private JFrame carrinho;
	private JComboBox preco1;
	private double p1, preco;
	private JRadioButton pP1, pP2, pE1, pE2;

	public EventosCarrinhoDeCompras(JFrame carrinho, JRadioButton pP1, JRadioButton pP2, JRadioButton pE1,
			JRadioButton pE2, JComboBox preco1, double p1, Usuario u, boolean l, List<Item> carrinhoCompras) {
		this.user = u;
		this.login = l;
		this.carrinhoCompras = carrinhoCompras;
		this.carrinho = carrinho;
		this.preco1 = preco1;
		this.pP1 = pP1;
		this.pP2 = pP2;
		this.pE1 = pE1;
		this.pE2 = pE2;
		this.p1 = p1;

	}

	public void actionPerformed(ActionEvent event) {

		preco = carrinhoCompras.size() + (p1 * (preco1.getSelectedIndex()));
		System.out.println(preco);
		if (event.getSource() == adicionar) {
			PaginaInicial pgi = new PaginaInicial(0, user, login, carrinhoCompras, "");
			carrinho.setVisible(false);
		} else if (event.getSource() == continuar) {
			if (pP1.isSelected() == true) {
				preco = preco + 25.8;
			} else {
				preco = preco + 7.9;
			}
			if (pE1.isSelected() == true) {
				Cartao crt = Cartao.getIntance(1, preco, user, login, carrinhoCompras);
			} else {
				Cartao crt = Cartao.getIntance(2, preco, user, login, carrinhoCompras);
			}
			carrinho.setVisible(false);
		}

	}

	public void setContinuar(JButton continuar) {
		this.continuar = continuar;
	}

	public void setAdicionar(JButton adicionar) {
		this.adicionar = adicionar;
	}

}
