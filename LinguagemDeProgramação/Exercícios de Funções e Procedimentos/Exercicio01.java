package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio01 {
    /*
     * 1 - Faça um procedimento que recebe a idade de um nadador por parâmetro e retorne uma string com
     * a categoria desse nadador de acordo com a tabela abaixo:
     * ----- VERIFICAR ANEXO NO ARQUIVO WORD -----
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        definirCategoria(idade);
    }

    static void definirCategoria(int idade) {
        String categoria;
        if (idade < 5) {
            categoria = "SEM CATEGORIA";
        }
        else if (idade <= 7) {
            categoria = "INFANTIL A";
        }
        else if (idade <= 10) {
            categoria = "INFANTIL B";
        }
        else if (idade <= 13) {
            categoria = "JUVENIL A";
        }
        else if (idade <= 17) {
            categoria = "JUVENIL B";
        }
        else {
            categoria = "ADULTO";
        }
        System.out.println("Você é da categoria " + categoria);
    }
}
