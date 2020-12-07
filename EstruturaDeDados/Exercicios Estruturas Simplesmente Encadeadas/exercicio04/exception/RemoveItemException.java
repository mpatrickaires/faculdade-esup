package exercicio04.exception;

public class RemoveItemException extends Exception {
    public RemoveItemException() {
        super("Chave inválida! Não é possível efetuar a remoção desse elemento.");
    }
}
