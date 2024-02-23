package controller.command.impl.diretor;

import java.util.Map;

import controller.command.impl.Command;
import repositories.DiretorRepository;

/**
 * The type Diretor command.
 */
public abstract class DiretorCommand implements Command {

    /**
     * The Repository.
     */
    protected DiretorRepository repository;

    /**
     * Instantiates a new Diretor command.
     *
     * @param repository the repository
     */
    protected DiretorCommand(DiretorRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}
