package filme;

import java.time.LocalDate;
import java.util.ArrayList;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private String descricao;
    private Diretor diretor;
    private  ArrayList<Ator> atores;

    public Filme(String nome, String descricao, LocalDate dataLancamento){
        this.atores =  new ArrayList<Ator>();
        this.nome = nome;
        this.descricao = descricao;
        this.dataLancamento = dataLancamento;
    }

    public void inserirAtor(Ator ator){
        this.atores.add(ator);
    }

    public void setDiretor( Diretor diretor){
        this.diretor = diretor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }


}
