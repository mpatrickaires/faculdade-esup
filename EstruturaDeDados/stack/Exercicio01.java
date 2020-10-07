package stack;

import java.util.Scanner;

public class Exercicio01 {
    /*
    * 01 - Faça uso de uma pilha estática para armazenar 5 valores inteiros inseridos pelo usuário.
    * Crie um função no main, que desempilhe todos os valores, e informe se cada valor é par ou ímpar.
    */
    
    public static void main (String[] args) {
        StaticStack pilha = new StaticStack(5);

        System.out.println("===== LENDO PILHA =====");
        lerPilha(pilha);

        System.out.println("\n===== DESEMPILHANDO PILHA =====");
        desempilharParImpar(pilha);
    }

    public static void lerPilha(StaticStack pilha) {
        Scanner scan = new Scanner(System.in);

        for(int posicao = 1; posicao <= pilha.length(); posicao++) {
            System.out.print("Digite o " + posicao + "º elemento da pilha -> ");
            pilha.push(scan.nextInt());
        }
    }

    public static void desempilharParImpar(StaticStack pilha) {
        while(!pilha.isEmpty()) {
            int valorPilha = pilha.pop();
            if(valorPilha % 2 == 0) {
                System.out.println(valorPilha + " ->  PAR");
            }
            else {
                System.out.println(valorPilha + " ->  ÍMPAR");
            }
        }
    }
}
