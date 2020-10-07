package exerciciosdevetores;

public class Exercicio12 {
    /*
    * 12 - Crie uma função que receba dois vetores A e B como parâmetros e no final você deve retornar o vetor C
    * resultado da intersecção entre A e B (operação de conjunto)
    */

    public static void main(String[] args) {
        int vetorA[] = {1, 2, 3, 4, 7, 8};
        int vetorB[] = {1, 2, 3, 5, 9, 10};
        int vetorC[] = fazerInterseccaoVetores(vetorA, vetorB);

        System.out.print("Intersecção do primeiro vetor com o segundo vetor -> ");
        for (int elementoVetorC : vetorC) {
            System.out.print("[" + elementoVetorC + "]");
        }
    }

    public static int[] fazerInterseccaoVetores(int vetorA[], int vetorB[]) {
        int vetorC[] = new int[calcularTamanho(vetorA, vetorB)];
        int posicao = 0;

        for(int elementoVetorA: vetorA) {
            for(int elementoVetorB: vetorB) {
                if(elementoVetorA == elementoVetorB) {
                    vetorC[posicao] = elementoVetorA;
                    posicao++;
                }
            }
        }
        return vetorC;
    }

    public static int calcularTamanho(int vetorA[], int vetorB[]) {
        int tamanho = 0;

        for(int elementoVetorA: vetorA) {
            for(int elementoVetorB: vetorB) {
                if(elementoVetorA == elementoVetorB) {
                    tamanho++;
                }
            }
        }
        return tamanho;
    }
}
