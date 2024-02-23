package controller.command.impl.ator;

import java.util.Map;

import repositories.AtorRepository;

public class ListarTodosAtores extends AtorCommand {


    public ListarTodosAtores(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}
