package exercicio04.exception;

public class PopException extends Exception {
    public PopException() {
        super("Pilha vazia! Não é possível desempilhar novo item.");
    }
}
