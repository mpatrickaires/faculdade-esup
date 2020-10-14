package questao04;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticStack pilha = new StaticStack(26);

        preencherPilhaRandomico(pilha);
        System.out.println("===== PILHA NORMAL =====");
        printarPilha(pilha);

        maiorElementoTopoPilha(pilha);
        System.out.println("\n===== PILHA COM O MAIOR ELEMENTO NO TOPO =====");
        printarPilha(pilha);

        System.out.println("--------------------------------------------------");
        System.out.print("Digite um elemento da pilha: ");
        int elemento = scan.nextInt();
        int quantidadeDesempilhado = quantidadeDesempilhado(pilha, elemento);
        if(quantidadeDesempilhado != -1) {
            System.out.println("Quantidade de elementos desempilhados para encontrar o elemento " + elemento +
                    " -> " + quantidadeDesempilhado);
            System.out.println("\n===== PILHA COM O ELEMENTO " + elemento + " DESEMPILHADO =====");
            printarPilha(pilha);
        }
        else {
            System.out.println("Elemento não encontrado!");
        }
    }

    public static void preencherPilhaRandomico(StaticStack pilha) {
        Random gerador = new Random();

        while(!pilha.isFull()) {
            pilha.push(gerador.nextInt(101));
        }
    }

    public static void printarPilha(StaticStack pilha) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        int posicao = 1;

        while(!pilha.isEmpty()) {
            int elemento = pilha.pop();
            System.out.println(posicao + "º elemento -> " + elemento);
            posicao++;
            pilhaAuxiliar.push(elemento);
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }

    public static void maiorElementoTopoPilha(StaticStack pilha) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        int maiorElemento = 0;

        while(!pilha.isEmpty()) {
            int elemento = pilha.pop();
            if(elemento > maiorElemento || pilhaAuxiliar.isEmpty()) {
                maiorElemento = elemento;
            }
            pilhaAuxiliar.push(elemento);
        }

        int quantidadeMaiorElemento = 0;
        while(!pilhaAuxiliar.isEmpty()) {
            int elemento = pilhaAuxiliar.pop();

            if(elemento == maiorElemento && quantidadeMaiorElemento == 0) {
                quantidadeMaiorElemento++;
                continue;
            }

            pilha.push(elemento);
        }

        pilha.push(maiorElemento);
    }

    public static int quantidadeDesempilhado(StaticStack pilha, int elemento) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        int quantidadeDesempilhado = 0;

        while(!pilha.isEmpty()) {
            int elementoDesempilhado = pilha.pop();
            if(elementoDesempilhado == elemento) {
                break;
            }
            pilhaAuxiliar.push(elementoDesempilhado);
            quantidadeDesempilhado++;
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }

        if(quantidadeDesempilhado == pilha.length()) {
            return -1;
        }

        return quantidadeDesempilhado;
    }
}
