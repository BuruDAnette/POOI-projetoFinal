package Repositories;

import java.util.List;

import model.diretor.Diretor;
import model.filme.Filme;

public interface DiretorRepository {

	public Diretor inserir(Diretor diretor);

	public Diretor renomear(int id, String nome);

	public Diretor adicionarFilme(int idDiretor, Filme filme);

	public Diretor removerFilme(int idDiretor, int idFilme);

	public void excluir(int id);
	
	public List<Diretor> listarTodos();

	public List<Diretor> pesquisarPorNome(String nome);

}
