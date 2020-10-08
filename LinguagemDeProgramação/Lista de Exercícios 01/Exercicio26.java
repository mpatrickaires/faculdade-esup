package listadeexercicios01;

import java.util.Scanner;

public class Exercicio26 {


    public static void main(String[] args) {
        /*
        * 26 - Crie um algoritmo em JAVA que obtenha um número indeterminado de alunos,
        * obtenha a nota P1, a nota P2, calcule a média a partir da seguinte fórmula: (P1 * 0.4) + (P2 * 0.6),
        * enquanto nome for diferente de “sair”, e informe se:
        * ●	Aprovado: Se Média >= 7.0
        * ●	Reprovado: Se média < 4,0
        * ●	Fazer PS: Se Média >= 4,0 e Média < 7,0
        */

        Scanner scan = new Scanner(System.in);
        int qtdAlunos = 0, qtdAprovados = 0, qtdReprovados = 0, qtdPS = 0;
        double maiorNota = 0, somaNota = 0, mediaNotas;

        System.out.print("Nome ('sair' para encerrar): ");
        String nome = scan.nextLine();
        while (!nome.equals("sair")) {
            qtdAlunos = qtdAlunos + 1;
            System.out.print("Nota P1: ");
            double notaP1 = scan.nextDouble();
            System.out.print("Nota P2: ");
            double notaP2 = scan.nextDouble();
            scan.nextLine();
            double media = calculoNota(notaP1, notaP2);
            System.out.println("Média: " + media);
            somaNota = somaNota + media;

            if (media >= 7) {
                System.out.println("ALUNO APROVADO!");
                qtdAprovados = qtdAprovados + 1;
            }
            else if (media < 4) {
                System.out.println("ALUNO REPROVADO!");
                qtdReprovados = qtdReprovados + 1;
            }
            else {
                System.out.println("ALUNO DEVE FAZER PS!");
                qtdPS = qtdPS + 1;
            }

            if (media > maiorNota) {
                maiorNota = media;
            }



            System.out.println("---------------------------------------");
            System.out.print("Nome ('sair' para encerrar): ");
            nome = scan.nextLine();
        }
        mediaNotas = somaNota / qtdAlunos;

        System.out.println("Maior nota final: " + maiorNota);
        System.out.println("Media das notas: " + mediaNotas);
        System.out.println("Alunos aprovados: " + qtdAprovados);
        System.out.println("Alunos reprovados: " + qtdReprovados);
        System.out.println("Alunos que precisam fazer PS: " + qtdPS);
    }

    static double calculoNota (double p1, double p2) {
        return (p1 * 0.4) + (p2 * 0.6);
    }

}
