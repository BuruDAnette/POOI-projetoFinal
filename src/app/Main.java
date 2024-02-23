package app;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

import controller.AtorController;
import controller.DiretorController;
import controller.FilmeController;
import controller.command.impl.operacao.OperacoesAtor;
import controller.command.impl.operacao.OperacoesDiretor;
import controller.command.impl.operacao.OperacoesFilme;
import model.ator.Ator;
import model.ator.AtorBuilder;
import model.diretor.Diretor;
import model.diretor.DiretorBuilder;
import model.filme.Filme;
import model.filme.FilmeBuilder;
import repositories.impl.AtorRepositoryInMemoryImpl;
import repositories.impl.DiretorRepositoryInMemoryImpl;
import repositories.impl.FilmeRepositoryInMemoryImpl;

public class Main {

	//private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

        // Inicialização dos repositórios e controllers
        //FilmeRepositoryInMemoryImpl filmeRepository = FilmeRepositoryInMemoryImpl.getInstance();
        //AtorRepositoryInMemoryImpl atorRepository = AtorRepositoryInMemoryImpl.getInstance();
        //DiretorRepositoryInMemoryImpl diretorRepository = DiretorRepositoryInMemoryImpl.getInstance();
        //FilmeController filmeController = FilmeController.getInstance(filmeRepository);
        //AtorController atorController = AtorController.getInstance(atorRepository);
        //DiretorController diretorController = DiretorController.getInstance(diretorRepository);

        // Loop principal da aplicação
        //while (true) {
         //   exibirMenu();

        //    int opcao = scanner.nextInt();
        //    scanner.nextLine(); // Consumir o '\n'

        //    Map<String, Object> params = new HashMap<>();

