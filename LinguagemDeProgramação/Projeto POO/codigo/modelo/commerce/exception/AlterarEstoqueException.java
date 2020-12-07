package modelo.commerce.exception;

public class AlterarEstoqueException extends Exception {

    public AlterarEstoqueException() {
        super("Produto inexistente! Impossível realizar a alteração no estoque.");
    }
}
