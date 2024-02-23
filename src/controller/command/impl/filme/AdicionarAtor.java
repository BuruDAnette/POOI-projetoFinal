package controller.command.impl.filme;

import java.util.Map;

import model.ator.Ator;
import repositories.FilmeRepository;

public class AdicionarAtor extends FilmeCommand {
    public AdicionarAtor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idFilme = (Integer) params.get("idFilme");
        Ator ator = (Ator) params.get("ator");
        repository.adicionarAtor(idFilme, ator);
    }
}
