package controller.command.impl.diretor;

import java.util.Map;

import model.filme.Filme;
import repositories.DiretorRepository;

/**
 * The type Adicionar filme.
 */
public class AdicionarFilme extends DiretorCommand {
    /**
     * Instantiates a new Adicionar filme.
     *
     * @param repository the repository
     */
    public AdicionarFilme(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idDiretor = (Integer) params.get("idDiretor");
        Filme filme = (Filme) params.get("filme");
        repository.adicionarFilme(idDiretor, filme);
    }
}
