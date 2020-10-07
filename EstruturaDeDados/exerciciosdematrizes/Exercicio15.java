package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio15 {
    /*
    * 15 - Crie uma função booleana em java que receba por parâmetro duas matrizes lidas e valide se
    * ambas as matrizes são iguais.
    */

    public static void main(String[] args) {
        System.out.println("==========| LENDO MATRIZ A |==========");
        int matrizA[][] = lerMatriz();
        limparTela();

        System.out.println("==========| LENDO MATRIZ B |==========");
        int matrizB[][] = lerMatriz();
        limparTela();

        System.out.println("==========| MATRIZ A |==========");
        printarMatriz(matrizA);

        System.out.println("\n==========| MATRIZ B |==========");
        printarMatriz(matrizB);

        System.out.println("\n================================");
        if(compararMatrizes(matrizA, matrizB)) {
            System.out.println("A Matriz A e a Matriz B são IGUAIS!");
        }
        else {
            System.out.println("A Matriz A e a Matriz B são DIFERENTES!");
        }
        System.out.println("================================");
    }

    public static boolean compararMatrizes(int matrizA[][], int matrizB[][]) {
        if(matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            return false;
        }

        for(int linha = 0; linha < matrizA.length; linha++) {
            for(int coluna = 0; coluna < matrizA[0].length; coluna++) {
                if(matrizA[linha][coluna] != matrizB[linha][coluna]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int[][] lerMatriz() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de linhas para a matriz: ");
        int tamanhoLinha = scan.nextInt();
        System.out.print("Digite o número de colunas para a matriz: ");
        int tamanhoColuna = scan.nextInt();

        System.out.println("----------------------------------------");
        int matriz[][] = new int[tamanhoLinha][tamanhoColuna];
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Digite um valor para a posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }
        return matriz;
    }

    public static void limparTela() {
        for(int enter = 0; enter < 30; enter++) {
            System.out.println();
        }
    }

    public static void printarMatriz(int matriz[][]) {
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("[  " + matriz[linha][coluna] + "  ] ");
            }
            System.out.println();
        }
    }
}
