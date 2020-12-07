package exercicio12.exception;

public class SearchListException extends Exception {

    public SearchListException() {
        super("Elemento não existe na lista! Impossível remover.");
    }
}
