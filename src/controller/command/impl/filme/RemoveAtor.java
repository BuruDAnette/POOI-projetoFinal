package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

/**
 * The type Remove ator.
 */
public class RemoveAtor extends FilmeCommand {
    /**
     * Instantiates a new Remove ator.
     *
     * @param repository the repository
    **/

    public RemoveAtor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        int idFilme = (int) params.get("idFilme");
        repository.removerAtor(idFilme, idAtor);
    }
}