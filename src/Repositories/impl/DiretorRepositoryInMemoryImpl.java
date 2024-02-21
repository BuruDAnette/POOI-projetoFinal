package Repositories.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Repositories.DiretorRepository;
import model.diretor.Diretor;
import model.filme.Filme;

public class DiretorRepositoryInMemoryImpl implements DiretorRepository {

	private List<Diretor> diretores = new ArrayList<Diretor>();
	private static int contador = 0;

	public DiretorRepositoryInMemoryImpl() {

	}

	@Override
	public Diretor inserir(Diretor Diretor) {
		Diretor.setId(++contador);
		diretores.add(Diretor);
		return Diretor;
	}

	@Override
	public Diretor renomear(int id, String nome) {
		Diretor Diretor = diretores.stream().filter(d -> d.getId() == id).findFirst().get();
		Diretor.setNome(nome);
		return Diretor;
	}

	@Override
	public Diretor adicionarFilme(int idDiretor, Filme filme) {
		Diretor Diretor = diretores.stream().filter(d -> d.getId() == idDiretor).findFirst().get();
		Diretor.getFilmes().add(filme);
		filme.getDiretores().add(Diretor);
		return Diretor;
	}

	@Override
	public Diretor removerFilme(int idDiretor, int idFilme) {
		Diretor Diretor = diretores.stream().filter(d -> d.getId() == idDiretor).findFirst().get();
		Filme filme = Diretor.getFilmes().stream().filter(f -> f.getId() == idFilme).findFirst().get();
		Diretor.getFilmes().remove(filme);
		filme.getDiretores().remove(Diretor);
		return Diretor;
	}

	@Override
	public void excluir(int id) {
		diretores.removeIf(a -> a.getId() == id);

	}

	@Override
	public List<Diretor> listarTodos() {
		return diretores;
	}

	@Override
	public List<Diretor> pesquisarPorNome(String nomeOuParteDoNome) {
		return diretores.stream().filter(a->a.getNome().contains(nomeOuParteDoNome)).collect(Collectors.toList());
	}

}

