package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio14 {
    /*
    * 14 - Escreva um algoritmo que leia um vetor de 15 posições e o compacte, ou seja, elimine as posições
    * com valor zero. Para isso, todos os elementos à frente do valor zero, devem ser movidos uma posição para trás
    * no vetor.
    */

    public static void main(String[] args) {
        int vetor[] = new int[15];

        popularVetor(vetor);
        vetor = eliminarElementosZero(vetor);

        System.out.println();
        System.out.println("===== VETOR SEM OS ELEMENTOS IGUAIS A ZERO =====");
        printarVetor(vetor);
    }

    public static void popularVetor(int vetor[]) {
        Scanner scan = new Scanner(System.in);

        for(int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um valor para a posicao [" + posicao + "] -> ");
            vetor[posicao] = scan.nextInt();
        }
    }

    public static int[] eliminarElementosZero(int vetor[]) {
        int novoVetor[] = new int[calcularTamanho(vetor)];
        int posicao = 0;

        for(int elementoVetor: vetor) {
            if(elementoVetor != 0) {
                novoVetor[posicao] = elementoVetor;
                posicao++;
            }
        }
        return novoVetor;
    }

    public static int calcularTamanho(int vetor[]) {
        int tamanho = 0;

        for(int elementoVetor: vetor) {
            if(elementoVetor != 0) {
                tamanho++;
            }
        }
        return tamanho;
    }

    public static void printarVetor(int vetor[]) {
        for(int elementoVetor: vetor) {
            System.out.print("[" + elementoVetor + "]");
        }
    }
}
