package listadeexercicios01;

public class Exercicio19 {

    public static void main(String[] args) {
        /*
        * 19 - Faça um programa para calcular as raízes reais de uma equação do 2°grau:  2x2 + 6𝑥 + 15.
        * Lembrando que △= B2 − 4 ∗ 𝐴 ∗ 𝐶, seu programa deve apresentar as raízes reais,
        * quando tiverem, da seguinte forma:
        * ●	Se △ < 0, não possui raízes reais
        * ●	Se △ > 0, possui duas raízes reais
        * ●	Se △ ==  0, possui uma raiz real
        */

        System.out.println("Equação: 2x² + 6x + 15");
        int delta = (int) Math.pow(6, 2) - 4 * 2 * 15;
        System.out.println("Delta: " + delta);

        if (delta < 0) {
            System.out.println("Essa equação NÃO POSSUI raízes reais.");
        }
        else if (delta > 0) {
            System.out.println("Essa equação POSSUI DUAS raízes reais.");
        }
        else {
            System.out.println("Essa equação POSSUI UMA raiz real.");
        }
    }
}
