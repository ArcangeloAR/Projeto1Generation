package pacote;

public class ProdutoNaoPerecivel extends DoacaoProduto {
	
	private String tipo;
	
	
	public ProdutoNaoPerecivel(String nome, int quantidade, String tipo) {
		super(nome, quantidade);
		this.setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}