package exerciciosdevetores;

public class Exercicio11 {
    /*
    * 11 - Crie uma função que receba dois vetores A e B como parâmetros e no final você deve retornar o vetor C
    * resultado da união entre A e B (operação de conjunto)
    */

    public static void main(String[] args) {
        int vetorA[] = {1, 2, 3, 4, 7, 8};
        int vetorB[] = {1, 2, 3, 5, 9, 10};
        int vetorC[] = fazerUniaoVetores(vetorA, vetorB);

        System.out.print("União do primeiro vetor com o segundo vetor -> ");
        for (int elementoVetorC : vetorC) {
            System.out.print("[" + elementoVetorC + "]");
        }
    }

    public static int[] fazerUniaoVetores(int vetorA[], int vetorB[]) {
        boolean repete = false;
        int vetorC[] = new int[calcularTamanho(vetorA, vetorB)];
        popularComPrimeiroVetor(vetorA, vetorC);
        int posicaoAnterior = coletarPosicaoAnterior(vetorA, vetorC);


        for (int elementoVetorB : vetorB) {
            repete = false;
            for (int posicao = 0; posicao < posicaoAnterior; posicao++) {
                if (elementoVetorB == vetorC[posicao]) {
                    repete = true;
                }
            }
            if (!repete) {
                vetorC[posicaoAnterior] = elementoVetorB;
                posicaoAnterior++;
            }
        }
        return vetorC;
    }

    public static int calcularTamanho(int vetorA[], int vetorB[]) {
        int repeticao = 0;
        for (int posicao = 0; posicao < vetorA.length; posicao++) {
            for (int elementoVetorB : vetorB) {
                if (vetorA[posicao] == elementoVetorB) {
                    repeticao++;
                }
            }
        }
        return vetorA.length + vetorB.length - repeticao;
    }

    public static void popularComPrimeiroVetor(int vetorA[], int vetorC[]) {
        for (int posicao = 0; posicao < vetorA.length; posicao++) {
            vetorC[posicao] = vetorA[posicao];
        }
    }

    public static int coletarPosicaoAnterior(int vetorA[], int vetorC[]) {
        int posicaoAnterior = 0;
        for (int posicao = 0; posicao < vetorA.length; posicao++) {
            if (vetorC[posicao] == vetorA[posicao]) {
                posicaoAnterior++;
            }
        }
        return posicaoAnterior;
    }
}
