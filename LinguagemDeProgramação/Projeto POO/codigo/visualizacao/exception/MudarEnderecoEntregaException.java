package visualizacao.exception;

public class MudarEnderecoEntregaException extends Exception {

    public MudarEnderecoEntregaException() {
        super("Não há endereço cadastrado com esse CEP! Impossível realizar a mudança do endereço de entrega.");
    }
}
