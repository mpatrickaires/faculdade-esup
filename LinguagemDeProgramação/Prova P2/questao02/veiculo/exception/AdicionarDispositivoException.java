package questao02.veiculo.exception;

public class AdicionarDispositivoException extends Exception {

    public AdicionarDispositivoException() {
        super("Esse dispositivo já está no veículo! Impossível adicionar novamente.");
    }
}
