package listadeexercicios01;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        /*
         * 11 - Faça um programa para ler dois números reais e verificar se ambos são maiores que zero.
         * Caso positivo, informar “Valores são válidos”. Caso contrário, informar “Valores inválidos”.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o 1º Número: ");
        double numero1 = scan.nextDouble();

        System.out.print("Digite o 2º Número: ");
        double numero2 = scan.nextDouble();

        if (numero1 > 0 && numero2 > 0) {
            System.out.println("Valores são válidos!");
        }
        else {
            System.out.println("Valores inválidos!");
        }
    }
}
