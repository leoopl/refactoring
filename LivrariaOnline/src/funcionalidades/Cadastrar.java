package funcionalidades;

import java.util.ArrayList;
import java.util.List;

import elementos.Categoria;
import elementos.Livro;
import elementos.Usuario;
import enums.CategoriaLivro;

public class Cadastrar {
	static List<Usuario> listaClientes = new ArrayList<Usuario>();
	static List<Usuario> listaAdmin = new ArrayList<Usuario>();
	static ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	private static Categoria arte = new Categoria();
	private static Categoria ajuda = new Categoria();
	private static Categoria biografia = new Categoria();
	private static Categoria exatas = new Categoria();
	private static Categoria educacao = new Categoria();
	private static Categoria humanas = new Categoria();
	private static Categoria comidas = new Categoria();
	private static Categoria direito = new Categoria();
	private static Categoria historia = new Categoria();
	private static Categoria estrangeiro = new Categoria();
	private static Categoria infantil = new Categoria();
	private static Categoria nacional = new Categoria();
	private static Categoria negocios = new Categoria();
	private static Categoria hq = new Categoria();
	private static Categoria saude = new Categoria();
	private static Categoria tecnologia = new Categoria();
	private static Categoria turismo = new Categoria();

	static int codigoLivro = 0;

	public static void cadastrarCliente(Usuario cliente) {
		listaClientes.add(cliente);
	}

	public static void cadastrarLivro(String titulo, String autor, String categoria, String editora, double d,
			String imagem, int estoque) {

		Livro livro = new Livro(codigoLivro, titulo, autor, categoria, editora, d, imagem, estoque);
		if (categoria.equals("arte")) {
			arte.addLivros(livro);
		} else if (categoria.equals("ajuda")) {
			ajuda.addLivros(livro);
		} else if (categoria.equals("biografia")) {
			biografia.addLivros(livro);
		} else if (categoria.equals("exatas")) {
			exatas.addLivros(livro);
		} else if (categoria.equals("humanas")) {
			humanas.addLivros(livro);
		} else if (categoria.equals("comidas")) {
			comidas.addLivros(livro);
		} else if (categoria.equals("direito")) {
			direito.addLivros(livro);
		} else if (categoria.equals("educacao")) {
			educacao.addLivros(livro);
		} else if (categoria.equals("historia")) {
			historia.addLivros(livro);
		} else if (categoria.equals("estrangeiro")) {
			estrangeiro.addLivros(livro);
		} else if (categoria.equals("infantil")) {
			infantil.addLivros(livro);
		} else if (categoria.equals("nacional")) {
			nacional.addLivros(livro);
		} else if (categoria.equals("negocios")) {
			negocios.addLivros(livro);
		} else if (categoria.equals("hq")) {
			hq.addLivros(livro);
		} else if (categoria.equals("saude")) {
			saude.addLivros(livro);
		} else if (categoria.equals("tecnologia")) {
			tecnologia.addLivros(livro);
		} else if (categoria.equals("turismo")) {
			turismo.addLivros(livro);
		}
		listaLivros.add(livro);
		codigoLivro++;
	}

	public static List<Livro> listarLivros() {
		return listaLivros;
	}

	public static List<Livro> listarLivrosPorTipo(CategoriaLivro categoria) {

		List<Livro> livros = new ArrayList<Livro>();

		for (Livro l : listaLivros) {
			if (l.getCategoria() == categoria) {
				livros.add(l);
			} else if (categoria == CategoriaLivro.TUDO) {
				livros.add(l);
			}
		}
		return livros;
	}

