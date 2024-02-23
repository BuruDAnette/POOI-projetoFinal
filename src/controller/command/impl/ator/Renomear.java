package controller.command.impl.ator;

import java.util.Map;

import repositories.AtorRepository;

/**
 * The type Renomear.
 */
public class Renomear extends AtorCommand {
    /**
     * Instantiates a new Renomear.
     *
     * @param repository the repository
     */
    public Renomear(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        String nome = (String) params.get("nome");
        repository.renomear(idAtor, nome);
    }
}
