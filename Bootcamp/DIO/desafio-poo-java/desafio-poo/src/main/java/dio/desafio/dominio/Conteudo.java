package main.java.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_INICIAL = 10;
    private String titulo,descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