	public static void excluirLivro(String nome) {
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getTitulo().equals(nome)) {
				listaLivros.remove(i);
				break;
			}
		}
	}

	public static Usuario pegarUser(String email, char[] senha) {
		Usuario user = null;
		boolean pegou = false;
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getEmail().equals(email)) {

				if (senha.length != listaClientes.get(i).getSenha().length()) {
					break;
				}

				boolean flag = false;
				char[] userPass = listaClientes.get(i).getSenha().toCharArray();
				for (int j = 0; j < senha.length; j++) {
					if (senha[j] != userPass[j]) {
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}

				user = listaClientes.get(i);
				pegou = true;
				break;
			}
		}
		if (pegou != true) {
			for (int i = 0; i < listaAdmin.size(); i++) {
				if (listaAdmin.get(i).getEmail().contains(email)) {
					if (senha.length != listaAdmin.get(i).getSenha().length()) {
						break;
					}

					boolean flag = false;
					char[] adminPass = listaAdmin.get(i).getSenha().toCharArray();
					for (int j = 0; j < senha.length; j++) {
						if (senha[j] != adminPass[j]) {
							flag = true;
							break;
						}
					}
					if (flag) {
						break;
					}
					user = listaAdmin.get(i);
					pegou = true;
					break;
				}
			}
		}
		return (user);
	}

	public static List<Usuario> getListaClientes() {
		return listaClientes;
	}

	public static void setListaClientes(List<Usuario> listaClientes) {
		Cadastrar.listaClientes = listaClientes;
	}

	public static ArrayList<Livro> getListaLivros(String categoria) {
		if (categoria.equals("arte")) {
			return (getArte());
		} else if (categoria.equals("ajuda")) {
			return (getAjuda());
		} else if (categoria.equals("biografia")) {
			return (getBiografia());
		} else if (categoria.equals("exatas")) {
			return (getExatas());
		} else if (categoria.equals("humanas")) {
			return (getHumanas());
		} else if (categoria.equals("comidas")) {
			return (getComidas());
		} else if (categoria.equals("direito")) {
			return (getDireito());
		} else if (categoria.equals("educacao")) {
			return (getEducacao());
		} else if (categoria.equals("historia")) {
			return (getHistoria());
		} else if (categoria.equals("estrangeiro")) {
			return (getEstrageiro());
		} else if (categoria.equals("infantil")) {
			return (getInfantil());
		} else if (categoria.equals("nacional")) {
			return (getNacional());
		} else if (categoria.equals("negocios")) {
			return (getNegocios());
		} else if (categoria.equals("hq")) {
			return (getHq());
		} else if (categoria.equals("saude")) {
			return (getSaude());
		} else if (categoria.equals("tecnologia")) {
			return (getTecnologia());
		} else if (categoria.equals("turismo")) {
			return (getTurismo());
		}
		return (setLivros());
	}

	public static void setListaLivros(ArrayList<Livro> listaLivros) {
		Cadastrar.listaLivros = listaLivros;
	}

	public static ArrayList<Livro> setLivros() {
		return (listaLivros);
	}

	public static ArrayList<Livro> getArte() {
		return arte.getLivros();
	}

	public static ArrayList<Livro> getAjuda() {
		return ajuda.getLivros();
	}

	public static ArrayList<Livro> getBiografia() {
		return biografia.getLivros();
	}

	public static ArrayList<Livro> getExatas() {
		return exatas.getLivros();
	}

	public static ArrayList<Livro> getEducacao() {
		return educacao.getLivros();
	}

	public static ArrayList<Livro> getHumanas() {
		return humanas.getLivros();
	}

	public static ArrayList<Livro> getComidas() {
		return comidas.getLivros();
	}

	public static ArrayList<Livro> getDireito() {
		return direito.getLivros();
	}

	public static ArrayList<Livro> getHistoria() {
		return historia.getLivros();
	}

	public static ArrayList<Livro> getEstrageiro() {
		return estrangeiro.getLivros();
	}

	public static ArrayList<Livro> getInfantil() {
		return infantil.getLivros();
	}

	public static ArrayList<Livro> getNacional() {
		return nacional.getLivros();
	}

	public static ArrayList<Livro> getNegocios() {
		return negocios.getLivros();
	}

	public static ArrayList<Livro> getHq() {
		return hq.getLivros();
	}

	public static ArrayList<Livro> getSaude() {
		return saude.getLivros();
	}

	public static ArrayList<Livro> getTecnologia() {
		return tecnologia.getLivros();
	}

	public static ArrayList<Livro> getTurismo() {
		return turismo.getLivros();
	}

	public static int getCodigoLivro() {
		return codigoLivro;
	}

	public static void setCodigoLivro(int codigoLivro) {
		Cadastrar.codigoLivro = codigoLivro;
	}

	public static List<Usuario> getListaAdmin() {
		return listaAdmin;
	}

	public static void setListaAdmin(Usuario user) {
		Cadastrar.listaAdmin.add(user);
	}

}
