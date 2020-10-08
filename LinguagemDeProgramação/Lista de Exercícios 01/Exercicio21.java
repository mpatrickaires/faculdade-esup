package listadeexercicios01;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        /*
        * 21 - Fazer um programa que leia o nome e o salário de um funcionário e que calcule e escreva o
        * imposto de renda devido, de acordo com a tabela a seguir. (conferir tabela em anexo na lista)
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Salário: R$ ");
        double salario = scan.nextDouble();

        System.out.print("Percentual do Imposto de Renda: ");
        if (salario <= 1500) {
            System.out.println("Isento.");
        }
        else if (salario <= 2500) {
            System.out.println("15% do salário.");
        }
        else if (salario <= 4000) {
            System.out.println("27,5% do salário.");
        }
        else {
            System.out.println("35% do salário.");
        }
    }
}
