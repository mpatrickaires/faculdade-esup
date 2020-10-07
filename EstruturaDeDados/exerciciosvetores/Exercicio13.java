package exerciciosdevetores;

public class Exercicio13 {
    /*
    * 13 - Crie uma função que receba dois vetores A e B como parâmetros e no final você deve retornar o vetor C
    * resultado da diferença entre A e B (operação de conjunto)
    */

    public static void main(String[] args) {
        int vetorA[] = {1, 2, 3, 4, 7, 8};
        int vetorB[] = {1, 2, 3, 5, 9, 10};
        int vetorC[] = fazerDiferencaVetores(vetorA, vetorB);

        System.out.print("Diferença do primeiro vetor pelo segundo vetor -> ");
        for (int elementoVetorC : vetorC) {
            System.out.print("[" + elementoVetorC + "]");
        }
    }

    public static int[] fazerDiferencaVetores(int vetorA[], int vetorB[]) {
        int vetorC[] = new int[calcularTamanho(vetorA, vetorB)];
        boolean repete;
        int posicao = 0;

        for(int elementoVetorA: vetorA) {
            repete = false;
            for(int elementoVetorB: vetorB) {
                if(elementoVetorA == elementoVetorB) {
                    repete = true;
                    break;
                }
            }
            if(!repete) {
                vetorC[posicao] = elementoVetorA;
                posicao++;
            }
        }
        return vetorC;
    }

    public static int calcularTamanho(int vetorA[], int vetorB[]) {
        int tamanho = 0;
        boolean repete;

        for(int elementoVetorA: vetorA) {
            repete = false;
            for(int elementoVetorB: vetorB) {
                if(elementoVetorA == elementoVetorB) {
                    repete = true;
                }
            }
            if(!repete) {
                tamanho++;
            }
        }
        return tamanho;
    }
}
