package stack;

import java.util.Scanner;

public class Exercicio11 {
    /*
    * 11 - Na estrutura de pilha, crie um método chamado reverse que altera a ordem dos
    * elementos da pilha. Utilize apenas os métodos push, pop isEmpty. Não é um método para
    * imprimir os elementos. É um método para, efetivamente, inverter a ordem dos elementos na pilha.
    */

    public static void main(String[] args) {
        StaticStack pilha = popularPilha();

        System.out.println("\n===== PILHA NORMAL =====");
        printarPilha(pilha);

        System.out.println("\n===== PILHA INVERTIDA =====");
        reverse(pilha);
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

    public static void reverse(StaticStack pilha) {
        int vetorAuxiliar[] = new int[pilha.length()];

        for(int posicao = 0; posicao < pilha.length(); posicao++) {
            vetorAuxiliar[posicao] = pilha.pop();
        }

        for(int elementoVetor : vetorAuxiliar) {
            pilha.push(elementoVetor);
        }
    }
}
