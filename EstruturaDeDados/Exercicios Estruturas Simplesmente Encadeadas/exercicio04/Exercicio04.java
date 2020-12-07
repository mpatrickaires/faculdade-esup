package exercicio04;

import exercicio04.exception.PopException;
import exercicio04.exception.RemoveItemException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    /*
    * 04 - Crie uma função na pilha simplesmente encadeada que remove um item com chave key
    * fornecida pelo usuário da pilha. Esta função deve fazer parte da classe StackDinamic, e sua
    * função deve manter as propriedades da pilha, ou seja, a manipulação deve-se dar a partir do
    * Top.
    *
    * Obs.: Após o ítem de chave key removido, a pilha deve permanecer em sua
    * configuração anterior, apenas sem o o ítem de chave key.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DinamicStack pilha = new DinamicStack();

        System.out.println("---------- PREENCHENDO A PILHA ----------");
        preencherPilha(pilha);
        System.out.println("-----------------------------------------\n\n");

        if(!pilha.isEmpty()) {

            System.out.println("=====| P I L H A |=====");
            printarPilha(pilha);
            System.out.println("=======================\n");

            while (true) {

                try {
                    System.out.print("Digite a chave do elemento que deseja remover: ");
                    int key = scan.nextInt();

                    while (key <= 0 || key > pilha.getSize()) {
                        System.out.println("-> ERRO: Chave inválida! Tente novamente.");
                        System.out.print("Digite a chave do elemento que deseja remover: ");
                        key = scan.nextInt();
                    }

                    pilha.removeItem(key);

                    System.out.println("\n=====| P I L H A |=====");
                    printarPilha(pilha);
                    System.out.println("=======================");

                    break;

                } catch (RemoveItemException removeItemException) {
                    System.out.println(removeItemException.getMessage());

                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor inválido! Tente novamente.");
                    scan.next();
                }
            }

        }
    }

    public static void preencherPilha(DinamicStack pilha) {
        Scanner scan = new Scanner(System.in);

        while(true) {

            try {

                System.out.print("Digite um valor (-999 para encerrar) -> ");
                int valor = scan.nextInt();

                if (valor == -999) {
                    return;
                }

                pilha.push(valor);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente.");
                scan.next();
            }
        }
    }

    public static void printarPilha(DinamicStack pilha) {
        DinamicStack pilhaAuxiliar = new DinamicStack();
        int posicao = pilha.getSize();

        try {

            while(!pilha.isEmpty()) {
                int valor = pilha.pop();

                System.out.println("[" + posicao + "] -> " + valor);
                posicao--;

                pilhaAuxiliar.push(valor);
            }

            while(!pilhaAuxiliar.isEmpty()) {
                pilha.push(pilhaAuxiliar.pop());
            }

        } catch(PopException popException) {
            System.out.println(popException.getMessage());
        }
    }
}
