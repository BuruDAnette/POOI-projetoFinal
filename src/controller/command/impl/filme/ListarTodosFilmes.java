package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

public class ListarTodosFilmes extends FilmeCommand {


    public ListarTodosFilmes(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}