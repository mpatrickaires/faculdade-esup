package exercicio08.dinamicqueue;

public class DequeueException extends Exception {

    public DequeueException() {
        super("Fila vazia! Não é possível desenfileirar.");
    }
}
