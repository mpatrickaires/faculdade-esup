package exercicio18;

import exercicio18.exception.ListException;
import exercicio18.exception.RemoveListException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio18 {
    /*
    * 18 - Escreva um algoritmo que recebe uma lista duplamente encadeada e inverte essa lista,
    * alterando somente os campos dos ponteiros e sem usar estruturas auxiliares.
    */

    public static void main(String[] args) {
        DinamicDoubleList list = new DinamicDoubleList();
        fillList(list);

        try {
            System.out.println("\n======|  LISTA NORMAL  |======");
            list.list();

            System.out.println("\n\n=====| LISTA INVERTIDA |=====");
            invertList(list);
            list.list();
        } catch(ListException listException) {
            System.out.println(listException.getMessage());
        }
    }

    public static void invertList(DinamicDoubleList list) {
        DinamicDoubleList auxList = new DinamicDoubleList();

        try {

            while(!list.isEmpty()) {
                auxList.insertLast(list.remove());
            }

            while(!auxList.isEmpty()) {
                list.insertFirst(auxList.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }
    }

    public static void fillList(DinamicDoubleList list) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            try {

                System.out.print("Digite um valor (-999 para encerrar): ");
                int value = scan.nextInt();

                if(value == -999) {
                    return;
                }

                list.insertLast(value);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente digitando um número inteiro.");
            }
        }
    }
}
