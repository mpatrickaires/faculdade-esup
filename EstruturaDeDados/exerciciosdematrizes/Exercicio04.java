package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio04 {
    /*
    * 04 - Leia uma matriz 5 x 5. Leia tambem um valor X. O programa deverá fazer uma busca desse valor
    * na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “não encontrado".
    */

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[5][5];

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Digite um valor para a posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }
        System.out.println("----------------------------------------");
        System.out.print("Digite um valor para encontra-lo na matriz -> ");
        int valor = scan.nextInt();
        System.out.println("----------------------------------------");
        encontrarPosicaoValor(valor, matriz);
        System.out.println("----------------------------------------");
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }

    public static void encontrarPosicaoValor(int valor, int matriz[][]) {
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz.length; coluna++) {
                if(matriz[linha][coluna] == valor) {
                    System.out.println("O valor " + valor + " está na posição [" + linha + "][" + coluna + "]");
                    return;
                }
            }
        }
        System.out.println("Valor não encontrado!");
    }
}
