package exerciciostratamentoexcecoes.questao08;

public class ImpossibleOperationException extends Exception {

    public ImpossibleOperationException() {
        super("ERRO: Não foi possível realizar a operação de saque! Verifique sua conta e o valor informado.");
    }
}
