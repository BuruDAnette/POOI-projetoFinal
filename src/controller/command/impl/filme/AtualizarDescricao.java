package controller.command.impl.filme;

import java.util.Map;

import repositories.FilmeRepository;

/**
 * The type Atualizar descricao.
 */
public class AtualizarDescricao extends FilmeCommand {
    /**
     * Instantiates a new Atualizar descricao.
     *
     * @param repository the repository
    */

    public AtualizarDescricao(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idFilme = (int) params.get("idFilme");
        String descricao = (String) params.get("descricao");
        repository.atualizarDescricao(idFilme, descricao);

    }
}
