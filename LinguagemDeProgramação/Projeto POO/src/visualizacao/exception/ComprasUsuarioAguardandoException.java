package visualizacao.exception;

public class ComprasUsuarioAguardandoException extends Exception {

    public ComprasUsuarioAguardandoException() {
        super("O usuário não possui compras em aberto! Impossível mostrar as compras.");
    }
}
