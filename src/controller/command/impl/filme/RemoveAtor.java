package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

public class RemoveAtor extends FilmeCommand {
    public RemoveAtor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        int idFilme = (int) params.get("idFilme");
        repository.removerAtor(idFilme, idAtor);
    }
}