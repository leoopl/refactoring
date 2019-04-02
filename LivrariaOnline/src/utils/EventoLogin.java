package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import interfaces.PaginaInicial;

public class EventoLogin implements ActionListener {

	private JButton acessar;

	public EventoLogin(PaginaInicial paginaInicial) {
	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == acessar) {
			/*
			 * TODO 
			 * Coletar dados da PaginaInicial e chamá-la novamente passando um usuario logado.
			 */
		}

	}
	
	public void setAcessar(JButton acessar){
		this.acessar = acessar;
	}

}
