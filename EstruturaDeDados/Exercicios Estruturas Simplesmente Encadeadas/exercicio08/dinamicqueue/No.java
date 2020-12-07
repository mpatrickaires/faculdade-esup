package exercicio08.dinamicqueue;

public class No {
    private double valor;
    private No noProximo;

    public No(double custo) {
        this.valor = custo;
        this.noProximo = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double custo) {
        this.valor = valor;
    }

    public No getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No noProximo) {
        this.noProximo = noProximo;
    }
}
