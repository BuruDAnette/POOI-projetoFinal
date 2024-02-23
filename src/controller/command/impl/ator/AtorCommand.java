package controller.command.impl.ator;

import java.util.Map;

import controller.command.impl.Command;
import repositories.AtorRepository;

/**
 * The type Ator command.
 */
public abstract class AtorCommand implements Command {

    /**
     * The Repository.
     */
    protected AtorRepository repository;

    /**
     * Instantiates a new Ator command.
     *
     * @param repository the repository
     */
    protected AtorCommand(AtorRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}
