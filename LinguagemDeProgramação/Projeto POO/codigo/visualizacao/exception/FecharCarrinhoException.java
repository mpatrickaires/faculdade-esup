package visualizacao.exception;

public class FecharCarrinhoException extends Exception {

    public FecharCarrinhoException() {
        super("Carrinho vazio! Não é possível fechar o carrinho sem produtos.");
    }
}
