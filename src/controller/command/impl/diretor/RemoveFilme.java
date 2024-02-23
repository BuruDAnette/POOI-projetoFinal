package controller.command.impl.diretor;

import java.util.Map;

import repositories.DiretorRepository;

/**
 * The type Remove filme.
 */
public class RemoveFilme extends DiretorCommand {
    /**
     * Instantiates a new Remove filme.
     *
     * @param repository the repository
     */
    public RemoveFilme(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        int idFilme = (int) params.get("idFilme");
        repository.removerFilme(idDiretor, idFilme);
    }
}
