package exerciciosfuncoeseprocedimentos;

import java.util.Scanner;

public class Exercicio07 {
    /*
    * 7 - Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume
    * (v = 4/3 * PI * R3), adote PI com valor de 3,14.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scan.nextDouble();
        System.out.println("O volume dessa esfera é " + calcularVolumeEsfera(raio));
    }

    static double calcularVolumeEsfera (double raio) {
        return 4.0 / 3.0 * 3.14 * Math.pow(raio, 3);
    }
}
