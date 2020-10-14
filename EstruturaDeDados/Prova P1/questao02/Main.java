package questao02;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[150];

        preencherVetorRandomico(vetor);

        System.out.print("Digite um número para procurar no vetor: ");
        int numero = scan.nextInt();

        System.out.println("------------------------------------------");
        System.out.println("O número " + numero + " existe no vetor? " + verificarNumeroVetor(vetor, numero));
        System.out.println("Maior elemento do vetor: " + maiorElementoVetor(vetor));
        System.out.println("Menor elemento do vetor: " + menorElementoVetor(vetor));
        System.out.println("Média dos elementos do vetor: " + mediaVetor(vetor));
    }

    public static void preencherVetorRandomico(int vetor[]) {
        Random gerador = new Random();

        for(int posicao = 0; posicao < vetor.length; posicao++) {
            vetor[posicao] = gerador.nextInt(251);
        }
    }

    public static boolean verificarNumeroVetor(int vetor[], int numero) {
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            if(vetor[posicao] == numero) {
                return true;
            }
        }

        return false;
    }

    public static int maiorElementoVetor(int vetor[]) {
        int maior = 0;
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            if(vetor[posicao] > maior || posicao == 0) {
                maior = vetor[posicao];
            }
        }

        return maior;
    }

    public static int menorElementoVetor(int vetor[]) {
        int menor = 0;
        for(int posicao = 0; posicao < vetor.length; posicao++) {
            if(vetor[posicao] < menor || posicao == 0) {
                menor = vetor[posicao];
            }
        }

        return menor;
    }

    public static double mediaVetor(int vetor[]) {
        double soma = 0;

        for(int posicao = 0; posicao < vetor.length; posicao++) {
            soma += vetor[posicao];
        }

        return soma / vetor.length;
    }
}
