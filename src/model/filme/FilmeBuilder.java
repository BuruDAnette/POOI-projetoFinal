package model.filme;

import java.time.LocalDate;
import java.util.List;

import model.ator.Ator;
import model.diretor.Diretor;

/**
 * The type Filme builder.
 */
public class FilmeBuilder {

	private Filme filme = new Filme();

    /**
     * Com nome filme builder.
     *
     * @param nome the nome
     * @return the filme builder
     */
    public FilmeBuilder comNome(String nome){
		filme.setNome(nome);
		return this;
	}

    /**
     * Com data lancamento filme builder.
     *
     * @param dataLancamento the data lancamento
     * @return the filme builder
     */
    public FilmeBuilder comDataLancamento(LocalDate dataLancamento){
		filme.setDataLancamento(dataLancamento);
		return this;
	}

    /**
     * Com orcamento filme builder.
     *
     * @param orcamento the orcamento
     * @return the filme builder
     */
    public FilmeBuilder comOrcamento(double orcamento){
		filme.setOrcamento(orcamento);
		return this;
	}

    /**
     * Com descricao filme builder.
     *
     * @param descricao the descricao
     * @return the filme builder
     */
    public FilmeBuilder comDescricao(String descricao){
		filme.setDescricao(descricao);
		return this;
	}

    /**
     * Com atores filme builder.
     *
     * @param atores the atores
     * @return the filme builder
     */
    public FilmeBuilder comAtores(List<Ator> atores){
		filme.setAtores(atores);
		return this;
	}

    /**
     * Com diretores filme builder.
     *
     * @param diretores the diretores
     * @return the filme builder
     */
    public FilmeBuilder comDiretores(List<Diretor> diretores){
		filme.setDiretores(diretores);
		return this;
	}

    /**
     * Build filme.
     *
     * @return the filme
     */
    public Filme build(){
		return filme;
	}

}
