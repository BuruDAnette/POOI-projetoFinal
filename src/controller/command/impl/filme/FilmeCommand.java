package controller.command.impl.filme;

import java.util.Map;

import controller.command.impl.Command;
import repositories.FilmeRepository;

abstract class FilmeCommand implements Command {

    protected FilmeRepository repository;

    protected FilmeCommand(FilmeRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}

