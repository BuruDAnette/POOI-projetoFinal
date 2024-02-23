package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

/**
 * The type Pesquisar por nome.
 */
public class PesquisarPorNome extends FilmeCommand {
    /**
     * Instantiates a new Pesquisar por nome.
     *
     * @param repository the repository
    **/

    public PesquisarPorNome(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        String keywords = (String) params.get("keywords");
        repository.pesquisarPorNome(keywords).forEach(System.out::println);

    }
}