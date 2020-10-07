package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio04 {
    /*
    * 4 - Crie uma função que você passa um array e uma posição por parâmetro e ele retorna o elemento da posição.
    * Se posição inválida, informar ao usuário: “Posição inválida”.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Digite uma posição do vetor para verificar seu elemento: ");
        int posicao = scan.nextInt();
        if(posicao < 0 || posicao >= vetor.length) {
            System.out.println("ERRO: Posição inválida!");
        }
        else {
            System.out.println("Elemento na posição [" + posicao + "] -> " + verificarPosicaoVetor(vetor, posicao));
        }
    }

    public static int verificarPosicaoVetor(int vetor[], int posicao) {
        return vetor[posicao];
    }
}
