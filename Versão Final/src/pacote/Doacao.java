package pacote;

import java.util.ArrayList;

public class Doacao {

	private int id;
	private String nomeDoador;
	private ArrayList<ProdutoPerecivel>produtosPereciveis = new ArrayList <ProdutoPerecivel>();
	private ArrayList<ProdutoNaoPerecivel>produtosNaoPereciveis = new ArrayList <ProdutoNaoPerecivel>();
	
	public Doacao(String nomeDoador, int id) {
		this.setNomeDoador(nomeDoador);
		this.setId(id);
	}
	
	public void insereProdutoPerecivel(ProdutoPerecivel produto) { 
		this.produtosPereciveis.add(produto);
	}
	public void insereProdutoNaoPerecivel(ProdutoNaoPerecivel produto) {
		this.produtosNaoPereciveis.add(produto);
	}
	
	public void imprimirArrayPereciveis() {
		for (ProdutoPerecivel objeto:produtosPereciveis ) {
			System.out.println(objeto.getNome()+", "+objeto.getQuantidade()+".");
		}
	}
	
	public void imprimirArrayNaoPereciveis() {
		for (ProdutoNaoPerecivel objeto:produtosNaoPereciveis ) {
			System.out.println(objeto.getNome()+", "+objeto.getQuantidade()+".");
		}
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
	public ArrayList<ProdutoPerecivel> getProdutosPereciveis() {
		return produtosPereciveis;
	}

	public void setProdutosPereciveis(ArrayList<ProdutoPerecivel> produtosPereciveis) {
		this.produtosPereciveis = produtosPereciveis;
	}
	
	
	//ArrayNãoPerecíveis
	public ArrayList<ProdutoNaoPerecivel> getProdutosNaoPereciveis() {
		return produtosNaoPereciveis;
	}

	public void setProdutosNaoPereciveis(ArrayList<ProdutoNaoPerecivel> produtosNaoPereciveis) {
		this.produtosNaoPereciveis = produtosNaoPereciveis;
	}
	
	
}