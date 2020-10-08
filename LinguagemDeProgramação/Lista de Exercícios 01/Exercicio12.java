package listadeexercicios01;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        /*
         * O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação
         * sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura^2).
         * Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo
         * com a relação abaixo:
         * ●	Abaixo de 18,5 Abaixo do Peso
         * ●	Entre 18,5 e 25 Peso normal
         * ●	Entre 25 e 30 Acima do peso
         * ●	Acima de 30 obeso
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu peso (kg): " );
        double peso = scan.nextDouble();
        System.out.print("Digite a sua altura (m): ");
        double altura = scan.nextDouble();

        double imc = peso / (Math.pow(altura, 2));
        System.out.println("IMC: " + imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        }
        else if (imc < 25) {
            System.out.println("Peso normal!");
        }
        else if (imc < 30) {
            System.out.println("Acima do peso!");
        }
        else {
            System.out.println("Obeso!");
        }
    }
}
