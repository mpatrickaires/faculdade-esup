package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio12 {
    /*
    * 12 - Criar uma função que calcule e retorne o valor do fatorial de um número natural. A função deve retornar
    * -1 caso não seja possível calcular o valor do fatorial. Escreva também um algoritmo para testar tal função.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para calcular seu fatorial: ");
        int numero = scan.nextInt();
        System.out.println("O fatorial de " + numero + " é igual a " + calcularFatorial(numero));
    }

    static int calcularFatorial (int numero) {
        if (numero < 1) {
            return -1;
        }
        int fatorial = 1;
        for (int contador = numero; contador >= 1; contador--) {
            fatorial *= contador;
        }
        return fatorial;
    }
}
