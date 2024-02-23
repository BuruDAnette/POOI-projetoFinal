package repositories;

import java.util.List;

import model.ator.Ator;
import model.diretor.Diretor;
import model.filme.Filme;
import repositories.impl.TipoVinculo;

public interface CrudRepository<T> {
	
	public T inserir(T entry);
	
	public T renomear(int id, String nome);
	
	public void excluir(int id);
	
	public List<T> listarTodos();
	
	public List<T> pesquisarPorNome(String nomeOuParteDoNome);
	
	public void vincular(Filme filme, int id);

	public void desvincular(Filme filme, int id);
	
	public void vincular(TipoVinculo t, Ator ator, int id);

	public void desvincular(TipoVinculo t, Ator ator, int id);
	
	public void vincular(TipoVinculo t, Diretor diretor, int id);

	public void desvincular(TipoVinculo t, Diretor diretor, int id);

}
