package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio09 {
    /*
    * 9 - Escreva uma função que efetue a potência, o primeiro parâmetro é a base, o segundo é o expoente.
    * Sua função deve retornar um inteiro resultado da potência.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scan.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scan.nextInt();
        System.out.println("O resultado da potência é igual a " + calcularPotencia(base, expoente));
    }

    static int calcularPotencia (int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }
}
