package provap2.questao05.exception;

public class RemoverElementoException extends Exception {

    public RemoverElementoException() {
        super("Esse elemento não existe na lista! Impossível efetuar a remoção.");
    }
}
