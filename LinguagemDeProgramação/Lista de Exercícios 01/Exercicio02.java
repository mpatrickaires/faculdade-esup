package listadeexercicios01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main (String[] args) {
        /*
         * 2 - Faça um programa para ler dois números reais, faça a divisão do primeiro número
         * pelo segundo (se o segundo for diferente de zero).
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("1º Número (numerador): ");
        double numerador = scan.nextDouble();

        System.out.print("2º Número (denominador): ");
        double denominador = scan.nextDouble();

        if (denominador == 0) {
            System.out.println("ERRO: O denominador não pode ser igual a 0");
        }
        else {
            double divisao = numerador / denominador;
            System.out.println("A divisão de " + numerador + " por " + denominador + " é igual a " + divisao);
        }
    }
}
