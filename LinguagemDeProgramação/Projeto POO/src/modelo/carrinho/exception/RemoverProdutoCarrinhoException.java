package modelo.carrinho.exception;

public class RemoverProdutoCarrinhoException extends Exception {

    public RemoverProdutoCarrinhoException() {
        super("O produto não existe no carrinho! Impossível realizar a remoção.");
    }
}
