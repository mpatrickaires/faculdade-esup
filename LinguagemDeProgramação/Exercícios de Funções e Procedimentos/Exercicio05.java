package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio05 {
    // 5 - Escreva uma função que receba dois números inteiros retorne o menor número

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o 2º número: ");
        int numero2 = scan.nextInt();
        System.out.println("Dentre os dois números, o menor é o número " + menorNumero(numero1, numero2));
    }

    static int menorNumero (int numero1, int numero2) {
        if (numero1 <= numero2) {
            return numero1;
        }
        return numero2;
    }
}
