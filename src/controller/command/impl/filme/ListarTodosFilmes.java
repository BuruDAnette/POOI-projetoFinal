package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

/**
 * The type Listar todos filmes.
 */
public class ListarTodosFilmes extends FilmeCommand {


    /**
     * Instantiates a new Listar todos filmes.
     *
     * @param repository the repository
    */

    public ListarTodosFilmes(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}