package exercicio03;

public class Main {
    /*
     * 03 - Crie uma classe para representar datas.
     *
     *     a. Represente uma data usando três atributos: o dia, o mês, e o ano.
     *
     *     b. Sua classe deve ter um construtor que inicializa os três atributos e verifica a
     *     validade dos valores fornecidos.
     *
     *     c. Forneça um método set um get para cada atributo.
     *
     *     d. Forneça o método toString para retornar uma representação da data como string.
     *     Considere que a data deve ser formatada mostrando o dia, o mês e o ano separados por barra (/).
     *
     *     e. Forneça uma operação para avançar uma data para o dia seguinte.
     *
     *     f. Escreva uma classe main de teste que demonstra as capacidades da classe.
    */

    public static void main(String[] args) {
        Data data1 = new Data(31, 12, 2019);
        System.out.println(data1.toString());
        System.out.println("--------- AVANÇANDO 1 DIA ----------");
        data1.avancarDia();
        System.out.println(data1.toString());
    }
}
