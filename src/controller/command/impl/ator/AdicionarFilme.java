package controller.command.impl.ator;

import java.util.Map;

import model.filme.Filme;
import repositories.AtorRepository;

public class AdicionarFilme extends AtorCommand {
    public AdicionarFilme(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idAtor = (Integer) params.get("idAtor");
        Filme filme = (Filme) params.get("filme");
        repository.adicionarFilme(idAtor, filme);
    }
}
