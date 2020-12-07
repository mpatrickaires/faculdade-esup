package exerciciostratamentoexcecoes.questao02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {
    /*
    * 02 - Nesta questão você deve identificar as partes problemáticas do código e reescrevê-lo
    * utilizando tratamento de exceções. Ou seja, devem ser identificadas todas as exceções que
    * podem ser levantadas e, para cada uma, deve ser dado o tratamento adequado que, nesse
    * exercício, significa alertar o usuário quanto ao problema. Entretanto, nesse programa a
    * leitura dos valores deve ser feita, mesmo que para isso o usuário tenha que tentar informar
    * várias vezes os valores na mesma execução do programa.
    *
    * ----- VERIFICAR CÓDIGO EM ANEXO NO ARQUIVO PDF DA LISTA -----
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Eu sei dividir!");
                System.out.print("Informe o primeiro valor: ");
                int x = teclado.nextInt();
                System.out.print("Informe o segundo valor: ");
                int y = teclado.nextInt();
                if(y == 0) {
                    throw new ArithmeticException();
                }
                double r = (double) x / y;
                System.out.println("O resultado da divisão é: " + r);
                break;
            } catch(ArithmeticException arithmeticException) {
                System.out.println("Impossível realizar divisão por zero! Tente novamente.");
                System.out.println("------------------------------------------------------------");
            } catch(InputMismatchException inputMismatchException) {
                System.out.println("O valor digitado deve ser um número inteiro! Tente novamente.");
                System.out.println("------------------------------------------------------------");
                teclado.next();
            }
        }
    }
}
