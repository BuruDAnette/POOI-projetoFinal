package controller.command.impl.diretor;

import java.util.Map;

import repositories.DiretorRepository;

/**
 * The type Renomear.
 */
public class Renomear extends DiretorCommand {
    /**
     * Instantiates a new Renomear.
     *
     * @param repository the repository
     */
    public Renomear(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        String nome = (String) params.get("nome");
        repository.renomear(idDiretor, nome);
    }
}

