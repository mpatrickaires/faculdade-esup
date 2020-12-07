package questao02.exception;

public class ProcurarVeiculoException extends Exception {

    public ProcurarVeiculoException() {
        super("Esse veículo não existe no sistema! Impossível concluir a busca.");
    }
}
