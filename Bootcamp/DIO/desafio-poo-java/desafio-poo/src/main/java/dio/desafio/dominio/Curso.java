package main.java.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao,int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.setDescricao(descricao) ;
        this.setTitulo(titulo);
    }
    public Curso() {}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso:" +'\n'+
                " titulo = " + getTitulo() + '\n' +
                " descricao = " + getDescricao() + '\n' +
                " cargaHoraria = " + cargaHoraria ;
    }

    @Override
    public double calcularXp() {
        return 40;
    }
}
