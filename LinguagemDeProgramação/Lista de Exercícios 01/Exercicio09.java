package listadeexercicios01;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        /*
         * 9 - A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml,
         * garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade
         * de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.
         * O Algoritmo deve perguntar a quantidade de cada formato e ter como saída o total em litros.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas 350 ml: ");
        int lata350Ml = scan.nextInt();
        System.out.print("Digite a quantidade de garrafas 600 ml: ");
        int garrafa600Ml = scan.nextInt();
        System.out.print("Digite a quantidade de garrafas 2 litros: ");
        int garrafa2L = scan.nextInt();

        double totalLitros = (lata350Ml * 0.35) + (garrafa600Ml * 0.6) + (garrafa2L * 2);
        System.out.println("Total: " + totalLitros + " litros");
    }
}
