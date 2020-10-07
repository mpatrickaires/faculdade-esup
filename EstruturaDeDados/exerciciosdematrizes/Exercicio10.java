package exerciciosdematrizes;

import java.util.Random;

public class Exercicio10 {
    /*
    * 10 - Faça programa que leia uma matriz 6 x 6 com valores randômicos, e faça o que se pede:
    * ●	Imprima a soma de todos os elementos das colunas ímpares.
    * ●	Imprima a media aritmética dos elementos da segunda e quarta linha.
    * ●	Encontre o maior valor da matriz
    * ●	Encontre o menor valor da diagonal secundária
    * ●	Calcule a média aritmética de todos os valores
    */

    public static void main (String[] args) {
        Random gerador = new Random();
        int matriz[][] = new int[6][6];
        double somaColunasImpares = 0, somaSegundaQuartaLinha = 0, mediaSegundaQuartaLinha = 0, maiorValorMatriz = 0,
                menorValorDiagonalSecundaria = 0, somaMatriz = 0, mediaMatriz = 0;

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
                int valor = gerador.nextInt(100);
                matriz[linha][coluna] = valor;

                if((coluna + 1) % 2 == 1) {
                    somaColunasImpares += valor;
                }

                if((linha + 1) == 2 || (linha + 1) == 4) {
                    somaSegundaQuartaLinha += valor;
                }

                if((linha == 0 && coluna == 0) || valor > maiorValorMatriz) {
                    maiorValorMatriz = valor;
                }

                if((linha == 0 && coluna == matriz[0].length - 1) ||
                        (linha + coluna == matriz.length - 1 && valor < menorValorDiagonalSecundaria)) {
                    menorValorDiagonalSecundaria = valor;
                }

                somaMatriz += valor;
            }
        }
        mediaSegundaQuartaLinha = somaSegundaQuartaLinha/ (matriz[0].length * 2);
        mediaMatriz = somaMatriz / (matriz.length * matriz[0].length);

        System.out.println("==================== M A T R I Z ====================");
        printarMatriz(matriz);
        System.out.println("=====================================================");

        System.out.println("Soma de todos os elementos das colunas ímpares -> " + somaColunasImpares);
        System.out.println("-----------------------------------------------------");
        System.out.println("Média aritmética dos elementos da segunda e quarta linha -> " + mediaSegundaQuartaLinha);
        System.out.println("-----------------------------------------------------");
        System.out.println("Maior valor da matriz -> " + maiorValorMatriz);
        System.out.println("-----------------------------------------------------");
        System.out.println("Menor valor da diagonal secundária -> " + menorValorDiagonalSecundaria);
        System.out.println("-----------------------------------------------------");
        System.out.println("Média aritmética de todos os valores da matriz -> " + mediaMatriz);
        System.out.println("-----------------------------------------------------");
    }

    public static void printarMatriz(int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("[  " + matriz[linha][coluna] + "  ] ");
            }
            System.out.println();
        }
    }

}
