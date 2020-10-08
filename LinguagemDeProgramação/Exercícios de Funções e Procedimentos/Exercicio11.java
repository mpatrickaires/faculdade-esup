package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio11 {
    /*
    * 11 - Escreva um procedimento que receba um número arábico inteiro e imprima o corresponde número em romano.
    * Por exemplo, para 5 a saída desejada é “V”. A função deve ser capaz de gerar o número romano para os
    * 50 primeiros inteiros. Uma mensagem de erro deve ser mostrada caso um número fora dessa faixa seja recebido.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("===== CONVERSOR DE NÚMERO ARÁBICO PARA ROMANO =====");
        System.out.print("Escreva um número entre 1 e 50: ");
        int numero = scan.nextInt();
        mostrarNumeroRomano(numero);
    }

    static void mostrarNumeroRomano (int numero) {
        if (numero < 1 || numero > 50) {
            System.out.println("ERRO: O número deve estar entre 1 e 50");
        }
        else {
            System.out.print(numero + " em número romano: ");
            while (numero == 50) {
                System.out.print("L");
                numero -= 50;
            }
            while (numero >= 40) {
                System.out.print("XL");
                numero -= 40;
            }
            while (numero >= 10) {
                System.out.print("X");
                numero -= 10;
            }

            while (numero >= 9) {
                System.out.println("IX");
                numero -= 9;
            }

            while (numero >= 5) {
                System.out.print("V");
                numero -= 5;
            }
            while (numero >= 1) {
                System.out.print("I");
                numero -= 1;
            }
        }
    }
}
