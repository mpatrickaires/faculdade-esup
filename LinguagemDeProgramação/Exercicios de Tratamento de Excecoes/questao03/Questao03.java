package exerciciostratamentoexcecoes.questao03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao03 {
    /*
    * 03 - Crie uma classe que aceite a digitação de dois números e faça a divisão entre eles
    * exibindo seu resultado. Sua classe deve tratar as seguintes exceções:
    *     ● ArithmeticException quando ocorrer uma divisão por zero
    *     ● InputMismatchException quando o valor informado não é numerico
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("===== DIVISÃO =====");
            System.out.print("Digite o primeiro valor: ");
            double valor1 = scan.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double valor2 = scan.nextDouble();
            if(valor2 == 0) {
                throw new ArithmeticException();
            }
            double divisao = valor1 / valor2;
            System.out.println("O resultado da divisão é: " + divisao);

        } catch(ArithmeticException arithmeticException) {
            System.out.println("ERRO: Não é possível realizar divisão por zero!");

        } catch(InputMismatchException inputMismatchException) {
            System.out.println("ERRO: O valor digitado deve ser um número!");
        }
    }
}
