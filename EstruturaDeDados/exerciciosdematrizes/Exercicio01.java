package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio01 {
    // 01 - Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor.

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[10][10];
        int maiorElemento = 0, linhaMaiorElemento = 0, colunaMaiorElemento = 0;

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Digite o elemento da posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();

                if(matriz[linha][coluna] > maiorElemento || (linha == 0 && coluna == 0)) {
                    maiorElemento = matriz[linha][coluna];
                    linhaMaiorElemento = linha;
                    colunaMaiorElemento = coluna;
                }
            }
        }
        System.out.println("===================================");
        System.out.print("O maior elemento da matriz é " + maiorElemento + "\nna posição [" + linhaMaiorElemento
        + "][" + colunaMaiorElemento + "]");
        System.out.println("\n===================================");
    }
}
