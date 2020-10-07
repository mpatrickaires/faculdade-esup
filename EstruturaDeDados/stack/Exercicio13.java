package stack;

import java.util.Scanner;

public class Exercicio13 {
    /*
    * 13 - Utilizando somente operações de empilhar e desempilhar, escreva um programa que
    * remove um item com chave c (valor) fornecida pelo usuário da pilha. Ao final da execução
    * da função, a pilha deve ser igual à original, exceto pela ausência do item removido. Note que
    * você não tem acesso à estrutura interna da pilha (topo, item, etc), apenas às operações de manipulação.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticStack pilha = popularPilha();

        System.out.println("\n===== PILHA ORIGINAL =====");
        printarPilha(pilha);

        System.out.println("\n---------------------------------------------------");
        System.out.print("Digite um elemento para removê-lo da pilha -> ");
        int elementoRemover = scan.nextInt();
        removerElementoPilha(pilha, elementoRemover);
        System.out.println("---------------------------------------------------");

        System.out.println("\n===== PILHA COM O ELEMENTO " + elementoRemover + " REMOVIDO =====");
        printarPilha(pilha);
    }

    public static StaticStack popularPilha() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um tamanho para a pilha: ");
        StaticStack pilha = new StaticStack(scan.nextInt());
        System.out.println("----------------------------------------");

        for(int contador = 0; contador < pilha.length(); contador++) {
            System.out.print("Digite o " + (contador + 1) + "º elemento da pilha -> ");
            pilha.push(scan.nextInt());
        }

        return pilha;
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

    public static void removerElementoPilha(StaticStack pilha, int elementoRemover) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());

        while(!pilha.isEmpty()) {
            int elemento = pilha.pop();

            if(elemento == elementoRemover) {
                pilhaAuxiliar.push(0);
                break;
            }

            pilhaAuxiliar.push(elemento);
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}
