package controller.command.impl.diretor;

import java.util.Map;

import controller.command.impl.Command;
import repositories.DiretorRepository;

public abstract class DiretorCommand implements Command {

    protected DiretorRepository repository;

    protected DiretorCommand(DiretorRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}
