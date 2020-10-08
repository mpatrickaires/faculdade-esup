package listadeexercicios01;

import java.util.Scanner;

public class Exercicio14 {

    public static void main (String[] args) {
        /*
         * 14 - Faça um algoritmo que leia os valores A, B, C
         * e imprima na tela se a soma de A + B é menor que C.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        double valorA = scan.nextDouble();
        System.out.print("Digite o valor B: ");
        double valorB = scan.nextDouble();
        System.out.print("Digite o valor C: ");
        double valorC = scan.nextDouble();

        if (valorA + valorB < valorC) {
            System.out.println("O resultado da soma A + B é MENOR do que o valor de C");
        }
        else {
            System.out.println("O resultado da soma A + B é NÃO É MENOR do que o valor de C");
        }
    }
}
