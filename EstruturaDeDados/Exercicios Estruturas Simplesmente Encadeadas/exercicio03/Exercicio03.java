package exercicio03;

import exercicio03.exception.PopException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    /*
    * 03 - Desenvolva uma função para testar se duas pilhas sem tamanho definidos P1 e P2 são
    * iguais. Duas pilhas são ditas iguais, se possui todos os elementos na mesma posição.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("===============| P I L H A  1 |===============");
        DinamicStack pilha1 = new DinamicStack();
        preencherPilha(pilha1);

        System.out.println("\n\n===============| P I L H A  2 |===============");
        DinamicStack pilha2 = new DinamicStack();
        preencherPilha(pilha2);

        System.out.println("\n\n----------------------------------------------");

        if(compararPilhas(pilha1, pilha2)) {
            System.out.println("A Pilha 1 e a Pilha 2 são IGUAIS.");
        }
        else {
            System.out.println("A Pilha 1 e a Pilha 2 são DIFERENTES.");
        }
    }

    public static boolean compararPilhas(DinamicStack pilha1, DinamicStack pilha2) {
        if(pilha1.getSize() != pilha2.getSize()) {
            return false;
        }

        try {

            while(!pilha1.isEmpty()) {
                if(pilha1.pop() != pilha2.pop()) {
                    return false;
                }
            }

        } catch(PopException popException) {
            System.out.println(popException.getMessage());
        }

        return true;
    }

    public static void preencherPilha(DinamicStack pilha) {
        Scanner scan = new Scanner(System.in);

        while(true) {

            try {

                System.out.print("Digite o " + (pilha.getSize() + 1) + "º valor para a pilha (-999 para encerrar): ");
                int valor = scan.nextInt();

                if (valor == -999) {
                    return;
                }

                pilha.push(valor);

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor inválido! Tente novamente.");
                scan.next();
            }
        }
    }
}
