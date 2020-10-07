package stack;

import java.util.Scanner;

public class Exercicio06 {
    /*
    * 06 - Escreva um algoritmo que receba um número inteiro entre 0 e 16 e converta-o em binário,
    * faça uso de uma pilha estática de 5 posições, para imprimir os valores na posição correta.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.print("Digite um número entre 0 e 16 -> ");
            numero = scan.nextInt();
        } while(numero < 0 || numero > 16);

        StaticStack pilha = converterEmBinario(numero);

        System.out.println("===== " + numero + " EM BINÁRIO =====");
        while(!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
    }

    public static StaticStack converterEmBinario(int numero) {
        StaticStack pilha = new StaticStack(5);

        while(!pilha.isFull()) {
            pilha.push(numero % 2);
            numero /= 2;
        }

        return pilha;
    }
}
