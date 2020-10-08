package listadeexercicios01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        /*
         * 7 - Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a convertida
         * em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5, na qual F é a
         * temperatura em Fahrenheit e C é a temperatura em Celsius;
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
