package controller.command.impl.ator;

import java.util.Map;

import repositories.AtorRepository;

/**
 * The type Remove filme.
 */
public class RemoveFilme extends AtorCommand {
    /**
     * Instantiates a new Remove filme.
     *
     * @param repository the repository
     */
    public RemoveFilme(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        int idFilme = (int) params.get("idFilme");
        repository.removerFilme(idAtor, idFilme);
    }
}
