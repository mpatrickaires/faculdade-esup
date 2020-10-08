package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        /*
        * 4 - Crie uma função que receba um número n por parâmetro e a função deve retornar a soma de 0 até n.
        * Da segiunte fórmula: 0+ 1 + 2 + 3 + (..) + n
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("A soma dos números de 0 até " + numero + " é igual a " + somarAteNumero(numero));
    }

    static int somarAteNumero (int numero) {
        int soma = 0;
        for (int contador = 0; contador <= numero; contador++) {
            soma += contador;
        }
        return soma;
    }
}
