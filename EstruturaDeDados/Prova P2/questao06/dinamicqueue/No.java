package provap2.questao06.dinamicqueue;

public class No {
    private Cliente cliente;
    private No noProximo;

    public No(Cliente cliente) {
        this.cliente = cliente;
        this.noProximo = null;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public No getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No noProximo) {
        this.noProximo = noProximo;
    }
}
