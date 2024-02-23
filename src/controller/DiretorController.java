package controller;

import java.util.Map;
import java.util.Optional;

import controller.command.factories.DiretoresCommandFactory;
import controller.command.impl.Command;
import controller.command.impl.operacao.OperacoesDiretor;
import repositories.DiretorRepository;

/**
 * The type Diretor controller.
 */
public class DiretorController {

	private DiretorRepository diretoresRepository;

	private DiretorController(DiretorRepository repository) {
		this.diretoresRepository = repository;
	}

	private static DiretorController instance ;

    /**
     * Get instance diretor controller.
     *
     * @param repository the repository
     * @return the diretor controller
     */
    public static DiretorController getInstance(DiretorRepository repository){
		if(instance==null){
			instance = new DiretorController(repository);
		}
		return instance;
	}

    /**
     * Executar.
     *
     * @param operacao the operacao
     */
    public void executar(OperacoesDiretor operacao) {
		this.executar(operacao, null);
	}

    /**
     * Executar.
     *
     * @param operacao the operacao
     * @param params   the params
     */
    public void executar(OperacoesDiretor operacao, Map<String, Object> params) {
		Optional<Command> command = DiretoresCommandFactory.getInstance(diretoresRepository).getCommand(operacao);
		if(command.isPresent()){
			command.get().executar(params);
		}
		else{
			System.out.println("Comando nao encontrado para a opcao " + operacao);
		}

	}

}
