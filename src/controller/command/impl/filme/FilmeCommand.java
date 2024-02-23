package controller.command.impl.filme;

import java.util.Map;

import controller.command.impl.Command;
import repositories.FilmeRepository;

/**
 * The type Filme command.
 */
abstract class FilmeCommand implements Command {

    /**
     * The Repository.
     */
    protected FilmeRepository repository;

    /**
     * Instantiates a new Filme command.
     *
     * @param repository the repository
    **/
    
    protected FilmeCommand(FilmeRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}

