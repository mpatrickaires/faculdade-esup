package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio13 {
    /*
    * 13 - Crie uma função em java que receba por parâmetro duas matrizes lidas e retorne uma matriz resultante
    * da intersecção das matrizes.
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

        System.out.println("\n==========| INTERSECÇÃO DE MATRIZ A COM MATRIZ B |==========");
        int matrizC[][] = interseccionarMatrizes(matrizA, matrizB);
        printarMatriz(matrizC);
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

    public static int[][] interseccionarMatrizes(int matrizA[][], int matrizB[][]) {
        int matrizInterseccao[][] = new int[calcularTamanhoLinha(matrizA, matrizB)]
                [calcularTamanhoColuna(matrizA, matrizB)];
        int linhaInterseccao = 0, colunaInterseccao = 0;

        for(int linha = 0; linha < matrizA.length; linha++) {
            for(int coluna = 0; coluna < matrizA[0].length; coluna++) {
                int numero = matrizA[linha][coluna];

                if(verificarRepeticao(matrizB, numero) && !verificarRepeticao(matrizInterseccao, numero)) {
                    matrizInterseccao[linhaInterseccao][colunaInterseccao] = numero;
                    colunaInterseccao++;

                    if(colunaInterseccao >= matrizInterseccao[0].length) {
                        colunaInterseccao = 0;
                        linhaInterseccao++;
                    }
                }
            }
        }

        return matrizInterseccao;
    }

    public static int calcularTamanhoLinha(int matrizA[][], int matrizB[][]) {
        if(matrizA.length >= matrizB.length) {
            return matrizA.length;
        }
        return matrizB.length;
    }

    public static int calcularTamanhoColuna(int matrizA[][], int matrizB[][]) {
        if(matrizA[0].length >= matrizB[0].length) {
            return matrizA[0].length;
        }
        return matrizB[0].length;

    }

    public static boolean verificarRepeticao(int matriz[][], int numero) {
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                if(matriz[linha][coluna] == numero) {
                    return true;
                }
            }
        }
        return false;
    }



}
