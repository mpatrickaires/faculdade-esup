package exercicio16.exception;

public class RemoveListException extends Exception {

    public RemoveListException() {
        super("Lista vazia! Impossível remover.");
    }
}
