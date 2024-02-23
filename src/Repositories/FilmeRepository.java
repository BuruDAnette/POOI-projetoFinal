package repositories;

import java.util.List;

import model.ator.Ator;
import model.diretor.Diretor;
import model.filme.Filme;

/**
 * The interface Filme repository.
 */
public interface FilmeRepository {

    /**
     * Inserir filme.
     *
     * @param filme the filme
     * @return the filme
     */
    public Filme inserir(Filme filme);

    /**
     * Renomear filme.
     *
     * @param id   the id
     * @param nome the nome
     * @return the filme
     */
    public Filme renomear(int id, String nome);

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
    public List<Filme> listarTodos();

    /**
     * Pesquisar por nome list.
     *
     * @param nomeOuParteDoNome the nome ou parte do nome
     * @return the list
     */
    public List<Filme> pesquisarPorNome(String nomeOuParteDoNome);

    /**
     * Atualizar descricao filme.
     *
     * @param id        the id
     * @param descricao the descricao
     * @return the filme
     */
    public Filme atualizarDescricao(int id, String descricao);

    /**
     * Adicionar ator filme.
     *
     * @param idFilme the id filme
     * @param ator    the ator
     * @return the filme
     */
    public Filme adicionarAtor(int idFilme, Ator ator);

    /**
     * Remover ator filme.
     *
     * @param idFilme the id filme
     * @param idAtor  the id ator
     * @return the filme
     */
    public Filme removerAtor(int idFilme, int idAtor);

    /**
     * Adicionar diretor filme.
     *
     * @param idFilme the id filme
     * @param diretor the diretor
     * @return the filme
     */
    public Filme adicionarDiretor(int idFilme, Diretor diretor);

    /**
     * Remover diretor filme.
     *
     * @param idFilme   the id filme
     * @param idDiretor the id diretor
     * @return the filme
     */
    public Filme removerDiretor(int idFilme, int idDiretor);

}
