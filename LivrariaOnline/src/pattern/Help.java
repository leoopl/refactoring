package pattern;

import elementos.Categoria;
import elementos.Livro;

public class Help implements Strategy {
	
	private static Categoria ajuda = new Categoria();

	@Override
	public void addtype(Livro livro) {
		ajuda.addLivros(livro);
		
	}

}
