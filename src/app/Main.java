package app;

import java.util.Scanner;

import Repositories.impl.AtorRepositoryInMemoryImpl;
import Repositories.impl.DiretorRepositoryInMemoryImpl;
import Repositories.impl.FilmeRepositoryInMemoryImpl;
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

		/*
		 * Scanner sc = new Scanner (System.in) ; System.out.
		 * println("Insira nome e descri��o do filme, separados por v�rgula: "); var
		 * nameAndDescription = sc.nextLine (); String[] split =
		 * nameAndDescription.split(","); var nome = split[0]; var descricao = split[1];
		 */

		//Builders
		Filme filme = new FilmeBuilder().comNome("Batman").comDescricao("Descricao").build();
		Filme filme2 = new FilmeBuilder().comNome("Spiderman").comDescricao("Descricao").build();
		Ator ator = new AtorBuilder().comNome("Joao").build();
		Diretor diretor = new DiretorBuilder().comNome("Maria").build();

		//FilmeController
		FilmeController filmeController = new FilmeController(new FilmeRepositoryInMemoryImpl());
		filmeController.executar("inserir", filme);
		filmeController.executar("inserir", filme2);

		filmeController.executar("adicionarAtor", filme.getId(), ator);
		filmeController.executar("adicionarDiretor", filme.getId(), diretor);
		
		filmeController.executar("adicionarAtor", filme2.getId(), ator);
		filmeController.executar("adicionarDiretor", filme2.getId(), diretor);
		
		//AtorController
		AtorController atorController = new AtorController(new AtorRepositoryInMemoryImpl());
		atorController.executar("inserir", ator);
		
		//DiretorController
		DiretorController diretorController = new DiretorController(new DiretorRepositoryInMemoryImpl());
		diretorController.executar("inserir", diretor);
		
		//Se um ator for exclu�do n�o d� mais erro, s� n�o aparece mais o nome dele
		//atorController.executar("excluir", 1);
		//Print
		atorController.executar("listarTodos");
		filmeController.executar("listarTodos");
		diretorController.executar("listarTodos");
		
		//sc.close();

	}

}