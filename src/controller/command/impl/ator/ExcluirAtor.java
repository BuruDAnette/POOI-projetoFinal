package controller.command.impl.ator;

import java.util.Map;

import repositories.AtorRepository;

/**
 * The type Excluir ator.
 */
public class ExcluirAtor extends AtorCommand {
    /**
     * Instantiates a new Excluir ator.
     *
     * @param repository the repository
     */
    public ExcluirAtor(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        repository.excluir(idAtor);
    }
}
