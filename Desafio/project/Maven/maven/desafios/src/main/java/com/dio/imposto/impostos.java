package com.dio.imposto;

import java.io.IOException;
import java.util.Scanner;

// nesse caso poderiam ser feito em 2 métodos separados para calcular as 2 variações de impostos isoladamente FEITO
public class impostos {
    public static double calcularImposto(double renda){
        return (renda - 3000) * 0.18 + (1000 * 0.08);
    }
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        if(renda<=2000D){
            System.out.println("Isento");
        } else if (renda < 3000) {
            imposto = (renda - 2000) * 0.08;
            System.out.println("R$ "+String.format("%.2f", imposto));
        } else if(renda <= 4500){
            imposto =  calcularImposto(renda);
            System.out.println("R$ "+ String.format("%.2f", imposto));
        }
        else {
            imposto = calcularImposto(4500);
            imposto+= (renda-4500)*0.28;
            System.out.println("R$ "+ String.format("%.2f", imposto));
        }

    }
}
