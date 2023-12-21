package aplicacao;

import filme.Artista;
import filme.Ator;
import filme.Diretor;
import filme.Filme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        String nomeFilme;
        String descricaoFilme;
        String nomeAtor;
        String sobreAtor;
        String nomeDiretor;
        String sobreDiretor;

        int opcao;
        boolean on = true;

        Scanner input = new Scanner(System.in);
        Armazenamento armazenamento = new Armazenamento();
        Filme filme;
        Diretor diretor;


        while (on){
            System.out.println(
                    "\n4 -  PESQUISAR FILME\n"
                    + "3 - ADCIONAR DIRETOR A FILME\n"
                    + "2 - ADCIONAR ATOR A FILME\n"
                    + "1 - CADASTRAR FILME\n"
                    + "0 - SAIR"
            );
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao){

                case 4:
                    ArrayList<Ator> atores;

                    System.out.println(" Qual o nome do filme?");
                    nomeFilme = input.nextLine().toLowerCase();

                    filme = armazenamento.buscarFilme(nomeFilme);
                    diretor = filme.getDiretor();
                    atores = filme.getAtores();

                    System.out.println("\n\tFILME");
                    System.out.println(
                            "Nome:" + filme.getNome()
                            +"\nDescrição: " + filme.getDescricao()
                            +"\nData de lançamento: " + filme.getDataLancamento()
                    );
                    if(diretor != null){
                        System.out.println("\n\tDIRETOR DO FILME");
                        System.out.println(diretor.getNome() + ": " + diretor.getDescricao());
                    }
                    System.out.println("\n\tATORES DO FILME");
                    atores.stream().forEach( ator -> {
                        System.out.println(ator.getNome() + ":" + ator.getDescricao());
                    });
                    break;
                case 3:

                    System.out.println("Qual o nome do Diretor?");
                    nomeDiretor = input.nextLine();

                    System.out.println("Sobre o Diretor:");
                    sobreDiretor = input.nextLine();

                    diretor = new Diretor(nomeDiretor, sobreDiretor);

                    System.out.println(" A qual Filme?");
                    nomeFilme = input.nextLine().toLowerCase();
                    filme = armazenamento.buscarFilme(nomeFilme);
                    filme.setDiretor(diretor);
                    break;
                case 2:

                    Ator ator;
                    System.out.println("Qual o nome do Ator?");
                    nomeAtor = input.nextLine().toLowerCase();

                    System.out.println("Sobre ator:");
                    sobreAtor = input.nextLine();

                    ator = new Ator(nomeAtor, sobreAtor);
                    System.out.println("Qual filme que " + nomeAtor + " fez?\n ");
                    nomeFilme = input.nextLine();
                    filme = armazenamento.buscarFilme(nomeFilme);
                    filme.inserirAtor(ator);
                    break;
                case 1:
                    System.out.println("Nome do Filme");
                    nomeFilme = input.nextLine().toLowerCase();

                    System.out.println("Descrição do Filme");
                    descricaoFilme = input.nextLine();
                    System.out.println("Dia do lançamento");
                    int dia = Integer.parseInt(input.nextLine());
                    System.out.println("Mês do lançamento");
                    int mes = Integer.parseInt(input.nextLine());
                    System.out.println("Ano do lançamento");
                    int ano = Integer.parseInt(input.nextLine());

                    LocalDate dataLancamento = 	LocalDate.of(ano,mes,dia);
                    filme = new Filme(nomeFilme, descricaoFilme, dataLancamento);
                    armazenamento.salvarFilme(filme);
                    break;
                case 0:
                    on = false;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        };


//        System.out.println("Nome do Diretor");
//        nomeDiretor = input.nextLine();
//
//        System.out.println("Descrição do Diretor");
//        sobreDiretor = input.nextLine();
//
//        filme = new Filme(nomeFilme, descricaoFilme);
//        Diretor diretor = new Diretor(nomeDiretor, sobreDiretor);
//        filme.setDiretor(diretor);
//        armazenamento.salvarFilme(filme);
//
//        System.out.println(armazenamento.buscarFilme("amar").getDiretor().getNome());
    }

}
