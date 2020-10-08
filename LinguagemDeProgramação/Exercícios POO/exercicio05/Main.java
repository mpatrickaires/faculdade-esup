package exercicio05;

public class Main {
    /*
    * 05 - Escreva uma classe Conjunto, que represente um conjunto de tamanho fixo de
    * elementos do tipo int, o vetor e o tamanho devem ser atributos. Escreva os seguintes
    * membros para a classe:
    *
    *     a. Um método que permita adicionar um elemento para o conjunto (o elemento
    *     não pode existir no conjunto);
    *
    *     b. Um método que permita verificar se um dado elemento pertence ao Conjunto;
    *
    *     c. Um método que a partir de um elemento, retorna a posição no vetor.
    *
    *     d. Um método uniao, que recebe como parâmetro um segundo vetor que age de
    *     acordo com a semântica da operação união entre conjuntos (um novo
    *     conjunto, sem elementos repetidos, com a combinação dos elementos dos
    *     dois conjuntos originais), o método retorna o resultado da união, o vetor
    *     atributo não pode ser modificado;
    *
    *     e. Um método inter, que recebe como parâmetro um vetor de inteiros, que
    *     retorne um novo conjunto de acordo com a semântica da operação interseção
    *     entre conjuntos (um novo conjunto, sem elementos repetidos, com os
    *     elementos que estejam nos dois conjuntos originais ,o que recebeu a
    *     mensagem e o que foi passado como parâmetro);
    *
    *     f. Um método menos, que recebe como parâmetro um vetor de inteiro que
    *     retorne um novo conjunto de acordo com a semântica da operação subtração
    *     entre conjuntos (um novo conjunto, sem elementos repetidos, com os
    *     elementos do conjunto que recebeu a mensagem, e que não existam no
    *     conjunto passado como parâmetro)
    */

    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto(5);
        Conjunto conjunto2 = new Conjunto(5);
        try {
            conjunto1.adicionarElemento(1);
            conjunto1.adicionarElemento(3);
            conjunto1.adicionarElemento(5);
            conjunto1.adicionarElemento(7);
            conjunto1.adicionarElemento(9);

            conjunto2.adicionarElemento(1);
            conjunto2.adicionarElemento(2);
            conjunto2.adicionarElemento(3);
            conjunto2.adicionarElemento(4);
            conjunto2.adicionarElemento(5);
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("===== CONJUNTO 1 =====");
        printarConjunto(conjunto1);
        System.out.println("----------------------");
        System.out.println("O elemento 7 pertence a esse conjunto? " + conjunto1.verificarElemento(7));
        System.out.println("----------------------");
        try {
            System.out.println("Qual a posição do elemento 7 nesse conjunto? " + conjunto1.verificarPosicaoElemento(7));
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("----------------------");

        System.out.println("\n===== CONJUNTO 2 =====");
        printarConjunto(conjunto2);
        System.out.println("----------------------");
        System.out.println("O elemento 7 pertence a esse conjunto? " + conjunto2.verificarElemento(7));
        System.out.println("----------------------");
        try {
            System.out.println("Qual a posição do elemento 7 nesse conjunto? " + conjunto2.verificarPosicaoElemento(7));
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("----------------------");

        System.out.println("\n===== CONJUNTO UNIÃO =====");
        Conjunto conjuntoUniao = conjunto1.uniao(conjunto2);
        printarConjunto(conjuntoUniao);

        System.out.println("\n===== CONJUNTO INTERSECÇÃO =====");
        Conjunto conjuntoInter = conjunto1.inter(conjunto2);
        printarConjunto(conjuntoInter);

        System.out.println("\n===== CONJUNTO SUBTRAÇÃO =====");
        Conjunto conjuntoMenos = conjunto1.menos(conjunto2);
        printarConjunto(conjuntoMenos);
    }

    public static void printarConjunto(Conjunto conjunto) {
        for(int elementoConjunto : conjunto.getConjunto()) {
            System.out.print("[" + elementoConjunto + "] ");
        }
        System.out.println();
    }
}
