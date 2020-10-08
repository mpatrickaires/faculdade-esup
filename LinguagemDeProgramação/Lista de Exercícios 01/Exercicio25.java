package listadeexercicios01;

public class Exercicio25 {

    public static void main(String[] args) {
        // 25 - Escrever um algoritmo que calcule e mostre a média aritmética dos números entre 12 e 98.

        double media, soma = 0, totalNumeros = 0;

        for (int contador = 12; contador <= 98; contador++) {
            totalNumeros += 1;
            soma += contador;
        }
        media = soma / totalNumeros;
        System.out.println("A média aritmética dos números entre 12 e 98 é igual a " + media);
    }
}
