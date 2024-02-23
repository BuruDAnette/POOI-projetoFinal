package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

/**
 * The type Remove diretor.
 */
public class RemoveDiretor extends FilmeCommand {
    /**
     * Instantiates a new Remove diretor.
     *
     * @param repository the repository
    **/

    public RemoveDiretor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        int idFilme = (int) params.get("idFilme");
        repository.removerDiretor(idFilme, idDiretor);
    }
}