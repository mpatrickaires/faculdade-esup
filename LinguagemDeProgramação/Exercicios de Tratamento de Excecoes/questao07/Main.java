package exerciciostratamentoexcecoes.questao07;

import java.util.Scanner;

public class Main {
    /*
    * 07 - Considere o problema de conversão de temperaturas entre Celsius e Fahrenheit em Java.
    *
    *     ● Crie duas exceções, TemperatureException que herda de Exception, com
    *     mensagem: "Temperatura Inválida".
    *
    *     ● Crie uma classe Temperatura com um método para converter temperaturas em graus
    *     de graus Fahrenheit (toCelsius(double fahrenheit)) ambas representadas em
    *     ponto-flutuante (double).
    *
    *     ● Porém, caso o valor a ser convertido seja menor ou igual a zero absoluto (-459,67°F)
    *     deve-se lançar a exceção TemperatureException. A formula para conversão é dada por:
    *     C = 5 * (F - 32) / 9
    *
    *     ● No main criar estrutura de try, catch. Crie um finally, para printar e temperatura
    *     convertida mesmo inválida.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();
        double celsius = 0;

        System.out.println("======== CONVERSOR DE TEMPERATURA ========");
        try {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            celsius = temperatura.toCelsius(fahrenheit);
            if(fahrenheit <= -459.67) {
                throw new TemperatureException();
            }

        } catch(TemperatureException temperatureException) {
            System.out.println(temperatureException.getMessage());

        } finally {
            System.out.println("------------------------------------------------");
            System.out.println("Temperatura em Celsius: " + celsius + " ºC");
        }
    }
}
