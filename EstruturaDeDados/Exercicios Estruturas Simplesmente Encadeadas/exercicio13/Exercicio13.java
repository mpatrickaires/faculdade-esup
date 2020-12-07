package exercicio13;

import exercicio13.exception.ListException;
import exercicio13.exception.RemoveListException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio13 {
    /*
    * 13 - Dadas duas listas encadeadas e dinâmicas L1 e L2, sem elementos repetidos,
    * implemente a operação INTER, que cria uma terceira lista L3 com a intersecção entre as
    * duas listas, também sem elementos repetidos
    */

    public static void main(String[] args) {
        DinamicList list1 = new DinamicList();
        System.out.println("----------| PREENCHENDO LISTA 1 |----------");
        fillList(list1);
        System.out.println("-------------------------------------------");


        DinamicList list2 = new DinamicList();
        System.out.println("\n\n----------| PREENCHENDO LISTA 2 |----------");
        fillList(list2);
        System.out.println("-------------------------------------------");


        DinamicList list3 = inter(list1, list2);
        System.out.println("\n\n===========| LISTA INTERSECÇÃO |===========");

        try {

            list3.list();

        } catch(ListException listException) {
            System.out.println(listException.getMessage());
        }

        System.out.println("===========================================");
    }

    public static DinamicList inter(DinamicList list1, DinamicList list2) {
        DinamicList auxList1 = new DinamicList();

        DinamicList listInter = new DinamicList();

        try {

            while(!list1.isEmpty()) {
                int listValue = list1.remove();

                if(isRepeated(list2, listValue) && !isRepeated(listInter, listValue)) {
                    listInter.insertLast(listValue);
                }

                auxList1.insertLast(listValue);
            }

            while(!auxList1.isEmpty()) {
                list1.insertLast(auxList1.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return listInter;
    }

    public static void fillList(DinamicList list) {
        Scanner scan = new Scanner(System.in);

        while(true) {

            try {

                System.out.print("Digite um valor (-999 para encerrar): ");
                int value = scan.nextInt();

                while(isRepeated(list, value)) {
                    System.out.println("-> ERRO: Esse valor já existe na lista! " +
                            "Tente novamente com um valor diferente.");
                    System.out.print("Digite um valor (-999 para encerrar): ");
                    value = scan.nextInt();
                }

                if(value == -999) {
                    break;
                }

                list.insertLast(value);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente com um número inteiro.");
                scan.next();
            }
        }
    }

    public static boolean isRepeated(DinamicList list, int value) {
        DinamicList auxList = new DinamicList();
        boolean isRepeated = false;

        try {

            while(!list.isEmpty()) {
                int listValue = list.remove();

                if(listValue == value) {
                    isRepeated = true;
                }

                auxList.insertLast(listValue);
            }

            while(!auxList.isEmpty()) {
                list.insertLast(auxList.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return isRepeated;
    }
}
