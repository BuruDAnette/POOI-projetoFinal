package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

public class ExcluirFilme extends FilmeCommand {
    public ExcluirFilme(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idFilme = (int) params.get("idFilme");
        repository.excluir(idFilme);
    }
}

