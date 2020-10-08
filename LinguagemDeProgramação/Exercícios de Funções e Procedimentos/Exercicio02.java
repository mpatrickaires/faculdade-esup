package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio02 {
    /*
     * 2 - Desenvolva duas funções: uma função que recebe um valor inteiro por parâmetro e verifique se o valor
     * é par e outra que receba e verifique se o inteiro é ímpar. As funções devem retornar um valor booleano.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scan.nextInt();
        System.out.println("Esse valor é par? " + verificarPar(valor));
        System.out.println("Esse valor é ímpar? " + verificarImpar(valor));
    }

    static boolean verificarPar (int valor) {
        return valor % 2 == 0;
    }

    static boolean verificarImpar (int valor) {
        return valor % 2 == 1;
    }
}
