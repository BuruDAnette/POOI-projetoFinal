package model.filme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import model.ator.Ator;
import model.diretor.Diretor;

/**
 * The type Filme.
 */
public class Filme {

	private int id;
    private String nome;
    private LocalDate dataLancamento;
    private double orcamento;
    private String descricao;

    private List<Ator> atores = new ArrayList<Ator>();

    private List<Diretor> diretores = new ArrayList<Diretor>();

    /**
     * To string string.
     *
     * @return the string
     */
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

    /**
     * Atores to string string.
     *
     * @return the string
     */
    public String atoresToString() {
    	StringJoiner atoresString = new StringJoiner(", ");
    	for (Ator ator : atores) {
    		atoresString.add(ator.getNome());
    	}
    	return atoresString.toString();
    }

    /**
     * Diretores to string string.
     *
     * @return the string
     */
    public String diretoresToString() {
    	StringJoiner diretoresString = new StringJoiner(", ");
    	for (Diretor diretor : diretores) {
    		diretoresString.add(diretor.getNome());
    	}
    	return diretoresString.toString();
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
		return id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
		this.id = id;
	}

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
		return nome;
	}

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
		this.nome = nome;
	}

    /**
     * Gets data lancamento.
     *
     * @return the data lancamento
     */
    public LocalDate getDataLancamento() {
		return dataLancamento;
	}

    /**
     * Sets data lancamento.
     *
     * @param dataLancamento the data lancamento
     */
    public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

    /**
     * Gets orcamento.
     *
     * @return the orcamento
     */
    public double getOrcamento() {
		return orcamento;
	}

    /**
     * Sets orcamento.
     *
     * @param orcamento the orcamento
     */
    public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

    /**
     * Gets descricao.
     *
     * @return the descricao
     */
    public String getDescricao() {
		return descricao;
	}

    /**
     * Sets descricao.
     *
     * @param descricao the descricao
     */
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    /**
     * Gets atores.
     *
     * @return the atores
     */
    public List<Ator> getAtores() {
		return atores;
	}

    /**
     * Sets atores.
     *
     * @param atores the atores
     */
    public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}

    /**
     * Gets diretores.
     *
     * @return the diretores
     */
    public List<Diretor> getDiretores() {
		return diretores;
	}

    /**
     * Sets diretores.
     *
     * @param diretores the diretores
     */
    public void setDiretores(List<Diretor> diretores) {
		this.diretores = diretores;
	}

}
