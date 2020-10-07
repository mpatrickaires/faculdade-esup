package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio16 {
    /*
    * 16 - Escreva um algoritmo que crie um vetor de inteiros de 15 posições e leia cada elemento do usuário,
    * o elementos precisam estar ordenados de forma crescente. Ou seja, toda vez que informar um valor é
    * necessário varrer o vetor procurando a posição ideal para inserí-lo. E “empurrar” os elementos para frente.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[15];

        for(int posicao = 0; posicao < vetor.length ; posicao++) {
            System.out.print("Digite um elemento para a posição [" + posicao + "] -> ");
            vetor[posicao] = scan.nextInt();

            for(int posicaoAnterior = 0; posicaoAnterior < posicao; posicaoAnterior++) {
                if(vetor[posicao] < vetor[posicaoAnterior]) {
                    int elementoMenor = vetor[posicao];
                    vetor[posicao] = vetor[posicaoAnterior];
                    vetor[posicaoAnterior] = elementoMenor;
                }
            }
        }

        System.out.println("===== VETOR EM ORDEM CRESCENTE =====");
        for(int elementoVetor: vetor) {
            System.out.print("[" + elementoVetor + "]");
        }
    }
}
