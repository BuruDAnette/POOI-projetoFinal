package controller.command.impl.diretor;

import java.util.Map;

import model.diretor.Diretor;
import repositories.DiretorRepository;

public class NovoDiretor extends DiretorCommand {
    public NovoDiretor(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Diretor diretor = (Diretor) params.get("diretor");
        repository.inserir(diretor);
    }
}

