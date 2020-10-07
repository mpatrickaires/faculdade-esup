package stack;

import java.util.Scanner;

public class Exercicio14 {
    /*
    * 14 - Crie uma pilha estática que armazene Strings (vai ser necessário mudar o vetor de
    * pilhas). Esta pilha irá representar um estacionamento, e deverá armazenar até 10 carros, as
    * Strings em cada posição representa as placas de carros. Este estacionamento possui
    * apenas uma entrada e uma saída, representado pelo TOPO. Se chegar um cliente para
    * retirar um carro que não seja o mais próximo da saída (TOPO), todos os carros bloqueando
    * o caminho sairão do estacionamento. O carro do cliente será manobrado para fora do
    * estacionamento, e os outros carros voltarão a ocupar a mesma sequência inicial. Escreva
    * um programa que processe um grupo de linhas de entrada. Cada linha de entrada contém
    * um ‘E’, de entrada, ou um ‘S’ de saída, e a da placa do carro. Presume-se que os carros
    * cheguem e partam na mesma ordem que entraram no estacionamento. O programa deve
    * imprimir uma mensagem sempre que um carro chegar ou sair. Quando um carro chegar, a
    * mensagem deve especificar se existe ou não vaga para o carro no estacionamento. Se não
    * houver vaga, o carro partirá sem entrar no estacionamento. Quando um carro sair do
    * estacionamento, a mensagem deverá incluir o número de carros manobrados para fora do
    * estacionamento. Note que você não tem acesso à estrutura interna da pilha (topo, item, etc),
    * apenas às operações de manipulação.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticStackString pilhaEstacionamento = new StaticStackString(10);

        label:
        while(true) {
            printarEstacionamento(pilhaEstacionamento);

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("[E] Entrar no estacionamento " +
                    "\n[S] Sair do estacionamento " +
                    "\n[Q] Encerrar Programa");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            String opcao = lerOpcao();
            System.out.println("------------------------------");

            switch (opcao) {
                case "E":
                    entrarEstacionamento(pilhaEstacionamento);
                    System.out.println("------------------------------");
                    break;
                case "S":
                    sairEstacionamento(pilhaEstacionamento);
                    System.out.println("------------------------------");
                    break;
                case "Q":
                    System.out.println("===== E N C E R R A N D O . . . =====");
                    break label;
            }
            System.out.println();
        }
    }

    public static void printarEstacionamento(StaticStackString pilhaEstacionamento) {
        StaticStackString pilhaAuxiliar = new StaticStackString(pilhaEstacionamento.length());
        int vagasDisponiveis = pilhaEstacionamento.length();

        System.out.println("========== E S T A C I O N A M E N T O ==========");

        for(int vaga = 1; vaga <= pilhaEstacionamento.length(); vaga++) {
            if(pilhaEstacionamento.isEmpty()) {
                break;
            }

            System.out.println(vaga + "ª Vaga --> " + pilhaEstacionamento.peek());
            pilhaAuxiliar.push(pilhaEstacionamento.pop());
            vagasDisponiveis--;
        }

        System.out.println("=================================================");

        if(vagasDisponiveis > 1) {
            System.out.println(vagasDisponiveis + " vagas disponíveis.");
        }
        else {
            System.out.println(vagasDisponiveis + " vaga disponível.");
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilhaEstacionamento.push(pilhaAuxiliar.pop());
        }
    }

    public static String lerOpcao() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma opção -> ");
        String opcao = scan.nextLine().toUpperCase();

        while(!opcao.equals("E") && !opcao.equals("S") && !opcao.equals("Q")) {
            System.out.println("ERRO: Opção inválida! Tente novamente.");
            System.out.print("Digite uma opção -> ");
            opcao = scan.nextLine().toUpperCase();
        }

        return opcao;
    }

    public static void entrarEstacionamento(StaticStackString pilhaEstacionamento) {
        Scanner scan = new Scanner(System.in);

        if(pilhaEstacionamento.isFull()) {
            System.out.println("Estacionamento cheio! \nNão é possível entrar.");
            return;
        }

        System.out.print("Digite a placa do veículo -> ");
        pilhaEstacionamento.push(scan.nextLine().toUpperCase());
    }

    public static void sairEstacionamento(StaticStackString pilhaEstacionamento) {
        Scanner scan = new Scanner(System.in);
        StaticStackString pilhaAuxiliar = new StaticStackString(pilhaEstacionamento.length());
        int manobras = 0;

        if(pilhaEstacionamento.isEmpty()) {
            System.out.println("Estacionamento vazio! \nNão há veículos para sair.");
            return;
        }

        System.out.print("Digite a placa do veículo que vai sair -> ");
        String placa = scan.nextLine().toUpperCase();

        while(!pilhaEstacionamento.isEmpty()) {

            if(pilhaEstacionamento.peek().equals(placa)) {
                pilhaEstacionamento.pop();

                while(!pilhaAuxiliar.isEmpty()) {
                    pilhaEstacionamento.push(pilhaAuxiliar.pop());
                }
                System.out.println(manobras + " carros foram manobrados para o veículo poder sair.");
                return;
            }

            manobras++;
            pilhaAuxiliar.push(pilhaEstacionamento.pop());
        }

        System.out.println("ERRO: Não existe veículo com essa placa no estacionamento!");

        while(!pilhaAuxiliar.isEmpty()) {
            pilhaEstacionamento.push(pilhaAuxiliar.pop());
        }
    }
}
