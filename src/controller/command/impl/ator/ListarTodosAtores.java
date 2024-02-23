package controller.command.impl.ator;

import java.util.Map;

import repositories.AtorRepository;

/**
 * The type Listar todos atores.
 */
public class ListarTodosAtores extends AtorCommand {


    /**
     * Instantiates a new Listar todos atores.
     *
     * @param repository the repository
     */
    public ListarTodosAtores(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}
