package stack;

import java.util.Scanner;

public class Exercicio05 {
    /*
    * 05 - Considere uma pilha estática que armazene caracteres. Desenvolva um algoritmo que
    * faça uso de uma função para determinar se uma string é da forma XY, onde X é uma cadeia
    * formada por caracteres arbitrários e Y o reverso de X. Por exemplo, se x = ABCD, então y =
    * DCBA. Considere que x e y são duas strings distintas. Faça uso da função getCharAt(int
    * indice), função da String que retorna um caracter a partir da posição do caracter na String.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a String x -> ");
        String x = scan.nextLine();
        System.out.print("Digite a String y -> ");
        String y = scan.nextLine();

        if(validarInversaoStrings(x, y)) {
            System.out.println("String y é o REVERSO de string x");
        }
        else {
            System.out.println("String y NÃO É O REVERSO de String x");
        }
    }

    public static boolean validarInversaoStrings(String palavra, String palavraInversa) {
        StaticStackChar pilhaPalavra = popularPilhaChar(palavra);
        if(palavra.length() != palavraInversa.length()) {
            return false;
        }

        for(int posicao = 0; posicao < palavraInversa.length(); posicao++) {
            if(palavraInversa.charAt(posicao) != pilhaPalavra.pop()) {
                return false;
            }
        }

        return true;
    }

    public static StaticStackChar popularPilhaChar(String palavra) {
        StaticStackChar pilha = new StaticStackChar(palavra.length());

        for(int letra = 0; letra < palavra.length(); letra++) {
            pilha.push(palavra.charAt(letra));
        }

        return pilha;
    }


}
