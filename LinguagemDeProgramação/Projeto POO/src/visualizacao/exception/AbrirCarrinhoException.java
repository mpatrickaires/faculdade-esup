package visualizacao.exception;

public class AbrirCarrinhoException extends Exception {

    public AbrirCarrinhoException() {
        super("O usuário não está logado! Impossível abrir o carrinho.");
    }
}