        //    switch (opcao) {
                //case 1:
                //   // Inserir Filme
                //    System.out.println("Digite o nome do filme: ");
                ///    String nomeFilme = scanner.nextLine();
                //    System.out.println("Digite a descrição do filme: ");
                //    String descricaoFilme = scanner.nextLine();
                //    Filme filme = new FilmeBuilder().comNome(nomeFilme).comDescricao(descricaoFilme).build();
                //    params.put("filme", filme);
                //    filmeController.executar(OperacoesFilme.INSERIR, params);
                //    break;
                //case 2:
                //    // Inserir Ator
                //    System.out.println("Digite o nome do ator: ");
                //    String nomeAtor = scanner.nextLine();
                //    Ator ator = new AtorBuilder().comNome(nomeAtor).build();
                //    params.put("ator", ator);
                //    atorController.executar(OperacoesAtor.INSERIR, params);
                //    break;
                //case 3:
                //    // Inserir Diretor
                 //   System.out.println("Digite o nome do diretor: ");
                ///    String nomeDiretor = scanner.nextLine();
                //    Diretor diretor = new DiretorBuilder().comNome(nomeDiretor).build();
                //    params.put("diretor", diretor);
                //    diretorController.executar(OperacoesDiretor.INSERIR, params);
                //    break;
                //case 4:
                //    // Listar Filmes
                //   filmeController.executar(OperacoesFilme.LISTAR_TODOS);
                //    break;
                //case 5:
                //    // Listar Atores
                //    atorController.executar(OperacoesAtor.LISTAR_TODOS);
                //    break;
                //case 6:
                //    // Listar Diretores
                //    diretorController.executar(OperacoesDiretor.LISTAR_TODOS);
                //    break;
				//case 7:
				//	// Vincular Ator a Filme
				//	System.out.println("Digite o ID do ator: ");
				//	int idAtor = scanner.nextInt();
				//	System.out.println("Digite o nome do filme: ");
				//	String nomeFilmeVincularAtor = scanner.nextLine();
				//	params.put("idAtor", idAtor);
				//	params.put("filme", nomeFilmeVincularAtor);
				//	atorController.executar(OperacoesAtor.ADICIONAR_FILME, params);
				//	break;		
				//	
				//	params.put("idAtor", ator1.getId());
				//	params.put("filme", filme1);
				//	atorController.executar(OperacoesAtor.ADICIONAR_FILME, params);
				//case 8:
				//	// Vincular Diretor a Filme
				//	System.out.println("Digite o ID do diretor: ");
				//	int idDiretor = scanner.nextInt();
				//	System.out.println("Digite o nome do filme: ");
				//	String nomeFilmeVincularDiretor = scanner.nextLine();
				//	params.put("idDiretor", idDiretor);
				//	params.put("filme", filmeRepository.findByNome(nomeFilmeVincularDiretor));
				//	diretorController.executar(OperacoesDiretor.ADICIONAR_FILME, params);
				//	break;
				//case 9:
				//	// Renomear Filme
				//	System.out.println("Digite o ID do filme: ");
				//	int idFilmeRenomear = scanner.nextInt();
				//	System.out.println("Digite o novo nome do filme: ");
				//	String novoNomeFilme = scanner.nextLine();
				//	params.put("idFilme", idFilmeRenomear);
				//	params.put("nome", novoNomeFilme);
				//	filmeController.executar(OperacoesFilme.RENOMEAR, params);
				//	break;
				//case 10:
				//	// Atualizar Descrição do Filme
				//	System.out.println("Digite o ID do filme: ");
				//	int idFilmeAtualizarDescricao = scanner.nextInt();
				//	System.out.println("Digite a nova descrição do filme: ");
				//	String novaDescricaoFilme = scanner.nextLine();
				//	params.put("idFilme", idFilmeAtualizarDescricao);
				//	params.put("descricao", novaDescricaoFilme);
				///	filmeController.executar(OperacoesFilme.ATUALIZAR_DESCRICAO, params);
				//	break;
				//case 11:
				//	// Pesquisar Filme por Nome
				//	System.out.println("Digite a palavra-chave para pesquisa: ");
				//	String palavraChavePesquisa = scanner.nextLine();
				//	params.put("keywords", palavraChavePesquisa);
				//	filmeController.executar(OperacoesFilme.PESQUISAR_POR_NOME, params);
				//	break;
				//case 12:
				//	// Remover Filme
				//	System.out.println("Digite o ID do filme: ");
				//	int idFilmeRemover = scanner.nextInt();
				//	params.put("idFilme", idFilmeRemover);
				//	filmeController.executar(OperacoesFilme.EXCLUIR, params);
				//	break;
				//case 13:
				//	// Remover Ator
				//	System.out.println("Digite o ID do ator: ");
				//	int idAtorRemover = scanner.nextInt();
				//	params.put("idAtor", idAtorRemover);
				//	atorController.executar(OperacoesAtor.EXCLUIR, params);
				//	break;
				//case 14:
				//	// Remover Diretor
				//	System.out.println("Digite o ID do diretor: ");
				//	int idDiretorRemover = scanner.nextInt();
				//	params.put("idDiretor", idDiretorRemover);
				//	diretorController.executar(OperacoesDiretor.EXCLUIR, params);
				//	break;
				//case 15:
				//	// Desvincular Ator de Filme
				//	System.out.println("Digite o ID do ator: ");
				//	int idAtorDesvincular = scanner.nextInt();
				//	System.out.println("Digite o nome do filme: ");
				//	String nomeFilmeDesvincularAtor = scanner.nextLine();
				//	params.put("idAtor", idAtorDesvincular);
				//	params.put("filme", filmeRepository.findByNome(nomeFilmeDesvincularAtor));
				//	atorController.executar(OperacoesAtor.REMOVER_FILME, params);
				//	break;
				//case 16:
                //    // Desvincular Diretor de Filme
                //    System.out.println("Digite o ID do diretor: ");
                //    int idDiretorDesvincular = scanner.nextInt();
                //    System.out.println("Digite o nome do filme: ");
                //    String nomeFilmeDesvincularDiretor = scanner.nextLine();
                //    params.put("idDiretor", idDiretorDesvincular);
                //    params.put("filme", filmeRepository.findByNome(nomeFilmeDesvincularDiretor));
                //    diretorController.executar(OperacoesDiretor.REMOVER_FILME, params);
                //    break;
                //case 17:
                //    // Sair da aplicação
                //    System.out.println("Saindo da aplicação...");
                //    return;
                //default:
        //            System.out.println("Opção inválida!");
        //    }
//
        //    System.out.println();
        //}
		
		//Builders filme
		Filme filme1 = new FilmeBuilder().comNome("Batman").comDescricao("Descricao Batman").build();
		Filme filme2 = new FilmeBuilder().comNome("Spiderman").comDescricao("Descricao Spiderman").build();
		
