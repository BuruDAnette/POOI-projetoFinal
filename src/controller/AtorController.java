package controller;

import java.util.Map;
import java.util.Optional;

import controller.command.factories.AtoresCommandFactory;
import controller.command.impl.Command;
import controller.command.impl.operacao.OperacoesAtor;
import repositories.AtorRepository;

/**
 * The type Ator controller.
 */
public class AtorController {

	private AtorRepository atoresRepository;

	private AtorController(AtorRepository repository) {
		this.atoresRepository = repository;
	}

	private static AtorController instance ;

    /**
     * Get instance ator controller.
     *
     * @param repository the repository
     * @return the ator controller
     */
    public static AtorController getInstance(AtorRepository repository){
		if(instance==null){
			instance = new AtorController(repository);
		}
		return instance;
	}

    /**
     * Executar.
     *
     * @param operacao the operacao
     */
    public void executar(OperacoesAtor operacao) {
		this.executar(operacao, null);
	}

    /**
     * Executar.
     *
     * @param operacao the operacao
     * @param params   the params
     */
    public void executar(OperacoesAtor operacao, Map<String, Object> params) {
		Optional<Command> command = AtoresCommandFactory.getInstance(atoresRepository).getCommand(operacao);
		if(command.isPresent()){
			command.get().executar(params);
		}
		else{
			System.out.println("Comando nao encontrado para a opcao " + operacao);
		}

	}

}