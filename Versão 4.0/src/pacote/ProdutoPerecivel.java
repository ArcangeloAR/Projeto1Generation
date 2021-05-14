package pacote;

public class ProdutoPerecivel extends DoacaoProduto{
	
	private String dataVencimento;
	private String tipo;
	
	public ProdutoPerecivel(String nome, int quantidade, String dataVencimento, String tipo) {
		super(nome, quantidade);
		this.setDataVencimento(dataVencimento);
		this.setTipo(tipo);
	}
	
	//tipo
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	//dataVencimento
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}