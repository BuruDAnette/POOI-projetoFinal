package controller;

import java.util.Map;
import java.util.Optional;

import controller.command.factories.FilmesCommandFactory;
import controller.command.impl.Command;
import controller.command.impl.operacao.OperacoesFilme;
import repositories.FilmeRepository;

/**
 * The type Filme controller.
 */
public class FilmeController {

	private FilmeRepository filmesRepository;

	private FilmeController(FilmeRepository repository) {
		this.filmesRepository = repository;
	}

	private static FilmeController instance ;

    /**
     * Get instance filme controller.
     *
     * @param repository the repository
     * @return the filme controller
     */
    public static FilmeController getInstance(FilmeRepository repository){
		if(instance==null){
			instance = new FilmeController(repository);
		}
		return instance;
	}

    /**
     * Executar.
     *
     * @param operacao the operacao
     */
    public void executar(OperacoesFilme operacao) {
		this.executar(operacao, null);
	}

    /**
     * Executar.
     *
     * @param operacao the operacao
     * @param params   the params
     */
    public void executar(OperacoesFilme operacao, Map<String, Object> params) {
		Optional<Command> command = FilmesCommandFactory.getInstance(filmesRepository).getCommand(operacao);
		if(command.isPresent()){
			command.get().executar(params);
		}
		else{
			System.out.println("Comando nao encontrado para a opcao " + operacao);
		}

	}

}