		//Builders ator
		Ator ator1 = new AtorBuilder().comNome("Joao").build();
		Ator ator2 = new AtorBuilder().comNome("Joaquim").build();
		
		//Builders diretor
		Diretor diretor1 = new DiretorBuilder().comNome("Maria").build();
		Diretor diretor2 = new DiretorBuilder().comNome("Ana").build();

		//Cria params
		Map<String, Object> params = new HashMap<>();
		
		//FilmeController
		FilmeController filmeController =  FilmeController.getInstance(FilmeRepositoryInMemoryImpl.getInstance());
		params.put("filme", filme1);
		filmeController.executar(OperacoesFilme.INSERIR, params);	
		params.put("filme", filme2);
		filmeController.executar(OperacoesFilme.INSERIR, params);
		
		//AtorController
		AtorController atorController = AtorController.getInstance(AtorRepositoryInMemoryImpl.getInstance());
		params.put("ator", ator1);
		atorController.executar(OperacoesAtor.INSERIR, params);
		params.put("ator", ator2);
		atorController.executar(OperacoesAtor.INSERIR, params);
		
		//DiretorController
		DiretorController diretorController = DiretorController.getInstance(DiretorRepositoryInMemoryImpl.getInstance());
		params.put("diretor", diretor1);
		diretorController.executar(OperacoesDiretor.INSERIR, params);
		params.put("diretor", diretor2);
		diretorController.executar(OperacoesDiretor.INSERIR, params);
			
		//Vincula o filme1 ao ator1
		params.put("idAtor", ator1.getId());
		params.put("filme", filme1);
		atorController.executar(OperacoesAtor.ADICIONAR_FILME, params);

		//Vincula o diretor1 ao filme1
		params.put("idFilme", filme1.getId());
		params.put("diretor", diretor1);
		filmeController.executar(OperacoesFilme.ADICIONAR_DIRETOR, params);
		
		//Vincula o filme2 ao diretor2
		params.put("idDiretor", diretor2.getId());
		params.put("filme", filme2);
		diretorController.executar(OperacoesDiretor.ADICIONAR_FILME, params);
		
		//Vincula o filme2 ao ator2
		params.put("idAtor", ator2.getId());
		params.put("filme", filme2);
		atorController.executar(OperacoesAtor.ADICIONAR_FILME, params);

		//Print
		atorController.executar(OperacoesAtor.LISTAR_TODOS);
		diretorController.executar(OperacoesDiretor.LISTAR_TODOS);
		filmeController.executar(OperacoesFilme.LISTAR_TODOS);
		
		//Renomeia filme 1
		params.put("idFilme", filme1.getId());
		params.put("nome", "Star Wars");
		filmeController.executar(OperacoesFilme.RENOMEAR, params);
		
		//Atualiza descricao do filme1
		params.put("idFilme", filme1.getId());
		params.put("descricao", "Descricao Star Wars");
		filmeController.executar(OperacoesFilme.ATUALIZAR_DESCRICAO, params);
		
		//Pesquisa pelo novo nome do filme1
		params.put("keywords", "star");
		filmeController.executar(OperacoesFilme.PESQUISAR_POR_NOME, params);
    }

    //private static void exibirMenu() {
    //    System.out.println("---------------------------");
    //    System.out.println("** Sistema de Gerenciamento de Filmes **");
    //    System.out.println("---------------------------");
    //    System.out.println("1. Inserir Filme");
    //    System.out.println("2. Inserir Ator");
    //    System.out.println("3. Inserir Diretor");
    //    System.out.println("4. Listar Filmes");
    //    System.out.println("5. Listar Atores");
    //    System.out.println("6. Listar Diretores");
    //    System.out.println("7. Vincular Ator a Filme");
     //   System.out.println("8. Vincular Diretor a Filme");
    //    System.out.println("9. Renomear Filme");
   //     System.out.println("10. Atualizar Descrição do Filme");
    //    System.out.println("11. Pesquisar Filme por Nome");
    //    System.out.println("12. Remover Filme");
    //    System.out.println("13. Remover Ator");
     //   System.out.println("14. Remover Diretor");
     //   System.out.println("15. Desvincular Ator de Filme");
    //    System.out.println("16. Desvincular Diretor de Filme");
     //   System.out.println("17. Sair");
    //    System.out.println("---------------------------");
    //    System.out.println("Digite a sua opção: ");
    //}


		

}