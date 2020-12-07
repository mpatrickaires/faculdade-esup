package provap2.questao05.doublelist.exception;

public class RemoveListException extends Exception {

    public RemoveListException() {
        super("Lista vazia! Impossível remover.");
    }
}
