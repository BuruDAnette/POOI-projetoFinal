package repositories;

import java.util.List;

import model.diretor.Diretor;
import model.filme.Filme;

/**
 * The interface Diretor repository.
 */
public interface DiretorRepository {

    /**
     * Inserir diretor.
     *
     * @param entry the entry
     * @return the diretor
     */
    public Diretor inserir(Diretor entry);

    /**
     * Renomear diretor.
     *
     * @param id   the id
     * @param nome the nome
     * @return the diretor
     */
    public Diretor renomear(int id, String nome);

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
    public List<Diretor> listarTodos();

    /**
     * Pesquisar por nome list.
     *
     * @param nomeOuParteDoNome the nome ou parte do nome
     * @return the list
     */
    public List<Diretor> pesquisarPorNome(String nomeOuParteDoNome);

    /**
     * Adicionar filme diretor.
     *
     * @param idDiretor the id diretor
     * @param filme     the filme
     * @return the diretor
     */
    public Diretor adicionarFilme(int idDiretor, Filme filme);

    /**
     * Remover filme diretor.
     *
     * @param idDiretor the id diretor
     * @param idFilme   the id filme
     * @return the diretor
     */
    public Diretor removerFilme(int idDiretor, int idFilme);

}
