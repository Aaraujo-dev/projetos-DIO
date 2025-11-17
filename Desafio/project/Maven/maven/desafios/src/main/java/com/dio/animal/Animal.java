package com.dio.animal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        int numero = 0;

        // primeira avaliacao
        if (AN1.equals("vertebrado")) {
            List<ArrayList> vertebrados = new ArrayList<>();

            String ave = "ave"; // para verificar

            vertebrados.add(new ArrayList<>(List.of("carnivoro", "onivoro", 1,2))); // caso seja ave
            vertebrados.add(new ArrayList<>(List.of("onivoro","herbivoro", 3,4))); // não ave / mamifero

            // segunda avaliação
            if (AN2.equals(ave)) {
                for (int i = 1; i <= 2; i++) {
                    if (AN3.equals(vertebrados.get(0).get(i-1))) {
                        numero = (int) vertebrados.get(0).get(1 + i);
                        break;
                    }
                }
                // mamifero
            } else if(AN2.equals("mamifero")) {
                for (int i = 1; i <= 2; i++) {
                    if (AN3.equals(vertebrados.get(1).get(i-1))) {
                        numero = (int) vertebrados.get(1).get(1 + i);
                        break;
                    }

                }
            }
        } else if (AN1.equals("invertebrado")) {
            List<ArrayList> invertebrados = new ArrayList<>();

            String inseto = "inseto";
            invertebrados.add(new ArrayList<>(List.of("hematofago", "herbivoro", 5,6))); // caso seja ave
            invertebrados.add(new ArrayList<>(List.of("hematofago","onivoro", 7,8))); // não ave / mamifero

            if (AN2.equals(inseto)) {
                for (int i = 1; i <= 2; i++) {
                    if (AN3.equals(invertebrados.get(0).get(i-1))) {
                        numero = (int) invertebrados.get(0).get(1 + i);
                        break;
                    }
                }
                // anelideo
            } else if (AN2.equals("anelideo")) {
                for (int i = 1; i <= 2; i++) {
                    if (AN3.equals(invertebrados.get(1).get(i-1))) {
                        numero = (int) invertebrados.get(1).get(1 + i);
                        break;
                    }

                }
            }
        }

        String resultado;
        switch (numero){
            case (1):resultado = "aguia";
                break;
            case (2):resultado = "pomba";
                break;
            case (3):resultado = "homem";
                break;
            case (4):resultado = "vaca";
                break;
            case (5):resultado = "pulga";
                break;
            case (6):resultado = "lagarta";
                break;
            case (7):resultado = "sanguessuga";
                break;
            case (8):resultado = "minhoca";
                break;
            default:
                IOException IOException = null;
                throw IOException;
        }
        System.out.println(resultado);
    }
}