package controller.command.impl.ator;

import java.util.Map;

import repositories.AtorRepository;

/**
 * The type Pesquisar por nome.
 */
public class PesquisarPorNome extends AtorCommand {
    /**
     * Instantiates a new Pesquisar por nome.
     *
     * @param repository the repository
     */
    public PesquisarPorNome(AtorRepository repository) {
		super(repository);
	}

	@Override
	public void executar(Map<String, Object> params) {
		String keywords = (String) params.get("keywords");
		repository.pesquisarPorNome(keywords).forEach(System.out::println);

	}
}
