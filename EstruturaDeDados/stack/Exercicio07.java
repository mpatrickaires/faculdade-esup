package stack;

import java.util.Scanner;

public class Exercicio07 {
    /*
    * 07 - Dado uma pilha estática de 10 posições que armazene números inteiros, escreva uma
    * função que após inserir os valores escritos pelo usuário, deve-se desempilhar em ordem
    * crescente. Lembre-se que você pode só pode usar as funções do TAD de pilha push, pop,
    * peek, isFull, isEmpty.
    */

    public static void main(String[] args) {
        StaticStack pilha = new StaticStack(10);
        lerPilha(pilha);

        System.out.println("\n===== PILHA DESORDENADA =====");
        printarPilha(pilha);

        System.out.println("\n===== PILHA ORDENADA =====");
        pilha = ordernarPilha(pilha);
        printarPilha(pilha);
    }

    public static void lerPilha(StaticStack pilha) {
        Scanner scan = new Scanner(System.in);

        for(int contador = 1; contador <= pilha.length(); contador++) {
            System.out.print("Digite o " + contador + "º valor para a pilha -> ");
            int valor = scan.nextInt();
            pilha.push(valor);
        }
    }

    public static StaticStack ordernarPilha(StaticStack pilha) {
        StaticStack pilhaOrdenada = new StaticStack(pilha.length());

        while(!pilha.isEmpty()) {
            int valor = pilha.pop();

            while(!pilhaOrdenada.isEmpty() && pilhaOrdenada.peek() < valor) {
                pilha.push(pilhaOrdenada.pop());
            }

            pilhaOrdenada.push(valor);
        }

        return pilhaOrdenada;
    }

    public static void printarPilha(StaticStack pilha) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        for(int posicao = 1; posicao <= pilha.length(); posicao++) {
            int elemento = pilha.pop();
            System.out.println(posicao + "º posição -> " + elemento);
            pilhaAuxiliar.push(elemento);
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}
