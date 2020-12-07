package exercicio08;

import exercicio08.centralatendimento.Atendente;
import exercicio08.centralatendimento.CentralAtendimento;
import java.util.Scanner;

public class Exercicio08 {
    /*
    * 08 - Uma central de atendimento a clientes tem vários atendentes, mas um número muito
    * maior de linhas telefônicas recebendo chamadas. As chamadas são colocadas em uma fila
    * de espera segundo a ordem de chegada (e atendidas quando possível). Ocorre que
    * algumas destas chamadas vêm de longe, e neste caso, se elas ficam esperando na linha,
    * elas ficam causando uma despesa muito maior do que as chamadas que vem de perto. Uma
    * solução alternativa seria colocar as chamadas em fila segundo a prioridade definida
    * primeiramente pelo custo (as mais caras devem esperar menos) e secundariamente por
    * ordem de chamada. Projete uma estrutura para modelar essa situação alternativa.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CentralAtendimento centralAtendimento = new CentralAtendimento();

        for(int posicao = 0; posicao < 4; posicao++) {
            Atendente atendente = new Atendente();
            centralAtendimento.adicionarAtendente(atendente);
        }

        int opcao = 0;
        do {
            System.out.println("=======| CENTRAL DE ATENDIMENTO |=======");
            centralAtendimento.printarCentral();
            System.out.println("------------------------------------------\n");

            System.out.println("[1] ENFILEIRAR CLIENTE");
            System.out.println("[2] ATENDER CLIENTE");
            System.out.println("[3] LIBERAR ATENDENTE");
            System.out.println("[4] ENCERRAR PROGRAMA");
            System.out.println("========================================");
            System.out.print("Digite uma opção: ");
            opcao = scan.nextInt();

            while(opcao < 1 || opcao > 4) {
                System.out.println("-> ERRO: Opção inválida! Tente novamente");
                System.out.print("Digite uma opção: ");
                opcao = scan.nextInt();
            }

            System.out.println("------------------------------------------");

            switch(opcao) {
                case 1:
                    enfileirarCliente(centralAtendimento);
                    break;

                case 2:
                    centralAtendimento.transferirParaAtendente();
                    break;

                case 3:
                    centralAtendimento.liberarAtendente();
                    break;
            }

            System.out.println("\n");

        } while(opcao != 4);

        System.out.println("====| E N C E R R A N D O . . . |====");
    }

    public static void enfileirarCliente(CentralAtendimento centralAtendimento) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da chamada: R$");
        double valorChamada = scan.nextDouble();

        centralAtendimento.enfileirarCliente(valorChamada);
    }
}
