package com.dio.quitanda;

import java.util.*;


public class quitanda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt(); //kgs de morango
        int macas = input.nextInt();  // kgs de maca

        int kgsTotal = morangos+macas;
        double valorMorangos;
        double valorMacas;

        //preço morangos
        if ( morangos <= 5 ){
            valorMorangos = morangos*2.5;
        }
        else{
            valorMorangos = morangos*2.2;
        }

        //preço maças
        if ( macas <= 5 ){
            valorMacas = macas*1.8;
        }
        else{
            valorMacas = macas*1.5;
        }

        double valorTotal = valorMacas+valorMorangos;

        if (valorTotal>25D || kgsTotal>8){
            valorTotal -= valorTotal*0.1;
        }
        System.out.println(valorTotal);
    }
}
