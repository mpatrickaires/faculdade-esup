package exercicio12.exception;

public class RemoveListException extends Exception {

    public RemoveListException() {
        super("Lista vazia! Impossível remover.");
    }
}
