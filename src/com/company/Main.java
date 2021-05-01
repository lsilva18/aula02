package com.company;

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Pratica01 pratica01 = new Pratica01();
        Pratica02 pratica02 = new Pratica02();
        Pratica03 pratica03 = new Pratica03();
        Pratica04 pratica04 = new Pratica04();
        Scanner input = new Scanner(System.in);
        int numero_pratica;

        System.out.println("Digite o numero da prática que deseja executar");
        numero_pratica = input.nextInt();

        switch (numero_pratica) {
            case 1:
                pratica01.executar();
                break;
            case  2:
                pratica02.executar();
                break;
            case 3:
                pratica03.executar();
                break;
            case 4:
                pratica04.executar();
                break;
            default:
                System.out.println("Digite uma opção válida");
        }
    }
}