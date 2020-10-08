package listadeexercicios01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main (String[] args) {
        /*
         * 05 - A padaria PÃO vende uma certa quantidade de pães franceses e
         * uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,33 e a broa custa R$ 0,87.
         * Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos),
         * e quanto deve guardar numa conta de poupança (10% do total arrecadado).
         * Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
         * faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de pães vendidos: ");
        int quantidadePaes = scan.nextInt();

        System.out.print("Quantidade de broas vendidas: ");
        int quantidadeBroas = scan.nextInt();

        double totalArrecadado = (quantidadePaes * 0.33) + (quantidadeBroas * 0.87);
        double poupanca = totalArrecadado * 0.10;

        System.out.printf("Total arrecadado com as vendas de pães e broas: R$%.2f \n", totalArrecadado);
        System.out.printf("Total a ser guardado na poupança: R$%.2f", poupanca);
    }
}
