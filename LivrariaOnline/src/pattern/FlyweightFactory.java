package pattern;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class FlyweightFactory {
	
	protected ArrayList<ImageIcon> flyweights;
	
	public enum Sprite {
		LIVRO_1, LIVRO_2, LOGO, ICONE, FUNDO_PRINCIPAL, CADASTRO, CARRINHO 
	}
	
	public FlyweightFactory() {
		flyweights = new ArrayList<ImageIcon>();
		flyweights.add(new ImageIcon("livro1.png"));
		flyweights.add(new ImageIcon("livro2.png"));
		flyweights.add(new ImageIcon("logomarca.png"));
		flyweights.add(new ImageIcon("icone.png"));
		flyweights.add(new ImageIcon("fundoPrincipal.png"));
		flyweights.add(new ImageIcon("cadastro.png"));
		flyweights.add(new ImageIcon("carrinho.png"));
	}
	
	public ImageIcon getFlyweight(Sprite jogador) {
		switch (jogador) {
		case LIVRO_1:
			return flyweights.get(0);			
		case LIVRO_2:
			return flyweights.get(1);
		case LOGO:
			return flyweights.get(2);
		case ICONE:
			return flyweights.get(3);
		case FUNDO_PRINCIPAL:
			return flyweights.get(4);
		case CADASTRO:
			return flyweights.get(5);
		default:
			return flyweights.get(6);
		}
	}

}
