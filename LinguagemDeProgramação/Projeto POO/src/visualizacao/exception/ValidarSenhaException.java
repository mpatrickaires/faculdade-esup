package visualizacao.exception;

public class ValidarSenhaException extends Exception {

    public ValidarSenhaException() {
        super("Senha inválida! Não foi possível realizar o login.");
    }
}
