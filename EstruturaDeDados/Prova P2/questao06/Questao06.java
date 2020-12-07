package provap2.questao06;

import provap2.questao06.dinamicqueue.Cliente;
import provap2.questao06.dinamicqueue.DinamicQueue;
import provap2.questao06.dinamicqueue.exception.DequeueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao06 {
    /*
    * 06 - Dado um TAD de fila simplesmente encadeada para um banco, será uma fila de strings que contenha
    * nomes de clientes aguardando atendimento. Existem 2 tipos de clientes, clientes comuns e clientes com
    * prioridade inseridos na mesma fila. Chegando um cliente comum, ele entra no fim da fila, como de costume,
    * sendo o cliente com prioridade, não tendo nenhum outro cliente com prioridade, é inserido no início,
    * caso já existam clientes com prioridade o mesmo é inserido entra o último com prioridade e o
    * primeiro cliente comum. Criar uma função que retira os clientes da fila, conforme os caixas vão chamando.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DinamicQueue fila = new DinamicQueue();

        int opcao;
        do {
            printarFila(fila);

            System.out.println("[1] ENFILEIRAR CLIENTE");
            System.out.println("[2] DESENFILEIRAR CLIENTE");
            System.out.println("[3] ENCERRAR PROGRAMA");
            System.out.println("-------------------------------");

            while(true) {

                try {

                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();

                    while(opcao < 1 || opcao > 3) {
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

            System.out.println("-------------------------------");

            switch(opcao) {
                case 1:
                    enfileirarCliente(fila);
                    limparTela();
                    break;

                case 2:
                    desenfileirarCliente(fila);
                    break;

                case 3:
                    System.out.println("=======| ENCERRANDO... |=======");
                    break;
            }


        } while(opcao != 3);

        System.out.println("-------------------------------");
    }

    public static void enfileirarCliente(DinamicQueue fila) {
        Scanner scan = new Scanner(System.in);

        String nome;
        boolean prioridade = false;

        System.out.print("Digite o nome do cliente: ");
        nome = scan.nextLine();

        System.out.println("==============================");
        System.out.println("[1] POSSUI PRIORIDADE");
        System.out.println("[2] NÃO POSSUI PRIORIDADE");
        System.out.println("==============================");

        int opcao;
        while(true) {

            try {

                System.out.print("Digite uma opção: ");
                opcao = scan.nextInt();

                while(opcao < 1 || opcao > 2) {
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

        switch(opcao) {
            case 1:
                prioridade = true;
                break;

            case 2:
                prioridade = false;
                break;

        }

        Cliente cliente = new Cliente(nome, prioridade);
        fila.enqueue(cliente);
    }

    public static void desenfileirarCliente(DinamicQueue fila) {
        try {
            fila.dequeue();
        } catch(DequeueException dequeueException) {
            System.out.println(dequeueException.getMessage());
            System.out.println("-------------------------------");
        }
    }

    public static void printarFila(DinamicQueue fila) {
        DinamicQueue filaAux = new DinamicQueue();
        System.out.println("\n\n==========| F I L A |==========");

        if(fila.isEmpty()) {
            System.out.println("          FILA VAZIA");
        }
        else {

            try {
                int contador = 1;
                while (!fila.isEmpty()) {
                    Cliente cliente = fila.dequeue();

                    System.out.print(contador + "º Cliente -> " + cliente.getNome());

                    if (cliente.isPrioridade()) {
                        System.out.print(" -- PRIORIDADE");
                    }
                    System.out.println();

                    filaAux.enqueue(cliente);

                    contador++;
                }

                while (!filaAux.isEmpty()) {
                    fila.enqueue(filaAux.dequeue());
                }

            } catch (DequeueException dequeueException) {
                System.out.println(dequeueException.getMessage());
            }
        }

        System.out.println("===============================");
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }
}
