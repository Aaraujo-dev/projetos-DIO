package main.java.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

import static main.java.dio.desafio.dominio.Conteudo.XP_INICIAL;

public class Devs {
    private String nome;
    private List<Conteudo> atividades = new ArrayList<>();
    double xpTotal = XP_INICIAL;


    public Devs() {}

    public Devs(String nome, List<Conteudo>atividades) {
        this.nome = nome;
        this.atividades = atividades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Conteudo> atividades) {
        this.atividades = atividades;
    }

    public double getXpTotal() {
        return xpTotal;
    }

    public void inscrever(Bootcamp bootcamp){
        this.xpTotal+=50;
    }

    public void progredir(){
        this.xpTotal += 20;
    }

    public void calcularXpTotal() {
        double xpAtual = xpTotal;
        for (Conteudo atividade:atividades) {
            xpAtual += atividade.calcularXp();
        }
        atividades.clear();
        this.xpTotal = xpAtual;
    }

    public void minhasAtividades(List<Conteudo> atividades){
        for (Conteudo atividade:atividades){
            System.out.println(atividade) ;
            System.out.println("\n") ;
        }
    }

    @Override
    public String toString() {
        return "Devs : " +'\n'+
                " nome = " + nome + '\n' +
                " xpTotal= " + xpTotal;
    }
}
