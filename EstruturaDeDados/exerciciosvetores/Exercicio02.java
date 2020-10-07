package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio02 {
    /*
    * 2 - Crie um algoritmo com 30 posições, peça que o usuário preencha com valores aleatórios.
    * Após preenchido identifique o maior e o menor elemento do array.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0, menor = 0;

        int vetor[] = new int[50];
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um número para a posição [" + posicao + "] -> ");
            vetor[posicao] = scan.nextInt();

            if(vetor[posicao] > maior || posicao == 0) {
                maior = vetor[posicao];
            }
            if(vetor[posicao] < menor || posicao == 0) {
                menor = vetor[posicao];
            }
        }
        System.out.println("------------------------------");
        System.out.println("Maior elemento do array: " + maior);
        System.out.println("Menor elemento do array: " + menor);
        System.out.println("------------------------------");

    }
}
