package elementos;

import java.util.ArrayList;
import java.util.Arrays;

public class Categoria {

	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public void addLivros(Livro l){
		livros.add(l);
	}
	public String listaLivros(){
		return(Arrays.toString(livros.toArray()));
	}
	public Livro pegarLivro(int indice){
		return(livros.get(indice));
	}
	public void removerLivro(int indice){
		livros.remove(indice);
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
}
