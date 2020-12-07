package exercicio01;

import exercicio01.exception.PopException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    /*
    * 01 - Crie um programa que gerencie uma PILHA de TAREFAS a serem cumpridas. As tarefas
    * são Strings que descrevem uma ação a ser executada. Crie um menu no qual o usuário tem
    * duas opções, inserir uma nova tarefa, recuperar uma tarefa na pilha:
    *    ● Inserir tarefa na pilha: escreve a descrição da tarefa, e inseri na pilha
    *    ● recuperar tarefa: a tarefa é apresentada no terminal para o cliente.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DinamicStack pilhaTarefas = new DinamicStack();
        int opcao = -1;

        do {
            printarMenu();

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
                    System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                    scan.next();
                }
            }

            System.out.println("-------------------------------------------");

            switch(opcao) {
                case 1:
                    inserirTarefa(pilhaTarefas);
                    break;

                case 2:
                    String tarefa;

                    try {
                        tarefa = pilhaTarefas.pop();
                    } catch(PopException popException) {
                        System.out.println("-> ERRO: Pilha de tarefas vazia! Impossível recuperar tarefa.");
                        break;
                    }

                    System.out.println("Tarefa: " + tarefa);
                    break;

                case 3:
                    break;
            }

            System.out.println("\n");
        } while(opcao != 3);

        System.out.println("-| E N C E R R A N D O . . . |-");
    }

    public static void printarMenu() {
        System.out.println("==========| M E N U |==========");
        System.out.println("[1] INSERIR TAREFA");
        System.out.println("[2] RECUPERAR TAREFA");
        System.out.println("[3] ENCERRAR PROGRAMA");
        System.out.println("===============================");
    }

    public static void inserirTarefa(DinamicStack pilhaTarefas) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Descreva a tarefa a ser inserida: ");
        pilhaTarefas.push(scan.nextLine());
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }
}
