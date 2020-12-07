package provap2.questao04.list.exception;

public class RemoveListException extends Exception {

    public RemoveListException() {
        super("Lista vazia! Impossível remover.");
    }
}
