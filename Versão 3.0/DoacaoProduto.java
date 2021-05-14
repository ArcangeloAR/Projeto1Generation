package pacote;

public class DoacaoProduto {

	private String nome;
	private int quantidade;
	
	public DoacaoProduto(String nome, int quantidade) {
		super();
		this.setNome(nome);
		this.setQuantidade(quantidade);
	}
	
	//nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//qtd
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

}