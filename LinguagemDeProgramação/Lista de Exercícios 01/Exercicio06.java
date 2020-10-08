package listadeexercicios01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main (String[] args) {
        /*
         * 6 - Escreva um algoritmo em JAVA que leia dois valores inteiros (A e B)
         * e apresente o resultado do quadrado da soma dos valores lidos.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        int valor1 = scan.nextInt();

        System.out.print("Digite o 2º valor: ");
        int valor2 = scan.nextInt();

        int soma = valor1 + valor2;
        int quadradoDaSoma = (int) Math.pow(soma, 2);
        System.out.println("O quadrado da soma de " + valor1 + " e " + valor2 + " é igual a: " + quadradoDaSoma);
    }
}
