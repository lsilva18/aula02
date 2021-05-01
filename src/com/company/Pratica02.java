package com.company;

import java.util.Scanner;

public class Pratica02{
    Scanner teclado = new Scanner(System.in);
    int codigo, quantidade;
    float preco;

    void executar(){
        System.out.println("----------------------------------------");
        System.out.println("\tCachorro quente\t100 \t1.20");
        System.out.println("\tBauru simples\t101 \t1.30");
        System.out.println("\tBauru com ovo\t102 \t1.50");
        System.out.println("\tHamburguer\t\t103 \t1.20");
        System.out.println("\tCheeseurguer\t104 \t1.30");
        System.out.println("\tRefrigerante\t105 \t1.00");
        System.out.println("----------------------------------------");

        //entrada de dados
        System.out.println("Digite o código do item desejado:");
        codigo = teclado.nextInt();
        System.out.println("Digite a quantidade do item desejado:");
        quantidade = teclado.nextInt();

        //selecao do valor do item
        switch (codigo){
            case 100:
                preco = 1.2f;
                break;
            case 101:
                preco = 1.3f;
                break;
            case 102:
                preco = 1.5f;
                break;
            case 103:
                preco = 1.2f;
                break;
            case 104:
                preco = 1.3f;
                break;
            case 105:
                preco = 1.0f;
                break;
            default:
                System.out.println("Digite um código válido.");
        }

        //Total do pedido
        System.out.printf("O valor total do seu pedido é: %.2f\n", preco * quantidade);

        System.out.println("Volte sempre");

    }

}
