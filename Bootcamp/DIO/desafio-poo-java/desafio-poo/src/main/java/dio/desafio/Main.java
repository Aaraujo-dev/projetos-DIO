package main.java.dio.desafio;

import main.java.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Bootcamp Java Developer", "Bootcamp de programação com " +
                "foco na linguagem de programação java e suas ferramentas", 114);

        LocalDate data = LocalDate.of(2025,9,1);
        Mentoria mentoria = new Mentoria("Mentoria poo", "Auxiliando em conteúdos de programação orientada a objetos",data);

        List<Conteudo> atividadesJoao= new ArrayList<>();
        atividadesJoao.add(curso);
        atividadesJoao.add(mentoria);



        Bootcamp java = new Bootcamp("Bootcamp de javaaa", "Estudo da linguagem de programação Java");
        Devs joao = new Devs("João", atividadesJoao);

        joao.calcularXpTotal();   // transforma as atividades dentro da lista em xp e limpa a lista
        System.out.println(joao);

        joao.inscrever(java);   // soma 50 de xp ao se inscrever no bootcamp
        joao.progredir();      // soma 20

        System.out.println(joao.getXpTotal());

        System.out.println(atividadesJoao);
    }
}