package stack;

import java.util.Scanner;

public class Exercicio12 {
    /*
    * 12 - Criar um código que teste se uma fórmula é bem formada usando estrutura de pilha
    * estática. Uma fórmula bem formada testa se para cada parêntese aberto, existe um
    * parêntese fechado.
    *     ● Entrada: vai ser uma string inserida pelo usuário (uma fórmula)
    *     ● Saída: veradeiro ou falso
    *     ● Exemplos:
    *         ○ String entrada: "((9+5) + 8)" Saída: True
    *         ○ String entrada: "(10*4)+((9+5)" Saída: false
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
        StaticStack pilhaFormula = new StaticStack(formula.length());
        for(int posicao = 0; posicao < formula.length(); posicao++) {
            char elemento = formula.charAt(posicao);

            if(elemento == '(') {
                pilhaFormula.push(elemento);
            }

            else if(elemento == ')') {
                if(pilhaFormula.isEmpty()) {
                    return false;
                }
                pilhaFormula.pop();
            }
        }

        return pilhaFormula.isEmpty();
    }
}
