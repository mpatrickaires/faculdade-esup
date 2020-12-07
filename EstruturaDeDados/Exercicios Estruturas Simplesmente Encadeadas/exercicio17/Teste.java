package exercicio17;

import exercicio17.exception.BreakListException;
import exercicio17.exception.ListException;

public class Teste {

    public static void main(String[] args) {
        DinamicDoubleList list = new DinamicDoubleList();

        // USANDO OS VALORES DE EXEMPLO NA IMAGEM EM ANEXO DO ENUNCIADO
        list.insertLast(133);
        list.insertLast(8);
        list.insertLast(75);
        list.insertLast(14);
        list.insertLast(7);

        try {
            System.out.println("==========| LISTA NORMAL |==========");
            list.list();

            System.out.println("\n\n=====| LISTA QUEBRADA NO VALOR 75 |=====");
            DinamicDoubleList listBreak = list.breakList(75);
            listBreak.list();
        } catch(BreakListException | ListException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
