package listadeexercicios01;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        /*
         * 17 - Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
         * que calcule seu peso ideal, utilizando as seguintes fórmulas:
         * ●	para homens: (72.7 * h) – 58;
         * ●	para mulheres: (62.1 * h) – 44.7.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura (em metros): ");
        double altura = scan.nextDouble();
        scan.nextLine(); // Para resolver o problema de não ler o "sexo" após ler a "altura".
        System.out.print("Digite o seu sexo: [M/F] ");
        String sexo = scan.nextLine().toUpperCase();

        if (sexo.equals("M")) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("O seu peso ideal é %.2f kg", pesoIdeal);
        }
        else if (sexo.equals("F")) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("O seu peso ideal é %.2f kg", pesoIdeal);
        }
        else {
            System.out.println("ERRO: '" + sexo + "' não é um sexo válido! \nTente novamente com M ou F.");
        }
    }
}
