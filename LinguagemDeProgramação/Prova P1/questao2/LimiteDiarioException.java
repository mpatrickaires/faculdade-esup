package questao2;

public class LimiteDiarioException extends Exception {

    public LimiteDiarioException() {
        super("Impossível efetuar o saque! O valor excede o seu limite diário restante.");
    }
}
