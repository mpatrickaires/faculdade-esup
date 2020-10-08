package exercicio04;

public class Main {
    /*
    * 04 - Escreva uma classe que represente um país. Um país é representado através dos
    * atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.:
    * 193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país
    * mantém uma lista de outros países com os quais ele faz fronteira. Escreva a classe
    * em Java e forneça os seus membros a seguir:
    *
    *     a. Construtor que inicialize o código ISO, o nome e a dimensão do país;
    *
    *     b. Métodos de acesso (getter/setter) para as propriedades código ISSO, nome, população e dimensão do país;
    *
    *     c. Um método que permita verificar se dois objetos representam o mesmo país
    *     (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO;
    *
    *     d. Um método que informe se outro país é limítrofe do país que recebeu a mensagem;
    *
    *     e. Um método que retorne a densidade populacional do país;
    *
    *     f. Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países.
    *     Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira.
    */

    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8516000);
        Pais argentina = new Pais("ARG", "Argentina", 2780000);
        Pais chile = new Pais("CHL", "Chile", 756950);

        brasil.setPopulacao(209000000);
        argentina.setPopulacao(44000000);
        chile.setPopulacao(0);

        try {
            brasil.adicionarPaisVizinho(argentina);
            argentina.adicionarPaisVizinho(brasil);
            argentina.adicionarPaisVizinho(chile);
            chile.adicionarPaisVizinho(argentina);
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("-----------------------");
        System.out.println("Brasil e Brasil são o mesmo país? " + brasil.verificarIgualdadePaises(brasil));
        System.out.println("Brasil e Argentina são o mesmo país? " + brasil.verificarIgualdadePaises(argentina));

        System.out.println("\n-----------------------");
        System.out.println("Brasil é limítrofe da Argentina? " + brasil.verificarFronteira(argentina));
        System.out.println("Brasil é limítrofe do Chile? " + brasil.verificarFronteira(chile));

        System.out.println("\n------- PAÍSES VIZINHOS COMUNS ENTRE BRASIL E CHILE -------");
        Pais vizinhosComunsBrasilChile[] = brasil.paisesVizinhosComuns(chile);
        for(Pais pais : vizinhosComunsBrasilChile) {
            System.out.println(pais.getNome());
        }
    }
}
