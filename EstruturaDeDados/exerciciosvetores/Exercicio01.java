package exerciciosdevetores;

public class Exercicio01 {
    /*
    * 1 - Crie um algoritmo que crie um vetor de 10 posições, insira os números de 1 a 10.
    * Depois imprima os valores.
    */

    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("[" + posicao + "] -> " + vetor[posicao]);
        }
    }
}
