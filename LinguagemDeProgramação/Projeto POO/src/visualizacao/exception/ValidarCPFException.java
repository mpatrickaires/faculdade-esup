package visualizacao.exception;

public class ValidarCPFException extends Exception {

    public ValidarCPFException() {
        super("Não existe usuário cadastrado com esse CPF! Impossível realizar o login.");
    }
}
