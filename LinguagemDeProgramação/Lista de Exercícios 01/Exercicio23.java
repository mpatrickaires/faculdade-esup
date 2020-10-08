package listadeexercicios01;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        /*
        * 23 - Construir um algoritmo que execute o exercícios 5 para um número indeterminado de pessoas.
        * O programa vai peguntar a matrícula da pessoa, e enquanto for diferente de 0, vai lendo as
        * informações de entrada e calcula o IMC. No final, apresentar a média aritmética do IMC de todos.
        */

        Scanner scan = new Scanner(System.in);
        int cadastros = 0;
        double somaIMC = 0, mediaIMC = 0;

        System.out.print("Nº de Matrícula (0 para encerrar): ");
        int matricula = scan.nextInt();

        while (matricula != 0) {
            cadastros += 1;
            System.out.print("Digite o peso (kg): ");
            double peso = scan.nextDouble();
            System.out.print("Digite a altura (m): ");
            double altura = scan.nextDouble();
            double imc = peso / Math.pow(altura, 2);
            System.out.println("IMC: " + imc);

            somaIMC += imc;
            System.out.println("---------------------------------------");
            System.out.print("Nº de Matrícula (0 para encerrar): ");
            matricula = scan.nextInt();
        }
        mediaIMC = somaIMC / cadastros;
        System.out.println("Total de pessoas cadastradas: " + cadastros);
        System.out.println("Soma dos IMC cadastrados: " + somaIMC);
        System.out.println("Média dos IMC cadastrados: " + mediaIMC);
    }
}
