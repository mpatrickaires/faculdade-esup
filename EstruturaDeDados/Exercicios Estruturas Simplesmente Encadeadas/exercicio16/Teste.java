package exercicio16;

import exercicio16.exception.RemoveListException;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DinamicDoubleList lista = new DinamicDoubleList();

        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(4);

        try {
            lista.remove();
            lista.remove();
            lista.remove();
            lista.remove();
        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        lista.insertFirst(1);
        lista.insertFirst(2);
        lista.insertFirst(3);
        lista.insertFirst(4);

        try {
            lista.remove();
            lista.remove();
            lista.remove();
            lista.remove();
        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }
    }
}
