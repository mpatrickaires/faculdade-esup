package provap2.questao06.dinamicqueue.exception;

public class DequeueException extends Exception {

    public DequeueException() {
        super("Fila vazia! Não é possível desenfileirar.");
    }
}
