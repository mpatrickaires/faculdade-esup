package listadeexercicios01;

import java.util.Scanner;

public class Exercicio27 {

    public static void main (String[] args) {
        /*
        * 27 - Escreva um algoritmo que leia 35 valores inteiros e faça o que se pede:
        * ●	Encontre o maior valor
        * ●	Encontre o menor valor
        * ●	Calcule a média aritmética dos números lidos.
        * ●	Quantidade de números pares
        * ●	Quantidade de números ímpares
        */

        Scanner scan = new Scanner(System.in);
        int valor, maiorValor = 0, menorValor = 0, quantidadePares = 0, quantidadeImpares = 0;
        double soma = 0, media;

        for (int contador = 1; contador <= 35; contador++) {
            System.out.print("Digite o " + contador + "º valor: ");
            valor = scan.nextInt();

            if (valor > maiorValor || contador == 1) {
                maiorValor = valor;
            }
            if (valor < menorValor || contador == 1){
                menorValor = valor;
            }

            soma += valor;

            if (valor % 2 == 0) {
                quantidadePares++;
            }
            else {
                quantidadeImpares++;
            }
        }

        media = soma / 35;

        System.out.println("==================================");
        System.out.println("Maior Valor: " + maiorValor);
        System.out.println("Menor Valor: " + menorValor);
        System.out.println("Média Aritmética: " + media);
        System.out.println("Quantidade de Números Pares: " + quantidadePares);
        System.out.println("Quantidade de Números Ímpares: " + quantidadeImpares);
        System.out.println("===================================");
    }
}
