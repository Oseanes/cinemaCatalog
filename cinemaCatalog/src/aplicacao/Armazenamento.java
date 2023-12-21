package aplicacao;

import filme.Filme;

import java.util.ArrayList;

public class Armazenamento {
    private ArrayList<Filme> filmes;

    public Armazenamento(){
        this.filmes =  new ArrayList<Filme>();
    }

    public Filme buscarFilme(String nome){
        for (Filme filme: this.filmes){
            if(filme.getNome().equals(nome)){
                return filme;
            }
        }
        return null;
    }

    public void salvarFilme(Filme filme){
        this.filmes.add(filme);
    }

    public void associarAtorFilme(){

    }
}