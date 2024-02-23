package controller.command.impl.filme;

import java.util.Map;

import model.diretor.Diretor;
import repositories.FilmeRepository;

public class AdicionaDiretor extends FilmeCommand {
    public AdicionaDiretor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {

        int idFilme = (int) params.get("idFilme");
        Diretor diretor = (Diretor) params.get("diretor");
        repository.adicionarDiretor(idFilme, diretor);

    }
}
