package controller.command.impl.ator;

import java.util.Map;

import model.ator.Ator;
import repositories.AtorRepository;

public class NovoAtor extends AtorCommand {
    public NovoAtor(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Ator Ator = (Ator) params.get("ator");
        repository.inserir(Ator);
    }
}