package listadeexercicios01;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        /*
        * 21 - Ler um número do teclado e imprimir todos os números de 1 até o número lido.
        * Imprimir o produto dos números.
        */

        Scanner scan = new Scanner(System.in);
        int produto = 1;

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        for (int contador = 1; contador <= numero; contador++) {
            System.out.print(contador);
            produto *= contador;
            if (contador != numero) {
                System.out.print(" x ");
            }
            else {
                System.out.print(" = ");
            }
        }
        System.out.println(produto);
    }
}
