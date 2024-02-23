package controller.command.factories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import controller.command.impl.Command;
import controller.command.impl.filme.AdicionaDiretor;
import controller.command.impl.filme.AdicionarAtor;
import controller.command.impl.filme.AtualizarDescricao;
import controller.command.impl.filme.ExcluirFilme;
import controller.command.impl.filme.ListarTodosFilmes;
import controller.command.impl.filme.NovoFilme;
import controller.command.impl.filme.PesquisarPorNome;
import controller.command.impl.filme.RemoveAtor;
import controller.command.impl.filme.RemoveDiretor;
import controller.command.impl.filme.Renomear;
import controller.command.impl.operacao.OperacoesFilme;
import repositories.FilmeRepository;

public class FilmesCommandFactory {

    private final FilmeRepository repository;

    private static FilmesCommandFactory instance;

    private final Map<OperacoesFilme, Command> commandMap;



    private FilmesCommandFactory(FilmeRepository repository) {
        this.repository = repository;
        this.commandMap = initializeCommands();
    }

    public static FilmesCommandFactory getInstance(FilmeRepository repository){
        if(instance==null){
            instance = new FilmesCommandFactory(repository);
        }
        return instance;
    }

    private Map<OperacoesFilme, Command> initializeCommands() {
        Map<OperacoesFilme, Command> map = new HashMap<>();
        map.put(OperacoesFilme.INSERIR, new NovoFilme(repository));
        map.put(OperacoesFilme.EXCLUIR, new ExcluirFilme(repository));
        map.put(OperacoesFilme.RENOMEAR, new Renomear(repository));
        map.put(OperacoesFilme.ATUALIZAR_DESCRICAO, new AtualizarDescricao(repository));
        map.put(OperacoesFilme.LISTAR_TODOS, new ListarTodosFilmes(repository));
        map.put(OperacoesFilme.PESQUISAR_POR_NOME, new PesquisarPorNome(repository));
        map.put(OperacoesFilme.ADICIONAR_ATOR, new AdicionarAtor(repository));
        map.put(OperacoesFilme.REMOVER_ATOR, new RemoveAtor(repository));
        map.put(OperacoesFilme.ADICIONAR_DIRETOR, new AdicionaDiretor(repository));
        map.put(OperacoesFilme.REMOVER_DIRETOR, new RemoveDiretor(repository));
        return map;
    }

    public Optional<Command> getCommand(OperacoesFilme operacoesFilme) {
        Command command = commandMap.get(operacoesFilme);
        return Optional.ofNullable(command);
    }
}

