package listadeexercicios01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main (String[] args) {
        /*
         * 3 -Faça um algoritmo que peça a nota P1 e a nota P2 do aluno, calcular a média.
         * Lembrando que a média é (P1 * 0.4) + (P2 * 0.6)
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Nota P1: ");
        double notaP1 = scan.nextDouble();

        System.out.print("Nota P2: ");
        double notaP2 = scan.nextDouble();

        double media = (notaP1 * 0.4) + (notaP2 * 0.6);
        System.out.println("Média: " + media);
    }
}
