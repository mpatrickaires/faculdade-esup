package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio06 {
    /*
    * 6 - Um número primo é aquele que é divisível apenas por ele mesmo e por 1. Faça um procedimento que receba
    * como entrada um inteiro qualquer e imprima uma mensagem informando se o número é primo ou não. A função deve
    * retornar verdadeiro caso o número seja primo e falso caso contrário.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        verificarImparProcedimento(numero);
        System.out.println("O número " + numero + " é primo? " + verificarImparFuncao(numero));
    }

    // Procedimento
    static void verificarImparProcedimento (int numero) {
        int qtdDivisores = 0;
        for (int contador = 1; contador <= numero; contador++){
            if (numero % contador == 0) {
                qtdDivisores += 1;
            }
        }
        if (qtdDivisores == 2) {
            System.out.println("O número " + numero + " é primo!");
        }
        else {
            System.out.println("O número " + numero + " não é primo!");
        }
    }

    // Função
    static boolean verificarImparFuncao (int numero) {
        int qtdDivisores = 0;
        for (int contador = 1; contador <= numero; contador++) {
            if (numero % contador == 0) {
                qtdDivisores += 1;
            }
        }
        return qtdDivisores == 2;
    }
}
