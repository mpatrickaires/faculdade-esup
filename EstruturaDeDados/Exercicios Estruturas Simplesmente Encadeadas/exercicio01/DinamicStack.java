package exercicio01;


import exercicio01.exception.PopException;

public class DinamicStack {
    private No top;
    private int size;

    public DinamicStack() {
        this.top = new No("-1");
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top.getNoProximo() == null;
    }

    public void push(String value) {
        No newNo = new No(value);
        newNo.setNoProximo(this.top.getNoProximo());
        this.top.setNoProximo(newNo);
        this.size++;
    }

    public String pop() throws PopException {
        if(isEmpty()) {
            throw new PopException();
        }

        No aux = this.top.getNoProximo();
        this.top.setNoProximo(aux.getNoProximo());
        this.size--;
        return aux.getValor();
    }

    public int getSize() {
        return this.size;
    }
}
