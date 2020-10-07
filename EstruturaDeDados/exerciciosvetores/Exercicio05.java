package exerciciosdevetores;

public class Exercicio05 {
    /*
    * 5 - Escreva programa que possua um vetor denominado A que armazene 6 números inteiros.
    * O programa deve executar os seguintes passos
    * ●	Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
    * ●	Armazene em uma variável inteira a soma entre os valores das posições A[0], A[1] e A[5] do vetor e
    * mostre na tela esta soma.
    * ●	Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
    * ●	Mostre na tela cada valor do vetorA, um em cada linha.
    */

    public static void main(String[] args) {
        int vetorA[] = {1, 0, 5, -2, -5, 7};

        int soma = vetorA[0] + vetorA[1] + vetorA[5];
        System.out.println("Soma dos valores nas posições a[0], a[1] e a[5] -> " + soma);

        vetorA[4] = 100;
        System.out.println("===================");
        for(int posicao = 0; posicao < vetorA.length; posicao++) {
            System.out.println("vetorA[" + posicao + "] -> " + vetorA[posicao]);
        }
        System.out.println("===================");
    }
}
