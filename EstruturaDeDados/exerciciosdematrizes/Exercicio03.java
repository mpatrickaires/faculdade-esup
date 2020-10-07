package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio03 {
    // 03 - Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int totMaiorQue10 = 0;
        
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Digite um elemento para a posição [" + linha + "][" + coluna + "] -> ");
                matriz[linha][coluna] = scan.nextInt();

                if(matriz[linha][coluna] > 10) totMaiorQue10++;
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Total de elementos da matriz maiores do que 10 -> " + totMaiorQue10);
        System.out.println("------------------------------------------------------------");
    }
}
