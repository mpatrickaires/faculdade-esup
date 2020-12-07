package exerciciostratamentoexcecoes.questao06;

public class Main {
    /*
    * 06 - Suponha que o método "saca" da classe Conta vai ser rescrito de forma a lançar uma
    * exceção criada por você, cuja classe é ContaExcecao (extends Exception). A exceção é
    * lançada sempre que o saldo da conta for inferior ao valor sacado. Implemente a classe
    * ContaExcecao. Implemente o método saca que lança a exceção. E rescreva o código da
    * caixa com o devido tratamento da exceção.
    *
    * ----- VERIFICAR CÓDIGO EM ANEXO NO ARQUIVO PDF DA LISTA -----
    */

    public static void main(String[] args) {
        try {
            Conta minhaConta = new Conta();
            minhaConta.deposita(100);
            minhaConta.setLimite(100);
            minhaConta.saca(1000);
        } catch(ContaExcecao contaExcecao) {
            System.out.println(contaExcecao.getMessage());
        }
    }
}
