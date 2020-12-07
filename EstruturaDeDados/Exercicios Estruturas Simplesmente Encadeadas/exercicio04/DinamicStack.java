package exercicio04;

import exercicio04.exception.PopException;
import exercicio04.exception.RemoveItemException;

public class DinamicStack {
    private No top;
    private int size;

    public DinamicStack() {
        this.top = new No(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top.getNoProximo() == null;
    }

    public void push(int value) {
        No newNo = new No(value);
        newNo.setNoProximo(this.top.getNoProximo());
        this.top.setNoProximo(newNo);
        this.size++;
    }

    public int pop() throws PopException {
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

    public void removeItem(int key) throws RemoveItemException {
        if(key > this.size || key <= 0) {
            throw new RemoveItemException();
        }

        DinamicStack pilhaAuxiliar = new DinamicStack();

        try {

            while (this.size != key) {
                pilhaAuxiliar.push(pop());
            }

            pop();

            while (!pilhaAuxiliar.isEmpty()) {
                push(pilhaAuxiliar.pop());
            }

        } catch(PopException popException) {

            System.out.println(popException.getMessage());
        }
    }
}
