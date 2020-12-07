package exercicio14;

import exercicio14.exception.ListException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    /*
    * 14 - Crie uma função na estrutura de Lista dinâmica que insere elementos inteiros de forma
    * crescente. Sempre que um novo número é inserido, este deve ser inserido de forma que
    * toda lista esteja ordenada crescente.
    */

    public static void main(String[] args) {
        DinamicList list = new DinamicList();
        System.out.println("=====| PREENCHENDO LISTA |=====");
        fillList(list);

        try {

            System.out.println("\n\n====| LISTA ORDENADA |====");
            list.list();

        } catch(ListException listException) {
            System.out.println(listException.getMessage());
        }
    }

    public static void fillList(DinamicList list) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            try {

                System.out.print("Digite um valor (-999 para encerrar): ");
                int value = scan.nextInt();

                if(value == -999) {
                    return;
                }

                list.insertSorted(value);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente digitando um número inteiro.");
                scan.next();
            }
        }
    }
}
