package exerciciosdematrizes;

import java.util.Random;

public class Exercicio09 {
    /*
    * 09 - Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela de bingo.
    * Sabendo que cada cartela devera conter 5 linhas de 5 colunas, tendo um total de 25 números não repetidos
    * dentro das cartelas. O programa deve exibir na tela a cartela gerada.
    */

    public static void main (String[] args) {
        int cartela[][] = new int[5][5];

        preencherCartela(cartela);

        System.out.println("=============== |B  I  N  G  O| ===============");
        printarCartela(cartela);
        System.out.println("===============================================");
    }

    public static void preencherCartela(int cartela[][]) {
        Random gerador = new Random();
        int numero;

        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[0].length; coluna++) {
                do {
                    numero = gerador.nextInt(100);
                } while(!validarNumero(numero, cartela));
                cartela[linha][coluna] = numero;
            }
        }
    }

    public static boolean validarNumero(int numero, int cartela[][]) {
        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[0].length; coluna++) {
                if(numero == cartela[linha][coluna]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printarCartela(int cartela[][]) {
        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[0].length; coluna++) {
                System.out.print("[  " + cartela[linha][coluna] + "  ] ");
            }
            System.out.println();
        }
    }
}
