package listadeexercicios01;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        /*
         * 13 - Construa um algoritmo que dado quatro valores, A, B, C e D,
         * o algoritmo imprima o maior e o menor valor.
         */
        double maior = 0, menor = 0;
        Scanner scan = new Scanner(System.in);

        for (int contador = 1; contador <= 4; contador++) {
            System.out.print("Digite o " + contador + "º valor: ");
            double valor = scan.nextDouble();

            if (valor > maior || contador == 1) {
                maior = valor;
            }
            if (valor < menor || contador == 1) {
                menor = valor;
            }
        }
        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);
    }
}
