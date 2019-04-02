package pattern;

import elementos.Categoria;
import elementos.Livro;

public class Art implements Strategy {
	
	private static Categoria arte = new Categoria();

	public void addtype(Livro livro) {
		arte.addLivros(livro);
		
	}
}
