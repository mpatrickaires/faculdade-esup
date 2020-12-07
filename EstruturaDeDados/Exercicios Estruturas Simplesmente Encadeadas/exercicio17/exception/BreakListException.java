package exercicio17.exception;

public class BreakListException extends Exception {
    public BreakListException() {
        super("Valor não encontrado! Impossível quebrar a lista.");
    }
}
