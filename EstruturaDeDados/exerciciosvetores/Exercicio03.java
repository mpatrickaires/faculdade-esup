package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio03 {
    /*
    * 3 - Crie um algoritmo que leia 50 valores e insira em um array.
    * Posteriormente, calcule a média aritmética dos valores do array.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0, media = 0;

        int vetor[] = new int[50];
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite o " + (posicao + 1) + "º número: ");
            vetor[posicao] = scan.nextInt();
            soma += posicao;
        }
        media = soma / vetor.length;
        System.out.println("----------------------------------------");
        System.out.println("A média dos valores digitados é: " + media);
        System.out.println("----------------------------------------");
    }
}
