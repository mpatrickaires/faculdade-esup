package exercicio19.exception;

public class SearchValueListException extends Exception {

    public SearchValueListException() {
        super("Elemento não encontrado na lista! Impossível realizar o retorno.");
    }
}
