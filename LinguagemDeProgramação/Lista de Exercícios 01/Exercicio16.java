package listadeexercicios01;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        /*
         * 16 - Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá
         * se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos
         * deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
         */

        Scanner scan = new Scanner(System.in);
        int valorC;
        String operacao;

        System.out.print("Digite o valor A: ");
        int valorA = scan.nextInt();
        System.out.print("Digite o valor B: ");
        int valorB = scan.nextInt();

        if (valorA == valorB) {
            valorC = valorA + valorB;
            operacao = "SOMA";
        }
        else {
            valorC = valorA * valorB;
            operacao = "MULTIPLICAÇÃO";
        }
        System.out.println("O resultado da " + operacao + " entre " + valorA + " e " + valorB + " é igual a " + valorC);
    }
}
