package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio10 {
    /* 10 - Escreva um procedimento que receba um número inteiro e imprima o mês correspondente ao número.
     * Por exemplo, 2 corresponde à “fevereiro”. O procedimento deve mostrar uma mensagem de erro caso o número
     * recebido não faça sentido.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para ver qual é o seu mês correspondente: ");
        int numero = scan.nextInt();
        System.out.print("Mês correspondente ao número " + numero + " -> ");
        mostrarMes(numero);
    }

    static void mostrarMes (int numero) {
        String meses[] = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro"};

        if (numero < 1 || numero > 12) {
            System.out.println("ERRO: Não existe mês com esse número!");
        }
        else {
            for (int posicao = 1; posicao <= 12; posicao++) {
                if (posicao == numero) {
                    System.out.println(meses[posicao]);
                }
            }
        }
    }
}
