package com.dio.triangulo;

import java.io.IOException;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

        // calcula maior
        maior = Math.max(A,B);
        maior = Math.max(maior,C);

        soma = A + B + C - maior;

        // verifica se é triangulo
        if(maior < soma){
            System.out.println("Perimetro = "+ String.format("%.1f",(A+B+C)));
        }else {
            System.out.println("Area = " +String.format("%.1f", ((A + B) * C) / 2));
        }
    }
}
