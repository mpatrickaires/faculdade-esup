package exerciciostratamentoexcecoes.questao05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*
    * 05 - Crie um programa que receba n números e some esses numeros enquanto a soma não
    * for superior a 100. O programa deverá imprimir o valor somado (antes de atingir o número
    * maior que 100) e deverá informar quantos números foram somados e qual a média. Refaça
    * seu programa utilizando as seguintes regras:
    *
    *     ● Utilize os tratamentos de exceção para lidar com a entrada de dados.
    *     ● Quando a soma for superior a 100, o programa deverá gerar uma exceção criada
    *     pelo programador com nome ExcecaoAcimaDeCem.
    *     ● Lance essa exceção, com o uso de throws
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumerosSomados = 0;
        double soma = 0, media;

        System.out.println("=====| SOMA ATÉ O NÚMERO 100 |=====");

        while(true) {
            try {
                System.out.print("Digite um número: ");
                double numero = scan.nextDouble();
                if (soma + numero > 100) {
                    throw new ExcecaoAcimaDeCem();
                }
                soma += numero;
                quantidadeNumerosSomados++;
                System.out.println("Valor atual da soma: " + soma);
                System.out.println("----------------------------------");

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("O valor digitado deve ser um número! Tente novamente.");
                System.out.println("----------------------------------------------------------");
                scan.next();
            } catch (ExcecaoAcimaDeCem excecaoAcimaDeCem) {
                break;
            }
        }
        limpaTela();
        media = soma / quantidadeNumerosSomados;

        System.out.println("==========| FIM DA SOMA |==========");
        System.out.println("Soma total: " + soma);
        System.out.println("Quantidade de números somados: " + quantidadeNumerosSomados);
        System.out.println("Média da soma: " + media);
        System.out.println("===================================");
    }

    public static void limpaTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }
}
