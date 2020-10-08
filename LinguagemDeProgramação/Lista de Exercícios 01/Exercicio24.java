package listadeexercicios01;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        /*
         * 24 - Faça um programa que solicite n entradas de números e no final
         * ele informe o maior valor e o menor valor informado.
         */

        Scanner scan = new Scanner(System.in);
        String opcao;
        int numero, totalNumeros = 0, maiorNumero = 0, menorNumero = 0;

        do {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();
            scan.nextLine();

            if (numero > maiorNumero || totalNumeros == 0) {
                maiorNumero = numero;
            }
            if (numero < menorNumero || totalNumeros == 0) {
                menorNumero = numero;
            }
            totalNumeros += 1;

            System.out.print("Deseja continuar? [S/N] ");
            opcao = scan.nextLine().toUpperCase();
        } while (!opcao.equals("N"));

        System.out.println("Maior número informado: " + maiorNumero);
        System.out.println("Menor número informado: " + menorNumero);
    }
}
