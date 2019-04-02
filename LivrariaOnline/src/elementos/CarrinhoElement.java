package elementos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CarrinhoElement {

	private static  int codigo;
	private static Date dataCompra;
	private static  float valorTotal;
	private static  ArrayList<Livro> livros = new ArrayList<Livro>();

	public static  void addItem(Livro livro) {
		livros.add(livro);
	}

	public static  String listaItens() {
		return (Arrays.toString(livros.toArray()));
	}

	public static  Item pegarItem(int indice) {
		return (livros.get(indice));
	}

	public static  void removerItem(int indice) {
		livros.remove(indice);
	}

	public static  int getCodigo() {
		return codigo;
	}

	public static  void setCodigo(int codigo) {
		codigo = codigo;
	}

	public static  Date getDataCompra() {
		return dataCompra;
	}

	public static  void setDataCompra(Date dataCompra) {
		dataCompra = dataCompra;
	}

	public static  float getValorTotal() {
		return valorTotal;
	}

	public static  void setValorTotal(float valorTotal) {
		valorTotal = valorTotal;
	}

	public  static List<Livro> getItens() {
		return livros;
	}

	public static  void setItens(ArrayList<Livro> itens) {
		livros = itens;
	}

}
