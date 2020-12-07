package exercicio09;

import exercicio09.exception.ListException;
import exercicio09.exception.RemoveListException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio09 {
    /*
    * 09 - Dadas duas filas encadeadas e dinâmicas L1 e L2, implemente a operação UNION, que
    * cria uma terceira fila L3 com a união entre as duas listas.
    */
    
    public static void main(String[] args) {
        System.out.println("=====| LISTA 1 |=====");
        DinamicList lista1 = new DinamicList();
        fillList(lista1);

        System.out.println("\n\n=====| LISTA 2 |=====");
        DinamicList lista2 = new DinamicList();
        fillList(lista2);

        System.out.println("\n\n=====| LISTA UNION |=====");
        DinamicList lista3 = union(lista1, lista2);
        try {
            lista3.list();
        } catch(ListException listException) {
            System.out.println(listException.getMessage());
        }
    }
    
    public static DinamicList union(DinamicList lista1, DinamicList lista2) {
        DinamicList lista1Aux = new DinamicList();
        DinamicList lista2Aux = new DinamicList();

        DinamicList listaUnion = new DinamicList();

        try {

            while(!lista1.isEmpty()) {
                int elementoLista = lista1.remove();

                if(!isRepeated(listaUnion, elementoLista)) {
                    listaUnion.insertLast(elementoLista);
                }

                lista1Aux.insertLast(elementoLista);
            }
            while(!lista1Aux.isEmpty()) {
                lista1.insertLast(lista1Aux.remove());
            }

            while(!lista2.isEmpty()) {
                int elementoLista = lista2.remove();

                if(!isRepeated(listaUnion, elementoLista)) {
                    listaUnion.insertLast(elementoLista);
                }

                lista2Aux.insertLast(elementoLista);
            }
            while(!lista2Aux.isEmpty()) {
                lista2.insertLast(lista2Aux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return listaUnion;
    }

    public static boolean isRepeated(DinamicList lista, int elemento) {
        DinamicList listaAux = new DinamicList();
        boolean repete = false;

        try {

            while(!lista.isEmpty()) {
                int elementoLista = lista.remove();

                listaAux.insertLast(elementoLista);

                if(elementoLista == elemento) {
                    repete = true;
                }
            }

            while(!listaAux.isEmpty()) {
                lista.insertLast(listaAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return repete;
    }

    public static void fillList(DinamicList lista) {
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
