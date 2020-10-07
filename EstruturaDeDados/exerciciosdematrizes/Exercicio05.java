package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio05 {
    /*
    * 05 - Leia uma matriz 4 x 4 e troque os valores da 1ª linha pelos da 4ª coluna, vice-e-versa.
    * Escrever ao final a matriz obtida
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int primeiraLinha[] = new int[matriz[0].length];
        int quartaColuna[] = new int[matriz.length];

        popularMatriz(matriz, primeiraLinha, quartaColuna);

        System.out.println("===== MATRIZ NORMAL =====");
        printarMatriz(matriz);

        System.out.println("\n===== MATRIZ COM 1ª LINHA E 4ª COLUNA INVERTIDAS =====");
        inverterLinhaColuna(matriz, primeiraLinha, quartaColuna);
        printarMatriz(matriz);
    }

    public static void popularMatriz(int matriz[][], int primeiraLinha[], int quartaColuna[]) {
        Scanner scan = new Scanner(System.in);

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Escreva um valor para a posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();

                if(linha == 0) {
                    primeiraLinha[coluna] = matriz[linha][coluna];
                }
                if(coluna == 3) {
                    quartaColuna[(matriz[0].length + linha) - matriz[0].length] = matriz[linha][coluna];
                }
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

        public static void inverterLinhaColuna ( int matriz[][], int primeiraLinha[], int quartaColuna[]){
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                    if (linha == 0) {
                        matriz[linha][coluna] = quartaColuna[coluna];
                    } else if (coluna == 3) {
                        matriz[linha][coluna] = primeiraLinha[linha];
                    }
                }
            }
        }
    }
