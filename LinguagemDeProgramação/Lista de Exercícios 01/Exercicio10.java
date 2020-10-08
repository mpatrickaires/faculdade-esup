package listadeexercicios01;

public class Exercicio10 {

    public static void main(String[] args) {
        /*
         * 10 - Marcelo recebeu seu salário de R$ 1.500,00 e precisa pagar duas contas
         * (C1= R$ 189,00 e C2= R$ 131,00) que estão atrasadas. Como as contas estão atrasadas,
         * Marcelo terá de pagar multa de 2% sobre cada conta. Faça um algoritmo que
         * calcule e mostre quanto restará do salário do João
         */

        double salario = 1500;
        double totalContas = (189 * 1.02) + (131 * 1.02);
        double salarioRestante = salario - totalContas;

        System.out.println("Salário: R$" + salario);
        System.out.println("Contas: R$" + totalContas);
        System.out.println("Salário Restante: R$" + salarioRestante);
    }
}
