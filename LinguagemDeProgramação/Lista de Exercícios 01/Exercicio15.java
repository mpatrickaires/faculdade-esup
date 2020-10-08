package listadeexercicios01;

import java.util.Scanner;

public class Exercicio15 {

    public static void main (String[] args) {
        // 15 - Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.

        Scanner scan = new Scanner(System.in);

        System.out.println("===== VERIFICADOR DE PAR OU ÍMPAR =====");
        System.out.print("Digite um número para verificar: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR!");
        }
        else {
            System.out.println("O número " + numero + " é ÍMPAR!");
        }
    }
}
