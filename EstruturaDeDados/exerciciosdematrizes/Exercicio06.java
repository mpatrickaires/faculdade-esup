package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio06 {
    /*
    * 06 - Leia uma matriz 8 x 8 e a transforme numa matriz triangular inferior, atribuindo zero a
    * todos os elementos acima da diagonal principal, escrevendo-a ao final
    */

    public static void main (String[] args) {
        int matriz[][] = new int[8][8];

        popularMatriz(matriz);
        System.out.println("===== MATRIZ NORMAL =====");
        printarMatriz(matriz);

        System.out.println("\n===== MATRIZ TRIANGULAR INFERIOR =====");
        transformarEmTriangularInferior(matriz);
        printarMatriz(matriz);
    }

    public static void popularMatriz(int matriz[][]) {
        Scanner scan = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Escreva um valor para a posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }
    }

    public static void printarMatriz(int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("[ " + matriz[linha][coluna] + " ]  ");
            }
            System.out.println();
        }
    }
    public static void transformarEmTriangularInferior(int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if(linha < coluna) {
                    matriz[linha][coluna] = 0;
                }
            }
        }
    }
}
