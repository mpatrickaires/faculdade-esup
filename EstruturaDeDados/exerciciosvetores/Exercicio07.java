package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio07 {
    /*
    * 7 - Fazer um programa para ler 8 valores e, em seguida, mostrar a posição onde
    * se encontram o maior e o menor valor.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[8];
        int posicaoMaior = 0, posicaoMenor = 0;

        for(int posicaoAtual = 0; posicaoAtual < vetor.length; posicaoAtual++) {
            System.out.print("Digite um valor para a posição [" + posicaoAtual + "] -> ");
            vetor[posicaoAtual] = scan.nextInt();

            if(vetor[posicaoAtual] > vetor[posicaoMaior] || posicaoAtual == 0) {
                posicaoMaior = posicaoAtual;
            }
            if(vetor[posicaoAtual] < vetor[posicaoMenor] || posicaoAtual == 0) {
                posicaoMenor = posicaoAtual;
            }
        }
        System.out.println("========================================");
        System.out.println("Posição do maior valor -> [" + posicaoMaior + "]");
        System.out.println("Posição do menor valor -> [" + posicaoMenor + "]");
        System.out.println("========================================");

    }
}
