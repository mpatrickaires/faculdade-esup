package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio07 {
    /*
    * 07 - Leia uma matriz 5 x 5 e faça uma troca de posição dos elementos da diagonal principal e
    * a diagonal secundária.
    */

    public static void main(String[] args) {
        int matriz[][] = popularMatriz();
        int diagonalPrincipal[] = encontrarDiagonalPrincipal(matriz);
        int diagonalSecundaria[] = encontrarDiagonalSecundaria(matriz);

        System.out.println("\n===== MATRIZ NORMAL =====");
        printarMatriz(matriz);

        System.out.println("\n===== MATRIZ COM DIAGONAIS TROCADAS =====");
        trocarDiagonais(diagonalPrincipal, diagonalSecundaria, matriz);
        printarMatriz(matriz);
    }

    public static int[][] popularMatriz() {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[5][5];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Digite um valor para a posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }

        return matriz;
    }

    public static int[] encontrarDiagonalPrincipal(int matriz[][]) {
        int diagonalPrincipal[] = new int[matriz.length];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (linha == coluna) {
                    diagonalPrincipal[linha] = matriz[linha][coluna];
                }
            }
        }
        return diagonalPrincipal;
    }

    public static int[] encontrarDiagonalSecundaria(int matriz[][]) {
        int diagonalSecundaria[] = new int[matriz.length];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if(linha + coluna == matriz.length - 1) {
                    diagonalSecundaria[linha] = matriz[linha][coluna];
                }
            }
        }
        return diagonalSecundaria;
    }

    public static void printarMatriz(int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("[ " + matriz[linha][coluna] + " ]  ");
            }
            System.out.println();
        }
    }

    public static void trocarDiagonais(int diagonalPrincipal[], int diagonalSecundaria[], int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = diagonalSecundaria[linha];
                }

                if (linha + coluna == matriz.length - 1) {
                    matriz[linha][coluna] = diagonalPrincipal[linha];
                }
            }
        }
    }
}
