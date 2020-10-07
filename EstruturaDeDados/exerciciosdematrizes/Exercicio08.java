package exerciciosdematrizes;
import java.util.Scanner;

public class Exercicio08 {
    /*
    * 08 - Leia uma matriz A 3 x 3, e uma Matriz B 3 x 3, e ache uma matriz C resultado da soma das duas matrizes.
    * Crie uma função para calcular a soma das matrizes que retorne uma matriz.
    */

    public static void main(String[] args) {
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];

        System.out.println("===== POPULANDO MATRIZ A =====");
        popularMatriz(matrizA);
        limparTela();

        System.out.println("===== POPULANDO MATRIZ A =====");
        popularMatriz(matrizB);
        limparTela();

        System.out.println("===== MATRIZ A =====");
        printarMatriz(matrizA);

        System.out.println("\n===== MATRIZ B =====");
        printarMatriz(matrizB);

        System.out.println("\n===== MATRIZ A + MATRIZ B =====");
        int matrizC[][] = somarMatrizes(matrizA, matrizB);
        printarMatriz(matrizC);
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

    public static void limparTela() {
        for(int contador = 0; contador < 50; contador++) {
            System.out.println();
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

    public static int[][] somarMatrizes(int matrizA[][], int matrizB[][]) {
        int matrizC[][] = new int[matrizA.length][matrizB[0].length];

        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[0].length; coluna++) {
                matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }
        }
        return matrizC;
    }
}
