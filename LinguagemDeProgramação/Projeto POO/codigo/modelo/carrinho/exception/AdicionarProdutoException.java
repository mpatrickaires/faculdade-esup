package modelo.carrinho.exception;

public class AdicionarProdutoException extends Exception {

    public AdicionarProdutoException() {
        super("Estoque do produto insuficiente! Impossível adicionar produto ao carrinho.");
    }
}
