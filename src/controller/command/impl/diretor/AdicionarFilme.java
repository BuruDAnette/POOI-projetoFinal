package controller.command.impl.diretor;

import java.util.Map;

import model.filme.Filme;
import repositories.DiretorRepository;

public class AdicionarFilme extends DiretorCommand {
    public AdicionarFilme(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idDiretor = (Integer) params.get("idDiretor");
        Filme filme = (Filme) params.get("filme");
        repository.adicionarFilme(idDiretor, filme);
    }
}
