package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio14 {
    /*
    * 14 - Crie uma função em java que receba por parâmetro duas matrizes lidas e retorne uma matriz resultante
    * da diferença de conjunto das matrizes.
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

        System.out.println("\n==========| DIFERENÇA DA MATRIZ A PELA MATRIZ B |==========");
        int matrizC[][] = calcularDiferencaMatrizes(matrizA, matrizB);
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

    public static int[][] calcularDiferencaMatrizes(int matrizA[][], int matrizB[][]) {
        int matrizC[][] = new int[matrizA.length][matrizA[0].length];
        int vetorElementosMatrizB[] = popularVetorElementos(matrizB);

        for(int linha = 0; linha < matrizC.length; linha++) {
            for(int coluna = 0; coluna < matrizC[0].length; coluna++) {

                for(int elementoMatrizB: vetorElementosMatrizB) {
                    if(elementoMatrizB == matrizA[linha][coluna]) {
                        matrizC[linha][coluna] = 0;
                        break;
                    }
                    matrizC[linha][coluna] = matrizA[linha][coluna];
                }
            }
        }
        return matrizC;
    }

    public static int[] popularVetorElementos(int matriz[][]) {
        int vetorElementosMatriz[] = new int[matriz.length * matriz[0].length];
        int posicao = 0;

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                vetorElementosMatriz[posicao] = matriz[linha][coluna];
                posicao++;
            }

        }
        return vetorElementosMatriz;
    }

}
