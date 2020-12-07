package exercicio19;

import exercicio19.exception.SearchValueListException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    /*
    * 19 - Implemente uma função na sua lista simplesmente encadeada que busca um
    * determinado elemento e retorne o elemento no retorno da função. Se o elemento não for
    * encontrado, soltar exceção, elemento não encontrado.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DinamicList list = new DinamicList();
        System.out.println("=====| PREENCHENDO LISTA |=====");
        fillList(list);
        System.out.println("---------------------------------------------");

        try {

            System.out.print("Digite um valor para buscar na lista: ");
            int value = scan.nextInt();

            System.out.println("Valor encontrado: " + list.searchValue(value));
        } catch(InputMismatchException inputMismatchException) {
            System.out.println("-> ERRO: Valor inválido! " +
                    "Execute o programa e tente novamente com um número inteiro");
        } catch(SearchValueListException searchValueListException) {
            System.out.println(searchValueListException.getMessage());
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

                list.insertLast(value);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente digitando um número inteiro.");
            }
        }
    }
}
