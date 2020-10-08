package listadeexercicios01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idadeAnos = scan.nextInt();
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeMeses * 30;
        System.out.println(idadeAnos + " anos é correspondente a " + idadeDias + " dias.");
    }
}
