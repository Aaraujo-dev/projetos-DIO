package main.java.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp(){
        return 20;
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    public Mentoria() {}

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: " +'\n'+
                " titulo = " + getTitulo() + '\n' +
                " descricao = " + getDescricao() + '\n' +
                " cargaHoraria = " + data ;
    }
}
