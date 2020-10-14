package questao01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String agenda[][] = new String[10][5];

        preencherAgenda(agenda);

        System.out.print("Digite um nome para procurar na agenda: ");
        String nome = scan.nextLine();
        System.out.println("--------------------------------------------");
        procurarNaAgenda(agenda, nome);
    }

    public static void preencherAgenda(String agenda[][]) {
        Scanner scan = new Scanner(System.in);

        for(int linha = 0; linha < agenda.length; linha++) {
            System.out.println("===== PESSOA Nº " + (linha + 1) + " =====");

            System.out.print("Nome: ");
            agenda[linha][0] = scan.nextLine();

            System.out.print("Endereço: ");
            agenda[linha][1] = scan.nextLine();

            System.out.print("CEP: ");
            agenda[linha][2] = scan.nextLine();

            System.out.print("Bairro: ");
            agenda[linha][3] = scan.nextLine();

            System.out.print("Telefone: ");
            agenda[linha][4] = scan.nextLine();

            limparTela();
        }
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }

    public static void procurarNaAgenda(String agenda[][], String nome) {
        for(int linha = 0; linha < agenda.length; linha++) {
            if(agenda[linha][0].equals(nome)) {
                System.out.println("Nome: " + agenda[linha][0]);
                System.out.println("Endereço: " + agenda[linha][1]);
                System.out.println("CEP: " + agenda[linha][2]);
                System.out.println("Bairro: " + agenda[linha][3]);
                System.out.println("Telefone: " + agenda[linha][4]);
                return;
            }
        }

        System.out.println("Pessoa não encontrada!");
    }
}
