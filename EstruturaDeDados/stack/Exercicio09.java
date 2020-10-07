package stack;

import java.util.Scanner;

public class Exercicio09 {
    /*
    * 09 - Desenvolva uma função para testar se duas pilhas estáticas P1 e P2 são iguais. Duas pilhas são ditas
    * iguais, se possui todos os elementos na mesma posição.
    */

    public static void main(String[] args) {
        System.out.println("===== PILHA 1 =====");
        StaticStack pilha1 = popularPilha();

        System.out.println("\n===== PILHA 2 =====");
        StaticStack pilha2 = popularPilha();

        System.out.println("========================================");
        if(compararPilhas(pilha1, pilha2)) {
            System.out.println("Pilha 1 é IGUAL a Pilha 2");
        }
        else {
            System.out.println("Pilha 1 NÃO É IGUAL a Pilha 2");
        }
        System.out.println("========================================");
    }

    public static StaticStack popularPilha() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um tamanho para a pilha: ");
        StaticStack pilha = new StaticStack(scan.nextInt());
        System.out.println("----------------------------------------");

        for(int contador = 0; contador < pilha.length(); contador++) {
            System.out.print("Digite o " + (contador + 1) + "º elemento da pilha -> ");
            pilha.push(scan.nextInt());
        }

        return pilha;
    }

    public static boolean compararPilhas(StaticStack pilha1, StaticStack pilha2) {
        if(pilha1.length() != pilha2.length()) {
            return false;
        }

        while(!pilha1.isEmpty() && !pilha2.isEmpty()) {
            if(pilha1.pop() != pilha2.pop()) {
                return false;
            }
        }

        return true;
    }
}
