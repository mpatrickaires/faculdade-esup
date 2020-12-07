package exerciciostratamentoexcecoes.questao08;

public class ValueInvalidException extends Exception {

    public ValueInvalidException() {
        super("ERRO: Valor inválido para realizar essa operação.");
    }
}
