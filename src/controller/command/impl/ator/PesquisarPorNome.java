package controller.command.impl.ator;

import java.util.Map;

import repositories.AtorRepository;

public class PesquisarPorNome extends AtorCommand {
	public PesquisarPorNome(AtorRepository repository) {
		super(repository);
	}

	@Override
	public void executar(Map<String, Object> params) {
		String keywords = (String) params.get("keywords");
		repository.pesquisarPorNome(keywords).forEach(System.out::println);

	}
}
