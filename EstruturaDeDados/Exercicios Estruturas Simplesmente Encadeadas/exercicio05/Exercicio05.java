package exercicio05;

import exercicio05.exception.PopException;

import java.util.Scanner;

public class Exercicio05 {
    /*
    * 05 - Criar um código que teste se uma fórmula é bem formada usando estrutura de pilha sem
    * tamanho definido (dinâmica). Uma fórmula bem formada testa se para cada parêntese
    * aberto, existe um parêntese fechado.
    *   ● Entrada: vai ser uma string inserida pelo usuário (uma fórmula)
    *   ● Saída: veradeiro ou falso
    *   ● Exemplos:
    *       ○ String entrada: "((9+5) + 8)" Saída: True
    *       ○ String entrada: "(10*4)+((9+5)" Saída: false
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma fórmula -> ");
        String formula = scan.nextLine();

        System.out.println("--------------------");
        if(validarFormula(formula)) {
            System.out.println("Fórmula válida!");
        }
        else {
            System.out.println("Fórmula inválida!");
        }
        System.out.println("--------------------");
    }

    public static boolean validarFormula(String formula) {
        DinamicStack pilhaFormula = new DinamicStack();

        try {

            for (int posicao = 0; posicao < formula.length(); posicao++) {
                String elemento = String.valueOf(formula.charAt(posicao));

                if (elemento.equals("(")) {
                    pilhaFormula.push(elemento);
                } else if (elemento.equals(")")) {
                    if (pilhaFormula.isEmpty()) {
                        return false;
                    }

                    pilhaFormula.pop();
                }
            }

        } catch(PopException popException) {
            System.out.println(popException.getMessage());
        }

        return pilhaFormula.isEmpty();
    }
}
