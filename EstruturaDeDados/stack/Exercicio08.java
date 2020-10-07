package stack;

import java.util.Scanner;

public class Exercicio08 {
    /*
    * 08 - Dado uma pilha estática que armazene números, escreva uma função que forneça o
    * maior, o menor e a média aritmética dos elementos da pilha. Faça uso apenas das funções
    * da pilha. Após printar as informações pedidas, a pilha deve se encontrar na configuração
    * original (os elementos na mesma ordem e posição).
    */

    public static void main(String[] args) {
        StaticStack pilha = popularPilha();

        int maiorElementoPilha = pilhaMaiorElemento(pilha);
        int menorElementoPilha = pilhaMenorElemento(pilha);
        double mediaElementosPilha = pilhaMediaElementos(pilha);

        System.out.println("=============================================");
        System.out.println("Maior elemento da pilha -> " + maiorElementoPilha);
        System.out.println("Menor elemento da pilha -> " + menorElementoPilha);
        System.out.println("Média dos elementos da pilha -> " + mediaElementosPilha);
        System.out.println("=============================================");
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

    public static int pilhaMaiorElemento(StaticStack pilha) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        int maiorElemento = 0;

        for(int contador = 0; contador < pilha.length(); contador++) {
            pilhaAuxiliar.push(pilha.pop());

            if(pilhaAuxiliar.peek() > maiorElemento || contador == 0) {
                maiorElemento = pilhaAuxiliar.peek();
            }
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }

        return maiorElemento;
    }

    public static int pilhaMenorElemento(StaticStack pilha) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        int menorElemento = 0;

        for(int contador = 0; contador < pilha.length(); contador++) {
            pilhaAuxiliar.push(pilha.pop());

            if(pilhaAuxiliar.peek() < menorElemento || contador == 0) {
                menorElemento = pilhaAuxiliar.peek();
            }
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }

        return menorElemento;
    }

    public static double pilhaMediaElementos(StaticStack pilha) {
        StaticStack pilhaAuxiliar = new StaticStack(pilha.length());
        double soma = 0;

        for(int contador = 0; contador < pilha.length(); contador++) {
            pilhaAuxiliar.push(pilha.pop());
            soma += pilhaAuxiliar.peek();
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }

        return soma / pilha.length();
    }

}
