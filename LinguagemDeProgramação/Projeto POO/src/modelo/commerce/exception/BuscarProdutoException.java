package modelo.commerce.exception;

public class BuscarProdutoException extends Exception {

    public BuscarProdutoException() {
        super("Esse código não existe no Commerce! Impossível realizar a busca.");
    }
}
