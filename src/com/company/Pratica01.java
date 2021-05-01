package com.company;
import java.util.Scanner;

public class Pratica01{

    Scanner teclado = new Scanner(System.in);

    float altura;
    float peso;
    float imc;

    public Pratica01() {
    }

    void executar() {
        System.out.print("Digite sua altura: ");
        altura = teclado.nextFloat();

        System.out.print("Digite seu peso: ");
        peso = teclado.nextFloat();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f ", imc);
        if (imc < 19.1) {
            System.out.println("com condição \"abaixo do peso\"");
        } else if (imc >= 19.1 && imc < 25.8) {
            System.out.println("com condição \"peso normal\"");
        } else if (imc >= 25.8 && imc < 27.3) {
            System.out.println("com condição \"marginalmente acima do peso\"");
        } else if (imc >= 27.3 && imc <= 32.3) {
            System.out.println("com condição acima do peso \"peso ideal\"");
        } else {
            System.out.println("com condição \"obeso(a)\"");
        }
    }
}
