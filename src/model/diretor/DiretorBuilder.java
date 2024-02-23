package model.diretor;

import java.time.LocalDate;
import java.util.List;

import model.filme.Filme;

/**
 * The type Diretor builder.
 */
public class DiretorBuilder {

	private Diretor diretor = new Diretor();

    /**
     * Com nome diretor builder.
     *
     * @param nome the nome
     * @return the diretor builder
     */
    public DiretorBuilder comNome(String nome){
		diretor.setNome(nome);
		return this;
	}

    /**
     * Com data nascimento diretor builder.
     *
     * @param dataNascimento the data nascimento
     * @return the diretor builder
     */
    public DiretorBuilder comDataNascimento(LocalDate dataNascimento){
		diretor.setDataNascimento(dataNascimento);
		return this;
	}

    /**
     * Com filmes diretor builder.
     *
     * @param filmes the filmes
     * @return the diretor builder
     */
    public DiretorBuilder comFilmes(List<Filme> filmes){
		diretor.setFilmes(filmes);
		return this;
	}

    /**
     * Build diretor.
     *
     * @return the diretor
     */
    public Diretor build(){
		return diretor;
	}

}