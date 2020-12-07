package exercicio07.exception;

public class DequeueException extends Exception {

    public DequeueException() {
        super("Fila vazia! Não é possível desenfileirar.");
    }
}
