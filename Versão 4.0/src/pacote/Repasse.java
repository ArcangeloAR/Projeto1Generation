package pacote;

public class Repasse {
	private String entidade;
    private Doacao doacao;

    public Repasse(String entidade, Doacao doacao){
        this.setEntidade(entidade);
        this.setDoacao(doacao);
    }

    public String getEntidade(){
        return this.entidade;
    }

    public Doacao getDoacao(){
        return this.doacao;
    }

    public void setEntidade(String entidade){
        this.entidade = entidade;
    }

    public void setDoacao(Doacao doacao){
        this.doacao = doacao;
    }
}
