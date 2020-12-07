package exercicio01;

public class No {
    private String valor;
    private No noProximo;

    public No(String value) {
        this.valor = value;
        this.noProximo = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public No getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No noProximo) {
        this.noProximo = noProximo;
    }
}
