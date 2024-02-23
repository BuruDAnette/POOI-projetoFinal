package controller.command.impl.diretor;

import java.util.Map;

import repositories.DiretorRepository;

/**
 * The type Pesquisar por nome.
 */
public class PesquisarPorNome extends DiretorCommand {
    /**
     * Instantiates a new Pesquisar por nome.
     *
     * @param repository the repository
     */
    public PesquisarPorNome(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        String keywords = (String) params.get("keywords");
        repository.pesquisarPorNome(keywords).forEach(System.out::println);

    }
}
