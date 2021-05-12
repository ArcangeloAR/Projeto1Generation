package Pacote1;

public class ProdutoPerecivel extends DoacaoProduto{
	private String dataVencimento;
	
	public ProdutoPerecivel(String nome, float quantidade, String observacao, String dataVencimento) {
		super(nome, quantidade, observacao);
		this.dataVencimento = dataVencimento;
	}
	
	
}
