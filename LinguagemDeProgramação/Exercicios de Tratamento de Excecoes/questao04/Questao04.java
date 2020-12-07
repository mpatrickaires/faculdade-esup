package exerciciostratamentoexcecoes.questao04;

import java.util.Scanner;

public class Questao04 {
    /*
    * 04 - Crie um programa que leia um número do usuário, e chame uma função que valide se é
    * maior ou menor que 10. Se for menor do que 10, chamar uma exceção disparando uma exceção
    * que número inválido.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Digite um número maior do que 10 -> ");
            double numero = scan.nextDouble();
            validarNumero(numero);
            System.out.println("Parabéns! Você digitou um número maior do que 10 :)");
        } catch(Exception exception) {
            System.out.println("Número inválido! Você não digitou um número maior do que 10 :(");
        }
    }

    public static void validarNumero(double numero) throws Exception {
        if(numero < 10) throw new Exception();
    }
}
