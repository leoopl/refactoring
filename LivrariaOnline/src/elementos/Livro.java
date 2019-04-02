package elementos;

import enums.CategoriaLivro;

public class Livro extends Item{

	private int codigo;
	private String titulo;
	private String autor;
	private String editora;
	private double preco;
	private String imagem;
	private int estoque;
	private CategoriaLivro categoria;

	
	public Livro(int codigo, String titulo, String autor, String categoria, String editora, double preco, String imagem, int estoque) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
		this.imagem = imagem;
		this.estoque = estoque;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public CategoriaLivro getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaLivro categoria) {
		this.categoria = categoria;
	}
}
