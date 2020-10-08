package listadeexercicios01;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        /*
        * 20 - Escreva um programa que receba dois números inteiros e que disponibilize as opções abaixo e
        * imprima o resultado da operação (o usuário deverá escrever o número da opção, por exemplo 1
        * se quiser somar os números e assim por diante):
        * 1.	retornar o soma de dois números;
        * 2.	retornar a subtração de dois números;
        * 3.	retornar a multiplicação de dois números;
        * 4.	retornar o quociente inteiro de uma divisão;
        * 5.    retornar mensagem de erro (opção inválida).
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o 2º número: ");
        int numero2 = scan.nextInt();

        System.out.println("====================");
        System.out.println("[1] SOMA \n[2] SUBTRAÇÃO \n[3] MULTIPLICAÇÃO \n[4] DIVISÃO INTEIRA");
        System.out.println("====================");
        System.out.print("Digite uma opção: ");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        }
        else if (opcao == 2) {
            System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        }
        else if (opcao == 3) {
            System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        }
        else if (opcao == 4) {
            if (numero2 == 0) {
                System.out.println("ERRO: NÃO É POSSÍVEL DIVIDIR POR ZERO!");
            } else {
                System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
            }
        }
        else {
            System.out.println("ERRO: OPÇÃO INVÁLIDA!");
        }
        }
    }