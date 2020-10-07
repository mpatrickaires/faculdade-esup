package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio09 {
    /*
    * 9 - Crie um algoritmo que além da função main, tenha mais 3 funções que receba um vetor por parâmetro
    * e cada função deve retornar respectivamente o maior valor, menor valor e o valor que se encontra na metade
    * do array. Tanto o tamanho do vetor quanto todos os elementos inseridos devem ser informados pelo usuário.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um tamanho para o vetor: ");
        int tamanho = scan.nextInt();
        int vetor[] = new int[tamanho];

        for(int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um valor para a posição [" + posicao + "] -> ");
            vetor[posicao] = scan.nextInt();
        }

        System.out.println("==============================");
        System.out.println("Maior valor do vetor: " + obterMaiorValorVetor(vetor));
        System.out.println("Menor valor do vetor: " + obterMenorValorVetor(vetor));
        System.out.println("Valor no meio do vetor: " + obterValorNoMeioDoVetor(vetor));
        System.out.println("==============================");
    }

    public static int obterMaiorValorVetor(int vetor[]) {
        int maiorValor = 0;
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            if(vetor[posicao] > maiorValor || posicao == 0) {
                maiorValor = vetor[posicao];
            }
        }
        return maiorValor;
    }

    public static int obterMenorValorVetor(int vetor[]) {
        int menorValor = 0;
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            if(vetor[posicao] < menorValor || posicao == 0) {
                menorValor = vetor[posicao];
            }
        }
        return menorValor;
    }

    public static int obterValorNoMeioDoVetor(int vetor[]) {
        int posicaoMeio = vetor.length / 2;
        return vetor[posicaoMeio];
    }
}
