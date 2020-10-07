package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio06 {
    /*
    * 6 - Escreva um algoritmo que leia um vetor de 15 posições e, em seguida, leia também dois valores X e Y
    * quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma dos valores
    * encontrados nas respectivas posições X e Y. Se X ou Y forem posições inválidas, informar o usuário
    * “Posições inválidas”, pedir uma posição válidas novamente.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[15];
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um valor para a posição [" + posicao + "] -> ");
            vetor[posicao] = scan.nextInt();
        }

        System.out.println("------------------------------");
        System.out.print("Digite uma posição do vetor: ");
        int posicaoX = scan.nextInt();
        while(posicaoX < 0 || posicaoX >= vetor.length) {
            System.out.print("ERRO: Posição inválida. Digite uma posição do vetor: ");
            posicaoX = scan.nextInt();
        }
        System.out.print("Digite outra posição do vetor: ");
        int posicaoY = scan.nextInt();
        while(posicaoY < 0 || posicaoY >= vetor.length) {
            System.out.print("ERRO: Posição inválida. Digite outra posição do vetor: ");
            posicaoY = scan.nextInt();
        }
        System.out.println("------------------------------");


        System.out.println("A soma dos elementos nas posições [" + posicaoX + "] e [" + posicaoY + "] é igual a: "
        + somarPosicoes(vetor, posicaoX, posicaoY));
        System.out.println("------------------------------");
    }

    public static int somarPosicoes(int vetor[], int posicaoX, int posicaoY) {
        return vetor[posicaoX] + vetor[posicaoY];
    }
}
