package model.ator;

import java.time.LocalDate;
import java.util.List;

import model.filme.Filme;

/**
 * The type Ator builder.
 */
public class AtorBuilder {

	private Ator ator = new Ator();

    /**
     * Com nome ator builder.
     *
     * @param nome the nome
     * @return the ator builder
     */
    public AtorBuilder comNome(String nome){
		ator.setNome(nome);
		return this;
	}

    /**
     * Com data nascimento ator builder.
     *
     * @param dataNascimento the data nascimento
     * @return the ator builder
     */
    public AtorBuilder comDataNascimento(LocalDate dataNascimento){
		ator.setDataNascimento(dataNascimento);
		return this;
	}

    /**
     * Com filmes ator builder.
     *
     * @param filmes the filmes
     * @return the ator builder
     */
    public AtorBuilder comFilmes(List<Filme> filmes){
		ator.setFilmes(filmes);
		return this;
	}

    /**
     * Build ator.
     *
     * @return the ator
     */
    public Ator build(){
		return ator;
	}

}
