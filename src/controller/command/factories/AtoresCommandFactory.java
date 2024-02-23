package controller.command.factories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import controller.command.impl.Command;
import controller.command.impl.ator.AdicionarFilme;
import controller.command.impl.ator.ExcluirAtor;
import controller.command.impl.ator.ListarTodosAtores;
import controller.command.impl.ator.NovoAtor;
import controller.command.impl.ator.PesquisarPorNome;
import controller.command.impl.ator.RemoveFilme;
import controller.command.impl.ator.Renomear;
import controller.command.impl.operacao.OperacoesAtor;
import repositories.AtorRepository;

public class AtoresCommandFactory {

    private final AtorRepository repository;

    private static AtoresCommandFactory instance;

    private final Map<OperacoesAtor, Command> commandMap;



    private AtoresCommandFactory(AtorRepository repository) {
        this.repository = repository;
        this.commandMap = initializeCommands();
    }

    public static AtoresCommandFactory getInstance(AtorRepository repository){
        if(instance==null){
            instance = new AtoresCommandFactory(repository);
        }
        return instance;
    }

    private Map<OperacoesAtor, Command> initializeCommands() {
        Map<OperacoesAtor, Command> map = new HashMap<>();
        map.put(OperacoesAtor.INSERIR, new NovoAtor(repository));
        map.put(OperacoesAtor.EXCLUIR, new ExcluirAtor(repository));
        map.put(OperacoesAtor.RENOMEAR, new Renomear(repository));
        map.put(OperacoesAtor.LISTAR_TODOS, new ListarTodosAtores(repository));
        map.put(OperacoesAtor.PESQUISAR_POR_NOME, new PesquisarPorNome(repository));
        map.put(OperacoesAtor.ADICIONAR_FILME, new AdicionarFilme(repository));
        map.put(OperacoesAtor.REMOVER_FILME, new RemoveFilme(repository));
        return map;
    }

    public Optional<Command> getCommand(OperacoesAtor operacoesAtor) {
        Command command = commandMap.get(operacoesAtor);
        return Optional.ofNullable(command);
    }
}