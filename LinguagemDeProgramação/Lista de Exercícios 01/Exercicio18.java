package listadeexercicios01;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        /*
        * 18 - Faça um algoritmo que peça a nota P1 e a nota P2 do aluno, calcular a média.
        * Lembrando que a média é (P1 * 0.4) + (P2 * 0.6). A partir da nota informar se:
        * ●	Aprovado: Se Média >= 7.0
        * ●	Reprovado: Se média < 4,0
        * ●	Fazer PS: Se Média >= 4,0 e Média < 7,0
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a nota P1: ");
        double notaP1 = scan.nextDouble();
        System.out.print("Digite a nota P2: ");
        double notaP2 = scan.nextDouble();
        double media = (notaP1 * 0.4) + (notaP2 * 0.6);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("ALUNO APROVADO!");
        }
        else if (media < 4) {
            System.out.println("ALUNO REPROVADO!");
        }
        else {
            System.out.println("ALUNO DEVE FAZER PS!");
        }
    }
}
