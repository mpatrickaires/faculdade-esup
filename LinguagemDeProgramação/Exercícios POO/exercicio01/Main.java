package exercicio01;

public class Main {
    /*
     * 01 - Escreva em Java uma classe Contador, que encapsule um valor usado para
     * contagem de itens ou eventos. A classe deve oferecer métodos que devem:
     *     a. Zerar
     *     b. Incrementar
     *     c. Retornar o valor do numero.
     */

    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println("Valor do contador depois de ser instanciado -> " + contador.valor());

        for(int i = 0; i < 10; i++) {
            contador.incrementar();
        }

        System.out.println("Valor do contador depois de ser incrementado 10 vezes -> " + contador.valor());

        contador.zerar();
        System.out.println("Valor do contador depois de ser zerado -> " + contador.valor());
    }
}
