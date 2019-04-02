package interfaces;

import java.util.ArrayList;

import javax.swing.JFrame;

import elementos.Item;
import elementos.Usuario;
import funcionalidades.Cadastrar;

public class Inicializador extends JFrame {

	public static void main(String[] args) {
		
		//Inicializando as categorias
		Usuario admin1 = new Usuario("Lauren","camz","lauren@5h.com");
		Usuario admin2 = new Usuario("Caio","1234","caio");
		Cadastrar.setListaAdmin(admin1);
		Cadastrar.setListaAdmin(admin2);
		
		Cadastrar.cadastrarLivro("livro1", "autor", "estrangeiro", "editora", 40.0, "livro1.jpg", 1);
		Cadastrar.cadastrarLivro("livro2", "autor", "estrangeiro", "editora", 40.0, "livro1.jpg", 1);
		Cadastrar.cadastrarLivro("livro3", "autor", "estrangeiro", "editora", 40.0, "livro2.jpg", 1);
		Cadastrar.cadastrarLivro("livro4", "autor", "estrangeiro", "editora", 40.0, "livro2.jpg", 1);
		Cadastrar.cadastrarLivro("livro5", "autor", "estrangeiro", "editora", 40.0, "livro2.jpg", 1);
		Cadastrar.cadastrarLivro("livro6", "autor", "estrangeiro", "editora", 40.0, "livro1.jpg", 1);
		Cadastrar.cadastrarLivro("livro7", "autor", "estrangeiro", "editora", 40.0, "livro2.jpg", 1);
		Cadastrar.cadastrarLivro("livro8", "autor", "estrangeiro", "editora", 40.0, "livro1.jpg", 1);
		
		//CadastroAdm cda = new CadastroAdm();
		//CadastroCliente cc = new CadastroCliente();
		PaginaInicial pgi = new PaginaInicial(0, null, false, new ArrayList<Item>(), "");
		//Carrinho car = new Carrinho(0);
		// Entrega ent = new Entrega();
		// Cartao ctc = new Cartao(3,40.80);
		// CadastroLivro cdl = new CadastroLivro();
	}

}
