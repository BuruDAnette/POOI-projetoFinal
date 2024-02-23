package controller.command.impl.ator;

import java.util.Map;

import model.filme.Filme;
import repositories.AtorRepository;

/**
 * The type Adicionar filme.
 */
public class AdicionarFilme extends AtorCommand {
    /**
     * Instantiates a new Adicionar filme.
     *
     * @param repository the repository
     */
    public AdicionarFilme(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idAtor = (Integer) params.get("idAtor");
        Filme filme = (Filme) params.get("filme");
        repository.adicionarFilme(idAtor, filme);
    }
}
