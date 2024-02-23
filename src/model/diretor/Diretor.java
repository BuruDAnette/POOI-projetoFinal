package model.diretor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import model.filme.Filme;

/**
 * The type Diretor.
 */
public class Diretor {

	private int id;
	private String nome;
	private LocalDate dataNascimento;

	private List<Filme> filmes = new ArrayList<Filme>();

    /**
     * To string string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Director{" +
                "id: " + id + ";" +
        		"\n" + "name: " + nome + ";" +
                "\n" + "directed movies: " + filmesToString() +
                "}\n";
    }

    /**
     * Filmes to string string.
     *
     * @return the string
     */
    public String filmesToString() {
		StringJoiner filmesString = new StringJoiner(", ");
    	for (Filme filme : filmes) {
    		filmesString.add(filme.getNome());
    	}
    	return filmesString.toString();
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
     * Gets data nascimento.
     *
     * @return the data nascimento
     */
    public LocalDate getDataNascimento() {
		return dataNascimento;
	}

    /**
     * Sets data nascimento.
     *
     * @param dataNascimento the data nascimento
     */
    public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

    /**
     * Gets filmes.
     *
     * @return the filmes
     */
    public List<Filme> getFilmes() {
		return filmes;
	}

    /**
     * Sets filmes.
     *
     * @param filmes the filmes
     */
    public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}


}

