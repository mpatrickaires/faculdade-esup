package exercicio06.exception;

public class DequeueException extends Exception {

    public DequeueException() {
        super("Filha vazia! Não é possível desenfileirar.");
    }
}
