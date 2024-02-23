package repositories;

import java.util.List;

import model.ator.Ator;
import model.diretor.Diretor;
import model.filme.Filme;
import repositories.impl.TipoVinculo;

/**
 * The interface Crud repository.
 *
 * @param <T> the type parameter
 */
public interface CrudRepository<T> {

    /**
     * Inserir t.
     *
     * @param entry the entry
     * @return the t
     */
    public T inserir(T entry);

    /**
     * Renomear t.
     *
     * @param id   the id
     * @param nome the nome
     * @return the t
     */
    public T renomear(int id, String nome);

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
    public List<T> listarTodos();

    /**
     * Pesquisar por nome list.
     *
     * @param nomeOuParteDoNome the nome ou parte do nome
     * @return the list
     */
    public List<T> pesquisarPorNome(String nomeOuParteDoNome);

    /**
     * Vincular.
     *
     * @param filme the filme
     * @param id    the id
     */
    public void vincular(Filme filme, int id);

    /**
     * Desvincular.
     *
     * @param filme the filme
     * @param id    the id
     */
    public void desvincular(Filme filme, int id);

    /**
     * Vincular.
     *
     * @param t    the t
     * @param ator the ator
     * @param id   the id
     */
    public void vincular(TipoVinculo t, Ator ator, int id);

    /**
     * Desvincular.
     *
     * @param t    the t
     * @param ator the ator
     * @param id   the id
     */
    public void desvincular(TipoVinculo t, Ator ator, int id);

    /**
     * Vincular.
     *
     * @param t       the t
     * @param diretor the diretor
     * @param id      the id
     */
    public void vincular(TipoVinculo t, Diretor diretor, int id);

    /**
     * Desvincular.
     *
     * @param t       the t
     * @param diretor the diretor
     * @param id      the id
     */
    public void desvincular(TipoVinculo t, Diretor diretor, int id);

}
