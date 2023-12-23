package aplicacao;

import filme.Filme;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Filme> filmes;

    public Catalogo(){
        this.filmes =  new ArrayList<Filme>();
    }

    public Filme buscarFilme(String nome){

        for (Filme filme: this.filmes){
            if(filme.getNome().equals(nome)){
                return filme;
            }
        }
        throw new RuntimeException("Esse FILME NÃO está cadastrado!");
    }

    public void salvarFilme(Filme filme){
        this.filmes.add(filme);
    }

}
