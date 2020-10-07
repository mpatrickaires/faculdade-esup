package stack;

import java.util.Scanner;

public class Exercicio10 {
    /*
    * 10 - Dado uma pilha lida pelo usuário de 10 elementos, informar a quantidade de valores
    * ímpares e a quantidade valores pares. Ao final a pilha deve estar na mesma configuração
    * original. Usar apenas as operações de pilha.
    */

    public static void main(String[] args) {
        StaticStack pilha = new StaticStack(10);
        lerPilha(pilha);

        System.out.println("========================================");
        pilhaParesImpares(pilha);
    }

    public static void lerPilha(StaticStack pilha) {
        Scanner scan = new Scanner(System.in);

        for(int contador = 1; contador <= pilha.length(); contador++) {
            System.out.print("Digite o " + contador + "º valor para a pilha -> ");
            int valor = scan.nextInt();
            pilha.push(valor);
        }
    }

    public static void pilhaParesImpares(StaticStack pilha) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        int quantidadePares = 0, quantidadeImpares = 0;

        while(!pilha.isEmpty()) {
            pilhaAuxiliar.push(pilha.pop());

            if(pilhaAuxiliar.peek() % 2 == 0) {
                quantidadePares++;
            }
            else {
                quantidadeImpares++;
            }

        }

        System.out.println("Total de elementos pares na pilha -> " + quantidadePares);
        System.out.println("Total de elementos ímpares na pilha -> " + quantidadeImpares);

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}
