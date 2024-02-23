package controller.command.impl.ator;

import java.util.Map;

import model.ator.Ator;
import repositories.AtorRepository;

/**
 * The type Novo ator.
 */
public class NovoAtor extends AtorCommand {
    /**
     * Instantiates a new Novo ator.
     *
     * @param repository the repository
     */
    public NovoAtor(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Ator Ator = (Ator) params.get("ator");
        repository.inserir(Ator);
    }
}