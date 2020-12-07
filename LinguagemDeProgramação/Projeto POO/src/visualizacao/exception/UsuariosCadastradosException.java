package visualizacao.exception;

public class UsuariosCadastradosException extends Exception {

    public UsuariosCadastradosException() {
        super("Não há usuários cadastrados! Impossível proceder com o login.");
    }
}
