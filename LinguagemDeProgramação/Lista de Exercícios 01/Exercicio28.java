package listadeexercicios01;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        /*
        * 28 - Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos
        * deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
        * A entrada de dados deve terminar quando for lido um número negativo.
        */

        Scanner scan = new Scanner(System.in);
        int intervalo0A25 = 0, intervalo26A50 = 0, intervalo51A75 = 0, intervalo76A100 = 0;

        System.out.print("Digite um número (número negativo encerra): ");
        int numero = scan.nextInt();
        while (numero >= 0) {
            if (numero <= 25) {
                intervalo0A25++;
            }
            else if (numero <= 50) {
                intervalo26A50++;
            }
            else if (numero <= 75) {
                intervalo51A75++;
            }
            else if (numero <= 100) {
                intervalo76A100++;
            }

            System.out.print("Digite um número (número negativo encerra): ");
            numero = scan.nextInt();
        }
        System.out.println("=============================");
        System.out.println("Total de números no intervalo [0-25]:   " + intervalo0A25);
        System.out.println("Total de números no intervalo [26-50]:  " + intervalo26A50);
        System.out.println("Total de números no intervalo [51-75]:  " + intervalo51A75);
        System.out.println("Total de números no intervalo [76-100]: " + intervalo76A100);
        System.out.println("=============================");
    }
}
