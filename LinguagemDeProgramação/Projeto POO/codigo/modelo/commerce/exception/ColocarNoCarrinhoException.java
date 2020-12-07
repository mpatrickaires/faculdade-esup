package modelo.commerce.exception;

public class ColocarNoCarrinhoException extends Exception {

    public ColocarNoCarrinhoException() {
        System.out.println("Estoque do produto insuficiente! Impossível colocar no modelo.carrinho.");
    }
}
