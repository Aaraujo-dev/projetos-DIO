package main.java.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String atividades;
    private final LocalDate inicio = LocalDate.now();
    private final LocalDate fim = inicio.plusDays(50);

    public Bootcamp(String nome,String atividades) {
        this.nome = nome;
        this.atividades = atividades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }
}
