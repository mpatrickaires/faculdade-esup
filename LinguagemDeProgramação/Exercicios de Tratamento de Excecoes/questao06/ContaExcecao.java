package exerciciostratamentoexcecoes.questao06;

public class ContaExcecao extends Exception {

    public ContaExcecao() {
        super("Saldo da conta inferior ao valor de saque");
    }
}
