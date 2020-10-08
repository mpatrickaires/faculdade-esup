package listadeexercicios01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        /*
         * 8 - Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem,
         * utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário deve fornecer
         * o tempo gasto na viagem e a velocidade média durante ela. Desta forma, será possível obter a distância
         * percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância,
         * basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula:
         * LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
         * tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scan.nextDouble();

        System.out.print("Digite a velocidade média na viagem (em km/h): ");
        double velocidade = scan.nextDouble();

        double distancia = tempo * velocidade;
        double listrosUsados = distancia / 12;

        System.out.println("====================");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros utilizado: " + listrosUsados + " litros");
        System.out.println("====================");
    }
}
