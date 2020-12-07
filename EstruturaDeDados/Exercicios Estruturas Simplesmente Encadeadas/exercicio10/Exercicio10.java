package exercicio10;

import exercicio10.exception.ListException;
import exercicio10.exception.RemoveListException;

public class Exercicio10 {
    /*
    * 10 - Dada uma lista encadeada de caracteres formada por uma sequência alternada de letras
    * e dígitos, construa um método que retorne uma lista na qual as letras são mantidas na
    * sequência original e os dígitos são colocados na ordem inversa.
    * Exemplos:
        * ● A 1 E 5 T 7 W 8 G → A E T W G 8 7 5 1
        * ● 3 C 9 H 4 Q 6 → C H Q 6 4 9 3
    */

    public static void main(String[] args) {
        // Usando os exemplos do enunciado para teste:

        // EXEMPLO 1: A 1 E 5 T 7 W 8 G → A E T W G 8 7 5 1
        DinamicList listaEx1 = new DinamicList();
        listaEx1.insertLast('A');
        listaEx1.insertLast('1');
        listaEx1.insertLast('E');
        listaEx1.insertLast('5');
        listaEx1.insertLast('T');
        listaEx1.insertLast('7');
        listaEx1.insertLast('W');
        listaEx1.insertLast('8');
        listaEx1.insertLast('G');

        try {
            System.out.println("===| LISTA EXEMPLO 1 NORMAL |===");
            listaEx1.list();

            System.out.println("\n===| LISTA EXEMPLO 1 REORDENADA |===");
            DinamicList listaEx1Reordenada = reordernarLista(listaEx1);
            listaEx1Reordenada.list();
        } catch(ListException listException) {
            System.out.println(listException.getMessage());
        }

        System.out.println("\n--------------------------------------------------\n");

        // EXEMPLO 2: A 1 E 5 T 7 W 8 G → A E T W G 8 7 5 1
        DinamicList listaEx2 = new DinamicList();
        listaEx2.insertLast('3');
        listaEx2.insertLast('C');
        listaEx2.insertLast('9');
        listaEx2.insertLast('H');
        listaEx2.insertLast('4');
        listaEx2.insertLast('Q');
        listaEx2.insertLast('6');

        try {
            System.out.println("===| LISTA EXEMPLO 2 NORMAL |===");
            listaEx2.list();

            System.out.println("\n===| LISTA EXEMPLO 2 REORDENADA |===");
            DinamicList listaEx2Reordenada = reordernarLista(listaEx2);
            listaEx2Reordenada.list();
        } catch(ListException listException) {
            System.out.println(listException.getMessage());
        }
    }

    public static DinamicList reordernarLista(DinamicList lista) {
        DinamicList listaAux = new DinamicList();
        DinamicList listaLetras = new DinamicList();
        DinamicList listaDigitos = new DinamicList();

        DinamicList listaReordenada = new DinamicList();

        try {

            while(!lista.isEmpty()) {
                char elementoLista = lista.remove();

                if(Character.isDigit(elementoLista)) {
                    listaDigitos.insertFirst(elementoLista);
                }
                else {
                    listaLetras.insertLast(elementoLista);
                }

                listaAux.insertLast(elementoLista);
            }

            while(!listaLetras.isEmpty()) {
                listaReordenada.insertLast(listaLetras.remove());
            }
            while(!listaDigitos.isEmpty()) {
                listaReordenada.insertLast(listaDigitos.remove());
            }

            while(!listaAux.isEmpty()) {
                lista.insertLast(listaAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return listaReordenada;
    }
}
