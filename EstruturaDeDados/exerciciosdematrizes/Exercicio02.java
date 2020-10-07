package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio02 {
    /* 02 - Leia duas matrizes 4 x 4 e escreva uma terceira também 4 x 4 com os
    * maiores elementos entre as primeiras.
    */

    public static void main (String[] args) {
        int matriz1[][] = new int[4][4];
        int matriz2[][] = new int[4][4];
        int matrizMaioresElementos[][] = new int[4][4];

        System.out.println("===== PREENCHENDO A 1ª MATRIZ =====");
        popularMatriz(matriz1);
        limparTela();

        System.out.println("===== PREENCHENDO A 2ª MATRIZ =====");
        popularMatriz(matriz2);
        limparTela();

        System.out.println("==== MATRIZ COM OS MAIORES ELEMENTOS =====");
        popularMatrizMaioresElementos(matrizMaioresElementos, matriz1, matriz2);
        for(int linha = 0; linha < matrizMaioresElementos.length; linha++) {
            for(int coluna = 0; coluna < matrizMaioresElementos.length; coluna++) {
                System.out.print("[" + matrizMaioresElementos[linha][coluna] + "]  ");
            }
            System.out.println();
        }
    }

    public static void popularMatriz(int matriz[][]) {
        Scanner scan = new Scanner(System.in);

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Digite um elemento para a posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }
    }

    public static void popularMatrizMaioresElementos(int matrizMaioresElementos[][], int matriz1[][],
                                                     int matriz2[][]) {
        for(int linha = 0; linha < matrizMaioresElementos.length; linha++) {
            for(int coluna = 0; coluna < matrizMaioresElementos.length; coluna++) {
                if(matriz1[linha][coluna] >= matriz2[linha][coluna]) {
                    matrizMaioresElementos[linha][coluna] = matriz1[linha][coluna];
                }
                else {
                    matrizMaioresElementos[linha][coluna] = matriz2[linha][coluna];
                }
            }
        }
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }
}
