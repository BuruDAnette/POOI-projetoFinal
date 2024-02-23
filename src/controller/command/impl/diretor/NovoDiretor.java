package controller.command.impl.diretor;

import java.util.Map;

import model.diretor.Diretor;
import repositories.DiretorRepository;

/**
 * The type Novo diretor.
 */
public class NovoDiretor extends DiretorCommand {
    /**
     * Instantiates a new Novo diretor.
     *
     * @param repository the repository
     */
    public NovoDiretor(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Diretor diretor = (Diretor) params.get("diretor");
        repository.inserir(diretor);
    }
}

