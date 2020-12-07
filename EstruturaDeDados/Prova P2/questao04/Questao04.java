package provap2.questao04;

import provap2.questao04.list.DinamicList;
import provap2.questao04.list.exception.RemoveListException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Questao04 {
    /*
    * 04 - Implemente uma TAD, contendo duas listas L1 com treze inteiros inseridos e
    * L2 com 32 inteiros inseridos simplesmente encadeadas gerados de forma randômicamente, que contenha as
    * seguintes operações de conjunto:
    *
    *   A. L1 U L2
    *   B. L1 ⋂ L2
    *   C. L1 - L2
    *   D. L2 - L1
    *
    * Obs.: Todo o código deve estar na sua prova. TAD da lista, nó e o que foi pedido.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DinamicList list1 = new DinamicList();
        DinamicList list2 = new DinamicList();

        popularRandomicamenteLista(list1, list2);

        System.out.print("LISTA 1 -->  ");
        printarLista(list1);

        System.out.print("\nLISTA 2 -->  ");
        printarLista(list2);

        DinamicList listUniao = uniaoListas(list1, list2);

        DinamicList listInterseccao = interseccaoListas(list1, list2);

        DinamicList listSubtracao1 = subtracaoListas(list1, list2);

        DinamicList listSubtracao2 = subtracaoListas(list2, list1);

        int opcao;
        do {

            System.out.println("\n=====| VISUALIZAÇÕES |=====");
            System.out.println("[1] L1 U L2 ");
            System.out.println("[2] L1 ⋂ L2 ");
            System.out.println("[3] L1 - L2 ");
            System.out.println("[4] L2 - L1 ");
            System.out.println("[5] ENCERRAR PROGRAMA");
            System.out.println("===========================");

            while(true) {

                try {
                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();

                    while(opcao < 1 || opcao > 5) {
                        System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                        System.out.print("Digite uma opção: ");
                        opcao = scan.nextInt();
                    }

                    break;

                } catch(InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor de entrada inválido! " +
                            "Tente novamente com um número inteiro.");
                    scan.next();
                }

            }

            System.out.println("---------------------------");

            switch(opcao) {
                case 1:
                    System.out.print("LISTA UNIÃO -> ");
                    printarLista(listUniao);
                    break;

                case 2:
                    System.out.print("LISTA INTERSECÇÃO -> ");
                    printarLista(listInterseccao);
                    break;

                case 3:
                    System.out.print("LISTA L1 - L2 -> ");
                    printarLista(listSubtracao1);
                    break;

                case 4:
                    System.out.print("LISTA L2 - L1 -> ");
                    printarLista(listSubtracao2);
                    break;

                case 5:
                    System.out.println("=====| ENCERRANDO... |=====");
                    break;
            }

            System.out.println("---------------------------");

        } while(opcao != 5);
    }

    public static DinamicList uniaoListas(DinamicList list1, DinamicList list2) {
        DinamicList list1Aux = new DinamicList();
        DinamicList list2Aux = new DinamicList();

        DinamicList listUniao = new DinamicList();

        try {

            while(!list1.isEmpty()) {
                int elemento = list1.remove();

                if(!repete(listUniao, elemento)) {
                    listUniao.insertLast(elemento);
                }

                list1Aux.insertLast(elemento);
            }
            while(!list1Aux.isEmpty()) {
                list1.insertLast(list1Aux.remove());
            }

            while(!list2.isEmpty()) {
                int elemento = list2.remove();

                if(!repete(listUniao, elemento)) {
                    listUniao.insertLast(elemento);
                }

                list2Aux.insertLast(elemento);
            }
            while(!list2Aux.isEmpty()) {
                list2.insertLast(list2Aux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return listUniao;
    }

    public static DinamicList interseccaoListas(DinamicList list1, DinamicList list2) {
        DinamicList list1Aux = new DinamicList();

        DinamicList listInterseccao = new DinamicList();

        try {

            while(!list1.isEmpty()) {
                int elemento = list1.remove();

                if(repete(list2, elemento) && !repete(listInterseccao, elemento)) {
                    listInterseccao.insertLast(elemento);
                }

                list1Aux.insertLast(elemento);
            }
            while(!list1Aux.isEmpty()) {
                list1.insertLast(list1Aux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return listInterseccao;
    }

    public static DinamicList subtracaoListas(DinamicList list1, DinamicList list2) {
        DinamicList list1Aux = new DinamicList();
        DinamicList list2Aux = new DinamicList();

        DinamicList listSubtracao = new DinamicList();

        try {

            while(!list1.isEmpty()) {
                int elementoList1 = list1.remove();

                if(!list2.isEmpty()) {
                    int elementoList2 = list2.remove();
                    listSubtracao.insertLast(elementoList1 - elementoList2);
                    list2Aux.insertLast(elementoList2);
                }

                else {
                    listSubtracao.insertLast(elementoList1);
                }


                list1Aux.insertLast(elementoList1);
            }
            while(!list1Aux.isEmpty()) {
                list1.insertLast(list1Aux.remove());
            }

            while(!list2.isEmpty()) {
                list2Aux.insertLast(list2.remove());
            }
            while(!list2Aux.isEmpty()) {
                list2.insertLast(list2Aux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return listSubtracao;
    }

    public static boolean repete(DinamicList list, int elemento) {
        DinamicList listAux = new DinamicList();
        boolean repete = false;

        try {

            while(!list.isEmpty()) {
                int elementoList = list.remove();

                if(elemento == elementoList) {
                    repete = true;
                }

                listAux.insertLast(elementoList);
            }
            while(!listAux.isEmpty()) {
                list.insertLast(listAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return repete;
    }

    public static void popularRandomicamenteLista(DinamicList list1, DinamicList list2) {
        Random random = new Random();

        for(int contador = 0; contador < 32; contador++) {
            if(contador < 13) {
                list1.insertLast(random.nextInt(101));
            }

            list2.insertLast(random.nextInt(101));
        }
    }

    public static void printarLista(DinamicList list) {
        DinamicList list1Aux = new DinamicList();

        try {

            while(!list.isEmpty()) {
                int elemento = list.remove();

                System.out.print("[" + elemento + "]");

                if(list.getSize() != 0) {
                    System.out.print(", ");
                }


                list1Aux.insertLast(elemento);
            }
            while(!list1Aux.isEmpty()) {
                list.insertLast(list1Aux.remove());
            }

            System.out.println();

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }
    }
}
