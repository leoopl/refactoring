package elementos;

public class Item{
	
	private int quantidade;
	private float valorUnit;
	private Livro livro;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(float valorUnit) {
		this.valorUnit = valorUnit;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	@Override
	public String toString() {
		return "Item [quantidade=" + quantidade + ", valorUnit=" + valorUnit + ", livro=" + livro + "]";
	}
	
	
	
}
