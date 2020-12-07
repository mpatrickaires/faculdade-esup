package provap2.questao07;

import provap2.questao07.stack.DinamicStack;
import provap2.questao07.stack.exception.PopException;

import java.text.Normalizer;
import java.util.Scanner;

public class Questao07 {
    /*
    * 07 - Fazendo um uso de TAD de uma pilha simplesmente encadeada, solicite ao usuário uma sequência de
    * caracteres sem limite máximo de tamanho e realize as seguintes operações:
    *
    *   A. Imprimir o texto em ordem inversa a informada pelo usuário
    *   B. Verificar se o texto (caracteres) informado é palíndromo, ou seja, se a string é escrita da
    *   mesma maneira de frente para trás e de trás para frente. Ignore espaços e pontuações.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scan.nextLine().toLowerCase();

        // Substitui a palavras acentuadas por palavra sem acento (ex: olá -> ola)
        texto = removerAcentos(texto);

        // Remove todos os caracteres que não são palavras (ex: socorram-me -> socorramme)
        texto = texto.replaceAll("\\p{P}", "");

        System.out.println("-------------------------------");

        System.out.print("Texto invertido: ");
        printarTextoInvertido(texto);

        DinamicStack textoInvertido = inverterTexto(texto);

        if(isPalindromo(texto, textoInvertido)) {
            System.out.println("O texto é palíndromo!");
        }
        else {
            System.out.println("O texto não é palíndromo!");
        }

        System.out.println("-------------------------------");
    }

    public static DinamicStack inverterTexto(String texto) {
        DinamicStack textoInvertido = new DinamicStack();

        for(int posicao = 0; posicao < texto.length(); posicao++) {
            char palavra = texto.charAt(posicao);

            textoInvertido.push(palavra);
        }

        return textoInvertido;
    }

    public static void printarTextoInvertido(String texto) {
        for(int contador = texto.length() - 1; contador >= 0; contador--) {
            System.out.print(texto.charAt(contador));
        }
        System.out.println();
    }

    public static boolean isPalindromo(String texto, DinamicStack textoInvertido) {
        DinamicStack textoInvertidoAux = new DinamicStack();

        boolean isPalindromo = true;

        try {

            for(int posicao = 0; posicao < texto.length(); posicao++) {
                char palavraTexto = texto.charAt(posicao);

                if(palavraTexto == ' ') {
                    continue;
                }

                char palavraTextoInvertido = textoInvertido.pop();

                while(palavraTextoInvertido == ' ') {
                    textoInvertidoAux.push(palavraTextoInvertido);
                    palavraTextoInvertido = textoInvertido.pop();
                }

                if(palavraTexto != palavraTextoInvertido) {
                    isPalindromo = false;
                }

                textoInvertidoAux.push(palavraTextoInvertido);
            }

            while(!textoInvertidoAux.isEmpty()) {
                textoInvertido.push(textoInvertidoAux.pop());
            }

        } catch(PopException popException) {
            System.out.println(popException.getMessage());
        }

        return isPalindromo;
    }

    public static String removerAcentos(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }
}
