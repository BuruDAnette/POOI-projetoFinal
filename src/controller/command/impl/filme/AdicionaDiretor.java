package controller.command.impl.filme;

import java.util.Map;

import model.diretor.Diretor;
import repositories.FilmeRepository;

/**
 * The type Adiciona diretor.
 */
public class AdicionaDiretor extends FilmeCommand {
    /**
     * Instantiates a new Adiciona diretor.
     *
     * @param repository the repository
    **/

    public AdicionaDiretor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {

        int idFilme = (int) params.get("idFilme");
        Diretor diretor = (Diretor) params.get("diretor");
        repository.adicionarDiretor(idFilme, diretor);

    }
}
