package provap2.questao05;

import provap2.questao05.doublelist.DinamicDoubleList;
import provap2.questao05.doublelist.exception.RemoveListException;
import provap2.questao05.exception.RemoverElementoException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Questao05 {
    /*
    * 05 - Implemente um TAD de uma lista duplamente encadeada  de inteiros, com os elementos gerados de forma
    * randômica com as seguintes operações:
    *
    *   A. Função boolean que busque determinado elemento na listas, se encontrar retornar true,
    *   caso contário retornar false
    *
    *   B.	Função que passe um número por parâmetro e remova o elemento informado, se elemento não encontrado
    *   informar uma exception
    *
    *   C.	Função definir prioridade, que busque um determinado número por parâmetro, remova-o da posição e
    *   coloque-o na primeira posição, se número não existir, apenas inserir na primeira posição.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DinamicDoubleList list = new DinamicDoubleList();
        popularListaRandomico(list);

        int opcao;
        do {
            System.out.print("LISTA -->  ");
            printarList(list);

            System.out.println("=========================");
            System.out.println("[1] BUSCAR ELEMENTO");
            System.out.println("[2] REMOVER ELEMENTO");
            System.out.println("[3] DEFINIR PRIORIDADE");
            System.out.println("[4] ENCERRAR PROGRAMA");
            System.out.println("=========================");

            while(true) {

                try {

                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();

                    while(opcao < 1 || opcao > 4) {
                        System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                        System.out.print("Digite uma opção: ");
                        opcao = scan.nextInt();
                    }

                    break;

                } catch(InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor de entrada inválido!" +
                            "Tente novamente com um número inteiro.");
                    scan.next();
                }

            }

            System.out.println("\n-------------------------");

            int elemento;
            switch(opcao) {
                case 1:
                    while(true) {

                        try {

                            System.out.print("Digite um valor para buscar na lista: ");
                            elemento = scan.nextInt();
                            break;

                        } catch (InputMismatchException inputMismatchException) {
                            System.out.println("-> ERRO: Valor de entrada inválido! " +
                                    "Tente novamente com um número inteiro.");
                            scan.next();
                        }
                    }

                    System.out.println("-------------------------");

                    if(buscarElemento(list, elemento)) {
                        System.out.println("Esse elemento está na lista!");
                    }
                    else {
                        System.out.println("Não existe esse elemento na lista!");
                    }
                    break;

                case 2:
                    while(true) {

                        try {

                            System.out.print("Digite um valor para remover da lista: ");
                            elemento = scan.nextInt();
                            break;

                        } catch (InputMismatchException inputMismatchException) {
                            System.out.println("-> ERRO: Valor de entrada inválido! " +
                                    "Tente novamente com um número inteiro.");
                            scan.next();
                        }
                    }

                    try {

                        removerElemento(list, elemento);

                    } catch(RemoverElementoException removerElementoException) {
                        System.out.println(removerElementoException.getMessage());
                    }
                    break;

                case 3:
                    while(true) {

                        try {

                            System.out.print("Digite um valor para definir a prioridade na lista: ");
                            elemento = scan.nextInt();
                            break;

                        } catch (InputMismatchException inputMismatchException) {
                            System.out.println("-> ERRO: Valor de entrada inválido! " +
                                    "Tente novamente com um número inteiro.");
                            scan.next();
                        }
                    }

                    definirPrioridade(list, elemento);
                    break;

                case 4:
                    System.out.println("====| ENCERRANDO... |====");
                    break;
            }

            System.out.println("-------------------------\n");

        } while(opcao != 4);
    }

    public static boolean buscarElemento(DinamicDoubleList list, int elemento) {
        DinamicDoubleList listAux = new DinamicDoubleList();

        boolean busca = false;

        try {

            while(!list.isEmpty()) {
                int elementoList = list.remove();

                if(elementoList == elemento) {
                    busca = true;
                }

                listAux.insertLast(elementoList);
            }

            while(!listAux.isEmpty()) {
                list.insertLast(listAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        return busca;
    }

    public static void removerElemento(DinamicDoubleList list, int elemento) throws RemoverElementoException {
        if(!buscarElemento(list, elemento)) {
            System.out.println("-------------------------");
            throw new RemoverElementoException();
        }

        DinamicDoubleList listAux = new DinamicDoubleList();

        boolean removido = false;

        try {

            while(!list.isEmpty()) {
                int elementoList = list.remove();

                if(elemento == elementoList && !removido) {
                    removido = true;
                    continue;
                }

                listAux.insertLast(elementoList);
            }

            while(!listAux.isEmpty()) {
                list.insertLast(listAux.remove());
            }

            System.out.println("-------------------------");
            System.out.println("Remoção efetuada com sucesso!");

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }
    }

    public static void definirPrioridade(DinamicDoubleList list, int elemento) {
        if(!buscarElemento(list, elemento)) {
            list.insertFirst(elemento);
            return;
        }

        DinamicDoubleList listAux = new DinamicDoubleList();

        boolean encontrou = false;
        try {

            while(!list.isEmpty()) {
                int elementoList = list.remove();

                if(elementoList == elemento && !encontrou) {
                    encontrou = true;
                    continue;
                }

                listAux.insertLast(elementoList);
            }

            list.insertFirst(elemento);

            while(!listAux.isEmpty()) {
                list.insertLast(listAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }
    }

    public static void popularListaRandomico(DinamicDoubleList list) {
        Random random = new Random();

        for(int contador = 0; contador < 20; contador++) {
            list.insertLast(random.nextInt(101));
        }
    }

    public static void printarList(DinamicDoubleList list) {
        DinamicDoubleList listAux = new DinamicDoubleList();

        try {

            while(!list.isEmpty()) {
                int elemento = list.remove();

                System.out.print("[" + elemento + "]");

                if(list.getSize() != 0) {
                    System.out.print(", ");
                }

                listAux.insertLast(elemento);
            }
            while(!listAux.isEmpty()) {
                list.insertLast(listAux.remove());
            }

            System.out.println();

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }
    }
}
