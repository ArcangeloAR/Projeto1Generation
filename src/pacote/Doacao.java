package pacote;

import java.util.ArrayList;

public class Doacao {

	private int id;
	private String nomeDoador;
	private ArrayList<ProdutoPerecivel>produtosPerecíveis;
	private ArrayList<ProdutoNaoPerecivel>produtosNaoPerecíveis;
	
	public Doacao(String nomeDoador, int id) {
		this.setNomeDoador(nomeDoador);
		this.setId(id);
	}
	
	public void insereProdutoPerecível(ProdutoPerecivel produto) { 
		this.produtosPerecíveis.add(produto);
	}
	public void insereProdutoPerecível(ProdutoNaoPerecivel produto) {
		this.produtosNaoPerecíveis.add(produto);
	}
	
	//id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	//nomeDoador
	public String getNomeDoador() {
		return nomeDoador;
	}

	public void setNomeDoador(String nomeDoador) {
		this.nomeDoador = nomeDoador;
	}

	
	//ArrayPerecíveis
	public ArrayList<ProdutoPerecivel> getProdutosPerecíveis() {
		return produtosPerecíveis;
	}

	public void setProdutosPerecíveis(ArrayList<ProdutoPerecivel> produtosPerecíveis) {
		this.produtosPerecíveis = produtosPerecíveis;
	}
	
	
	//ArrayNãoPerecíveis
	public ArrayList<ProdutoNaoPerecivel> getProdutosNaoPerecíveis() {
		return produtosNaoPerecíveis;
	}

	public void setProdutosNaoPerecíveis(ArrayList<ProdutoNaoPerecivel> produtosNaoPerecíveis) {
		this.produtosNaoPerecíveis = produtosNaoPerecíveis;
	}
	
}