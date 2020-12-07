package exercicio12;

import exercicio12.exception.ListException;
import exercicio12.exception.SearchListException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio12 {
    /*
    * 12 - Crie uma função search na lista simplesmente encadeada que busca e remove o
    * elemento da lista. Se o elemento não existir, soltar uma exceção específica criada para
    * elemento buscado e não encontrado. Ao final do exercício, a lista deve manter sua
    * configuração original, sem o elemento buscado.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DinamicList lista = new DinamicList();

        System.out.println("----------| PREENCHENDO A LISTA |----------");
        while(true) {

            try {

                System.out.print("Digite um valor (-999 para encerrar): ");
                int valor = scan.nextInt();

                if(valor == -999) {
                    break;
                }

                lista.insertLast(valor);
            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente com um número inteiro.");
                scan.next();
            }

        }

        try {

            System.out.println("\n-------------------------------------------");
            int valorRemover;

            while(true) {

                try {

                    System.out.print("Digite um valor da lista para removê-lo: ");
                    valorRemover = scan.nextInt();
                    break;

                } catch(InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor inválido! Tente novamente com um número inteiro.");
                    scan.next();
                }
            }

            System.out.println("-------------------------------------------\n");

            lista.search(valorRemover);
            System.out.println("=====| LISTA COM O VALOR " + valorRemover + " REMOVIDO |=====");
            lista.list();

        } catch(SearchListException | ListException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
