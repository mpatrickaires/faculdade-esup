package questao2;

public class AbrirContaException extends Exception {

    public AbrirContaException() {
        super("Impossível abrir a conta! O saldo deve ser maior ou igual a R$50,00");
    }
}
