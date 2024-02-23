package repositories;

import java.util.List;

import model.ator.Ator;
import model.filme.Filme;

/**
 * The interface Ator repository.
 */
public interface AtorRepository{

    /**
     * Inserir ator.
     *
     * @param ator the ator
     * @return the ator
     */
    public Ator inserir(Ator ator);

    /**
     * Renomear ator.
     *
     * @param id   the id
     * @param nome the nome
     * @return the ator
     */
    public Ator renomear(int id, String nome);

    /**
     * Excluir.
     *
     * @param id the id
     */
    public void excluir(int id);

    /**
     * Listar todos list.
     *
     * @return the list
     */
    public List<Ator> listarTodos();

    /**
     * Pesquisar por nome list.
     *
     * @param nomeOuParteDoNome the nome ou parte do nome
     * @return the list
     */
    public List<Ator> pesquisarPorNome(String nomeOuParteDoNome);

    /**
     * Adicionar filme ator.
     *
     * @param idAtor the id ator
     * @param filme  the filme
     * @return the ator
     */
    public Ator adicionarFilme(int idAtor, Filme filme);

    /**
     * Remover filme ator.
     *
     * @param idAtor  the id ator
     * @param idFilme the id filme
     * @return the ator
     */
    public Ator removerFilme(int idAtor, int idFilme);

}
