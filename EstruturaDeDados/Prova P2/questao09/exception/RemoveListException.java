package provap2.questao09.exception;

public class RemoveListException extends Exception {

    public RemoveListException() {
        super("Lista vazia! Impossível remover.");
    }
}
