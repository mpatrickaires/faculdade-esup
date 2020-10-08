package exercicio01;

public class Contador {

    private int numero;

    public Contador() {
        this.numero = 0;
    }

    public void zerar() {
        this.numero = 0;
    }

    public void incrementar() {
        this.numero++;
    }

    public int valor() {
        return this.numero;
    }
}
