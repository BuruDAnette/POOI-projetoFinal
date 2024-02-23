package controller.command.impl.filme;

import java.util.Map;

import model.filme.Filme;
import repositories.FilmeRepository;

/**
 * The type Novo filme.
 */
public class NovoFilme extends FilmeCommand {
    /**
     * Instantiates a new Novo filme.
     *
     * @param repository the repository
    **/

    public NovoFilme(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Filme filme = (Filme) params.get("filme");
        repository.inserir(filme);
    }
}