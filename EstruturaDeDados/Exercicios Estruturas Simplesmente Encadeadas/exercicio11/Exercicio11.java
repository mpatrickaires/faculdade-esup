package exercicio11;

import exercicio11.exception.ListException;
import exercicio11.exception.RemoveListException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio11 {
    /*
    * 11 - Construa um método que recebe uma lista encadeada de números inteiros e retorna
    * uma lista sem repetições, ou seja, uma lista onde cada número apareça apenas uma vez.
    */

    public static void main(String[] args) {
        DinamicList lista = new DinamicList();
        System.out.println("---------- PREENCHENDO LISTA ----------");
        preencherLista(lista);

        System.out.println("\n\n===== LISTA SEM ELEMENTOS REPETIDOS =====");
        DinamicList listaSemRepeticao = listaSemRepeticao(lista);

        try {
            listaSemRepeticao.list();
        } catch(ListException listException) {
            System.out.println(listException.getMessage());
        }
    }

    public static DinamicList listaSemRepeticao(DinamicList lista) {
        DinamicList listaAux = new DinamicList();

        DinamicList listaSemRepeticao = new DinamicList();

        try {

            while(!lista.isEmpty()) {
                int elementoLista = lista.remove();

                if(!isRepeated(listaSemRepeticao, elementoLista)) {
                    listaSemRepeticao.insertLast(elementoLista);
                }

                listaAux.insertLast(elementoLista);
            }

            while(!listaAux.isEmpty()) {
                lista.insertLast(listaAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return listaSemRepeticao;
    }

    public static boolean isRepeated(DinamicList lista, int elemento) {
        DinamicList listaAux = new DinamicList();
        boolean repete = false;

        try {

            while(!lista.isEmpty()) {
                int elementoLista = lista.remove();

                if(elementoLista == elemento) {
                    repete = true;
                }

                listaAux.insertLast(elementoLista);
            }

            while(!listaAux.isEmpty()) {
                lista.insertLast(listaAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return repete;
    }

    public static void preencherLista(DinamicList lista) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            try {

                System.out.print("Digite um valor (-999 para encerrar): ");
                int valor = scan.nextInt();

                if (valor == -999) {
                    break;
                }

                lista.insertLast(valor);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente com um número inteiro.");
                scan.next();
            }
        }
    }
}
