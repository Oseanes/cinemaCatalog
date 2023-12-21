package filme;

public abstract class Artista {
    private String nome;
    private String descricao;

    public Artista(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
