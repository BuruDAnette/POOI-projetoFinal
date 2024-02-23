package controller.command.impl.diretor;

import java.util.Map;

import repositories.DiretorRepository;

/**
 * The type Listar todos diretores.
 */
public class ListarTodosDiretores extends DiretorCommand {


    /**
     * Instantiates a new Listar todos diretores.
     *
     * @param repository the repository
     */
    public ListarTodosDiretores(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}
