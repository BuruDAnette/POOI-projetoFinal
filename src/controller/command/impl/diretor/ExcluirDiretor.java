package controller.command.impl.diretor;

import java.util.Map;

import repositories.DiretorRepository;

public class ExcluirDiretor extends DiretorCommand {
    public ExcluirDiretor(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        repository.excluir(idDiretor);
    }
}
