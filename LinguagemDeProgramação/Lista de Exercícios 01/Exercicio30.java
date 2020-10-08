package listadeexercicios01;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        /*
        * 30 - Faça um programa que calcule o fatorial de n! (fatorial de n), sendo que o valor inteiro de n
        * é fornecido pelo usuário.
        * Lembre-se:
        * 4! = 1 * 2 * 3 * 4 = 24
        * 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 
        * 1! = 1 (por definição)
        * 0! = 1 (por definição)
        * Não existe fatorial N < 1 (por definição)
        */

        Scanner scan = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("=============================");
        System.out.println("     CÁLCULO DE FATORIAL");
        System.out.println("=============================");
        System.out.print("Digite um número para ver seu fatorial: ");
        int numero = scan.nextInt();
        System.out.print(numero + "! = ");

        for (int contador = numero; contador > 0; contador--) {
            System.out.print(contador);
            fatorial *= contador;
            if (contador != 1) {
                System.out.print(" * ");
            }
            else {
                System.out.print(" = ");
            }
        }

        if (numero < 0) {
            System.out.println("ERRO: Não existe fatorial de número negativo!");
        }
        else {
            System.out.print(fatorial);
        }
    }
}
