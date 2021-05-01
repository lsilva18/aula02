package com.company;

import java.util.Scanner;

public class Pratica03 {
    Scanner entrada = new Scanner(System.in);
    int divisor, inicio, fim;

    void executar(){

        // entrada de dados
        System.out.println("Você deseja verificar os números divisíveis por valor?");
        divisor = entrada.nextInt();
        System.out.println("Qual o início do intervalo que deseja considerar?");
        inicio = entrada.nextInt();
        System.out.println("Qual o final do intervalo que deseja considerar?");
        fim = entrada.nextInt();

        // impressao dos divisiveis
        for(int i=inicio; i<=fim ; i++){
            if( i % divisor == 0 ){
                System.out.println(i);
            }
        }
    }
}
