package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio15 {
    /*
    * 15 - Escreva um algoritmo para ler 10 números DIFERENTES (seu programa tem de garantir que nao existem
    * números iguais no array) a serem armazenados em um vetor. Os dados deverão ser armazenados no vetor na
    * ordem que serão lidos, sendo que caso o usuário digite um número que já foi digitado anteriormente,
    * o programa deverá pedir para ele digitar outro número. Note que cada valor digitado pelo usuário deve ser
    * pesquisado no vetor, verificando se ele existe entre os números que já foram fornecidos.
    * Exibir na tela o vetor final que foi digitado.
    */

    public static void main(String[] args) {
        int vetor[] = new int[10];
        popularVetor(vetor);
        printarVetor(vetor);
    }

    public static void popularVetor(int vetor[]) {
        Scanner scan = new Scanner(System.in);
        int elemento, qtdZero = 0;

        for(int posicao = 0; posicao < vetor.length; posicao++) {
            while(true) {
                System.out.print("Digite o elemento da posição [" + posicao + "] -> ");
                elemento = scan.nextInt();

                if(elemento == 0 && qtdZero == 0) {
                    qtdZero++;
                    break;
                }

                if(validarElemento(elemento, vetor)) {
                    break;
                }
                System.out.println("ERRO: Esse elemento já existe dentro do vetor! Tente novamente.");
            }
            vetor[posicao] = elemento;
        }
    }

    public static boolean validarElemento(int elemento, int vetor[]) {
        for(int elementoVetor: vetor) {
            if (elementoVetor == elemento) {
                return false;
            }
        }
        return true;
    }

    public static void printarVetor(int vetor[]) {
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("[" + posicao + "] -> " + vetor[posicao]);
        }
    }
}
