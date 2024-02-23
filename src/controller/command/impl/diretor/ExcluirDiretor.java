package controller.command.impl.diretor;

import java.util.Map;

import repositories.DiretorRepository;

/**
 * The type Excluir diretor.
 */
public class ExcluirDiretor extends DiretorCommand {
    /**
     * Instantiates a new Excluir diretor.
     *
     * @param repository the repository
     */
    public ExcluirDiretor(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        repository.excluir(idDiretor);
    }
}
