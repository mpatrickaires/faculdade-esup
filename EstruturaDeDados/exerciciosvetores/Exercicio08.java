package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio08 {
    /*
    * 8 - Crie um algoritmo que recebe um array de inteiros X e um valor inteiro Y e retorna a quantidade de vezes
    * que Y aparece no array X.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scan.nextInt();
        int vetorX[] = new int[tamanho];

        for(int posicao = 0; posicao < vetorX.length; posicao++) {
            System.out.print("Digite uma valor para a posição [" + posicao + "] -> ");
            vetorX[posicao] = scan.nextInt();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Digite um número para ver quantas vezes ele aparece no vetor: ");
        int numeroY = scan.nextInt();
        int numeroYNoVetor = verificarNumeroNoVetor(vetorX, numeroY);
        System.out.println("O número " + numeroY + " aparece " + numeroYNoVetor + " vezes no vetor.");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    
    public static int verificarNumeroNoVetor(int vetor[], int numero) {
        int numeroNoVetor = 0;
        for (int posicaoAtual: vetor) {
            if (posicaoAtual == numero) {
                numeroNoVetor++;
            }
        }
        return numeroNoVetor;
    }
}
