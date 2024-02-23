package controller.command.impl.ator;

import java.util.Map;

import controller.command.impl.Command;
import repositories.AtorRepository;

public abstract class AtorCommand implements Command {

    protected AtorRepository repository;

    protected AtorCommand(AtorRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}
