package exercicio07;

public class No {
    private int valor;
    private FilaPrioridade prioridade;
    private No noProximo;

    public No(int value, FilaPrioridade prioridade) {
        this.valor = value;
        this.prioridade = prioridade;
        this.noProximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public FilaPrioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(FilaPrioridade prioridade) {
        this.prioridade = prioridade;
    }

    public No getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No noProximo) {
        this.noProximo = noProximo;
    }
}
