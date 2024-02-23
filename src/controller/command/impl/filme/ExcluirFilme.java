package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

/**
 * The type Excluir filme.
 */
public class ExcluirFilme extends FilmeCommand {
    /**
     * Instantiates a new Excluir filme.
     *
     * @param repository the repository
    **/

    public ExcluirFilme(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idFilme = (int) params.get("idFilme");
        repository.excluir(idFilme);
    }
}

