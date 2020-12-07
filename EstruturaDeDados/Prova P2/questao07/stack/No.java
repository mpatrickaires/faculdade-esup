package provap2.questao07.stack;

public class No {
    private char valor;
    private No noProximo;

    public No(char value) {
        this.valor = value;
        this.noProximo = null;
    }

    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public No getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No noProximo) {
        this.noProximo = noProximo;
    }
}
