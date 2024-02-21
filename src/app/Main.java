package app;

import java.util.Scanner;

import controller.AtorController;
import controller.DiretorController;
import controller.FilmeController;
import model.ator.Ator;
import model.ator.AtorBuilder;
import model.diretor.Diretor;
import model.diretor.DiretorBuilder;
import model.filme.Filme;
import model.filme.FilmeBuilder;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in) ;
		System.out.println("Insira nome e descricao do filme, separados por virgula: ");
		var nameAndDescription = sc.nextLine ();
		String[] split = nameAndDescription.split(",");
		var nome = split[0];
		var descricao = split[1];

		//Builders
		Filme filme = new FilmeBuilder().comNome(nome).comDescricao(descricao).build();
		Ator ator = new AtorBuilder().comNome("Joao").build();
		Diretor diretor = new DiretorBuilder().comNome("Maria").build();

		//FilmeController
		FilmeController filmeController = new FilmeController(new FilmeRepositoryInMemoryImpl());
		filmeController.executar("inserir", filme);
		filmeController.executar("adicionarAtor", filme.getId(), ator);
		filmeController.executar("adicionarDiretor", filme.getId(), diretor);
		
		//AtorController
		AtorController atorController = new AtorController(new AtorRepositoryInMemoryImpl());
		atorController.executar("inserir", ator);
		
		//DiretorController
		DiretorController diretorController = new DiretorController(new DiretorRepositoryInMemoryImpl());
		diretorController.executar("inserir", diretor);
		
		//Print
		atorController.executar("listarTodos");
		filmeController.executar("listarTodos");
		diretorController.executar("listarTodos");
		
		sc.close();

	}

}
