package controller.command.impl.filme;

import java.util.Map;

import model.filme.Filme;
import repositories.FilmeRepository;

public class NovoFilme extends FilmeCommand {
    public NovoFilme(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Filme filme = (Filme) params.get("filme");
        repository.inserir(filme);
    }
}