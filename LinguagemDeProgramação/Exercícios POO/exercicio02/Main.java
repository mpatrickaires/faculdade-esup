package exercicio02;

public class Main {
    /*
     * 02 - Crie uma classe chamada Invoice que possa ser utilizado por uma loja de
     * suprimentos de informática para representar uma fatura de um item vendido na loja.
     * Uma fatura deve incluir as seguintes informações como atributos:
     *     a. o número do item faturado
     *     b. a descrição do item
     *     c. a quantidade comprada do item e
     *     d. o preço unitário do item.
     * Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade
     * não for positiva, ela deve ser configurada como 0. Se o preço por item não for
     * positivo ele deve ser configurado como 0.0. Forneça um método set e um método get
     * para cada variável de instância. Além disso, forneça um método chamado
     * getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo
     * preço por item) e depois retorna o valor como um double. Escreva um aplicativo de
     * teste que demonstra as capacidades da classe Invoice.
     */

    public static void main(String[] args) {
        Invoice fatura = new Invoice(5555, "Monitor", 3, 250);
        double valorFatura = fatura.getInvoiceAmount();
        System.out.println("Valor da fatura: " + valorFatura);
    }
}
