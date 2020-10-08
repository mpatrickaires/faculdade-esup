package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio03 {
    /*
     * 3 - Escreva um procedimento que recebes 3 valores reais X, Y e Z e que verifique se esses valores podem
     * ser os comprimentos dos lados de um triângulo e, neste caso, retornar qual o tipo de triângulo formado.
     * Para que X, Y e Z formem um triângulo é necessário que a seguinte propriedade seja satisfeita:
     * o comprimento de cada lado de um triângulo é menor do que a soma do comprimento dos outros dois lados.
     * O procedimento deve identificar o tipo de triângulo formado observando as seguintes definições:
     * ●	Triângulo Equilátero: os comprimentos dos 3 lados são iguais.
     * ●	Triângulo Isósceles: os comprimentos de 2 lados são iguais.
     * ●	Triângulo Escaleno: os comprimentos dos 3 lados são diferentes.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º lado: ");
        double lado1 = scan.nextDouble();
        System.out.print("Digite o 2º lado: ");
        double lado2 = scan.nextDouble();
        System.out.print("Digite o 3º lado: ");
        double lado3 = scan.nextDouble();
        classificarTriangulo(lado1, lado2, lado3);
    }

    static void classificarTriangulo (double lado1, double lado2, double lado3) {
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("Não é possível formar um triângulo!");
        }
        else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Forma um Triângulo Equilátero!");
        }
        else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("Forma um Triângulo Isósceles!");
        }
        else {
            System.out.println("Forma um Triângulo Escaleno!");
        }
    }
}
