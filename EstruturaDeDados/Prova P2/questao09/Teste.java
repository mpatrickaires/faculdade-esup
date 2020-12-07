package provap2.questao09;

import provap2.questao09.exception.RemoveListException;

import java.util.Scanner;

public class Teste {
    /*
     * 09 - Uma lista duplamente encadeada possui registros que tem ligações com o sucessor e o
     * predecessor de cada nó.
     * Tendo como base a lista apresentada em sala de aula, crie uma nova lista, que seja circular, ou seja,
     * o próximo nó do último elemento aponta para o primeiro elemento da lista.
     * Desta forma, exclua o tail da da sua lista circular (visto que como é uma lista circular,
     * sua nova lista não deverá contar com um final), o Head continua existindo, o próximo do head aponta
     * para o primeiro elemento, e o anterior do head aponta para null
     * (comportamento semelhante na lista duplamente encadeada tradicional). Adapte todos os métodos para que o
     * comportamento da lista duplamente encadeada circular funciona adequadamente.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DinamicDoubleCircularList lista = new DinamicDoubleCircularList();

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
