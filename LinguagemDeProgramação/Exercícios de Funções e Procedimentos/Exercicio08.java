package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio08 {
    /*
    * 8 - Faça uma função que leia um número não determinado de valores positivos e
    * retorna a média aritmética dos mesmos.
    */

    public static void main(String[] args) {
        double media = calcularMedia();
        System.out.println("A média dos números digitados é " + media);
    }

    static double calcularMedia() {
        Scanner scan = new Scanner(System.in);
        double numero = 0, soma = 0, qtdNumeros = 0;
        System.out.print("Digite um número (negativo para encerrar): ");
        numero = scan.nextDouble();
        while (numero >= 0) {
            soma += numero;
            qtdNumeros += 1;
            System.out.print("Digite um número (negativo para encerrar): ");
            numero = scan.nextDouble();
        }
        return soma / qtdNumeros;
    }
}
