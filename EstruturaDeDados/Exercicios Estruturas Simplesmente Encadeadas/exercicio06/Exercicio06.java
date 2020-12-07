package exercicio06;

import exercicio06.exception.DequeueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {
    /*
    * 06 - Escreva uma função void MoveMenor que, dada uma fila simplesmente encadeada com
    * um número qualquer de elementos, acha o menor elemento da fila e o mova-o para o início.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DinamicQueue fila = new DinamicQueue();

        System.out.println("----- PREENCHENDO A FILA -----");
        preencherFila(fila);
        System.out.println("------------------------------\n");

        if(!fila.isEmpty()) {

            System.out.println("===== FILA NORMAL =====");
            printarFila(fila);
            System.out.println("=======================\n");

            moveMenor(fila);

            System.out.println("===== FILA COM O MENOR VALOR NO INÍCIO =====");
            printarFila(fila);
            System.out.println("===========================================");
        }
    }

    public static void moveMenor(DinamicQueue fila) {
        if(fila.isEmpty()) {
            System.out.println("-> ERRO: Fila vazia! Não é possível realizar o movimento de valor.");
        }

        DinamicQueue filaAuxiliar = new DinamicQueue();
        int menorValor = 0;

        try {

            while(!fila.isEmpty()) {
                int valorFila = fila.dequeue();

                if(valorFila < menorValor || filaAuxiliar.isEmpty()) {
                    menorValor = valorFila;
                }

                filaAuxiliar.enqueue(valorFila);
            }

            fila.enqueue(menorValor);

            boolean pulou = false;
            while(!filaAuxiliar.isEmpty()) {
                int valorFila = filaAuxiliar.dequeue();

                if(valorFila == menorValor && !pulou) {
                    pulou = true;
                    continue;
                }

                fila.enqueue(valorFila);
            }

        } catch(DequeueException dequeueException) {
            System.out.println(dequeueException.getMessage());
        }
    }

    public static void preencherFila(DinamicQueue fila) {
        Scanner scan = new Scanner(System.in);

        while(true) {

            try {

                System.out.print("Digite um valor para a fila (-999 para encerrar) -> ");
                int valor = scan.nextInt();

                if(valor == -999) {
                    return;
                }

                fila.enqueue(valor);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente.");
                scan.next();
            }

        }
    }

    public static void printarFila(DinamicQueue fila) {
        DinamicQueue filaAuxiliar = new DinamicQueue();
        int posicao = 1;

        try {

            while(!fila.isEmpty()) {
                int valorFila = fila.dequeue();

                System.out.println(posicao + "º Elemento -> " + valorFila);
                posicao++;

                filaAuxiliar.enqueue(valorFila);
            }


            while(!filaAuxiliar.isEmpty()) {
                fila.enqueue(filaAuxiliar.dequeue());
            }

        } catch(DequeueException dequeueException) {
            System.out.println(dequeueException.getMessage());
        }
    }
}
