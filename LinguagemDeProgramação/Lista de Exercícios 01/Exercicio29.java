package listadeexercicios01;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        // 29 - Faça um programa que mostre n elementos da Sequência de Fibonacci de acordo com o pedido do usuário

        Scanner scan = new Scanner(System.in);
        int fibonacci = 1, numeroAnterior = 0;

        System.out.println("===============================");
        System.out.println("    SEQUÊNCIA DE FIBONACCI");
        System.out.println("===============================");
        System.out.print("Quantos termos da sequência você quer mostrar? ");

        int qtdTermos = scan.nextInt();
        for (int contador = qtdTermos; contador > 0; contador--) {
            System.out.print(fibonacci + " --> ");
            fibonacci += numeroAnterior;
            numeroAnterior = fibonacci - numeroAnterior;
        }
        System.out.println("FIM DA CONTAGEM!");
    }
}
