package controller.command.impl.filme;

import java.util.Map;

import model.ator.Ator;
import repositories.FilmeRepository;

/**
 * The type Adicionar ator.
 */
public class AdicionarAtor extends FilmeCommand {
    /**
     * Instantiates a new Adicionar ator.
     *
     * @param repository the repository
    **/
    
    public AdicionarAtor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idFilme = (Integer) params.get("idFilme");
        Ator ator = (Ator) params.get("ator");
        repository.adicionarAtor(idFilme, ator);
    }
}
