package modelo.commerce.exception;

public class CodigoJaExistenteException extends Exception {

    public CodigoJaExistenteException() {
        super("Esse código de produto já existe! Impossível adicionar novo produto.");
    }
}
