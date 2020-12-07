package visualizacao.exception;

public class CadastrarUsuarioException extends Exception {

    public CadastrarUsuarioException() {
        super("O CPF informado já está cadastrado no sistema! Impossível efetuar o cadastro do usuário.");
    }
}
