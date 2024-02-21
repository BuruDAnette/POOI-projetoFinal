package dto;

import model.filme.Filme;
import model.ator.Ator;
import model.ator.AtorBuilder;

@SuppressWarnings("preview")
public record AtorDTO(int id, String nome, List<Filme> filmes) {
	
    public Ator toAtor(){
            return new AtorBuilder()
                    .comNome(nome)
                    .comFilmes(filmes)
                    .build();
    }
}
