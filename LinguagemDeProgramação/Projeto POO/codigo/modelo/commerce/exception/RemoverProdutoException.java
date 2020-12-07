package modelo.commerce.exception;

public class RemoverProdutoException extends Exception {

    public RemoverProdutoException() {
        super("Produto inexistente! Impossível realizar a remoção.");
    }
}
