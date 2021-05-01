package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Pratica04 {
    Scanner input = new Scanner(System.in);
    int opcao, numero;
    double resultado;

    void executar(){
        do{
            System.out.println("Digite a opção desejada:");
            System.out.println("1. Raiz quadrada");
            System.out.println("2. A metade");
            System.out.println("3. 10% do número");
            System.out.println("4. O dobro");
            System.out.println("5. Sair");
            opcao = input.nextInt();

            System.out.println("Digite o número(inteiro) para o qual de seja realiza a operação:");
            numero = input.nextInt();

            switch (opcao){
                case 1:
                    resultado = Math.sqrt(numero);
                    System.out.printf("O resultado da operacao raiz quadrada é: %.2f\n", resultado );
                    break;
                case 2:
                    resultado = (double) numero/2;
                    System.out.printf("O resultado da operacao metade é: %.2f\n", resultado );
                    break;
                case 3:
                    resultado = numero * 0.10;
                    System.out.printf("O resultado da operacao 10%% é: %.2f\n", resultado );
                    break;
                case 4:
                    resultado = 2 * numero;
                    System.out.printf("O resultado da operacao dobro é: %.2f\n", resultado );
                    break;
                case 5:
                    System.out.println("Até a próxima!  ;-p" );
                    break;
                default:
                    System.out.println("O resultado da operacao é: ");
                    break;

            }

        }while(opcao != 5);


    }
}
