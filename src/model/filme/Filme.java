package model.filme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.ator.Ator;
import model.diretor.Diretor;

public class Filme {

	private int id;
    private String nome;
    private LocalDate dataLancamento;
    private double orcamento;
    private String descricao;

    private List<Ator> atores = new ArrayList<Ator>();

    private List<Diretor> diretores = new ArrayList<Diretor>();
    
    @Override
    public String toString() {
        return "Movie{" +
                "id: " + id + ";" +
        		"\n" + "title: " + nome + ";" +
                "\n" + "description: " + descricao + ";" +
        		"\n" + "starring: " + atoresToString() + ";" +
                "\n" + "directed by: " + diretoresToString() +
                "}\n";
    }

    public String atoresToString() {
    	StringBuilder atoresString = new StringBuilder();
    	for (Ator ator : atores) {
    		atoresString.append(ator.getNome() + ",");
    	}
    	atoresString.deleteCharAt(atoresString.length()-1);
    	return atoresString.toString();
    }
    
    public String diretoresToString() {
    	StringBuilder diretoresString = new StringBuilder();
    	for (Diretor diretor : diretores) {
    		diretoresString.append(diretor.getNome() + ",");
    	}
    	diretoresString.deleteCharAt(diretoresString.length()-1);
    	return diretoresString.toString();
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}

	public List<Diretor> getDiretores() {
		return diretores;
	}

	public void setDiretores(List<Diretor> diretores) {
		this.diretores = diretores;
	}

}
