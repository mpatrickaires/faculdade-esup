package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio16 {
    /*
    * 16 - Crie uma função em java que receba uma matriz e uma posição i e j, retorne o elemento que se encontre
    * na posição de linha i e coluna j. Sua função deve validar se a posição é válida, se não for,
    * informar ao usuário “Posição inválida”, deve retornar -1.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==========| LENDO MATRIZ |==========");
        int matriz[][] = lerMatriz();

        System.out.println("====================================");
        System.out.println("Digite uma posição da matriz.");
        System.out.print("Linha -> ");
        int linha = scan.nextInt();
        System.out.print("Coluna -> ");
        int coluna = scan.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("O valor na posição [" + linha + "][" + coluna + "] é: " +
                mostrarValorNaMatriz(matriz, linha, coluna));
    }

    public static int mostrarValorNaMatriz(int matriz[][], int linha, int coluna) {
        if(linha >= matriz.length || coluna >= matriz[0].length) {
            System.out.println("ERRO: Posição inválida!");
            return -1;
        }

        return matriz[linha][coluna];
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
}
