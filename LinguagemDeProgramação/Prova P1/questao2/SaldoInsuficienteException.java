package questao2;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("Impossível efetuar o saque! O valor do saque é maior do que o disponível em saldo.");
    }
}
