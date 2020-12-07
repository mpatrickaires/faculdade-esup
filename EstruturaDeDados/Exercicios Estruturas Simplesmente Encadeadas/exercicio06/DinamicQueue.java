package exercicio06;

import exercicio06.exception.DequeueException;

public class DinamicQueue {
    private No first;
    private No last;
    private int size;

    public DinamicQueue() {
        this.first = new No(-1);
        this.last = new No(-1);
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.last.setNoProximo(newNo);
            this.first.setNoProximo(newNo);
        }
        else {
            this.last.getNoProximo().setNoProximo(newNo);
            this.last.setNoProximo(newNo);
        }
        this.size++;
    }

    public int dequeue() throws DequeueException {
        if(isEmpty()) {
            throw new DequeueException();
        }

        No aux = this.first.getNoProximo();
        this.first.setNoProximo(aux.getNoProximo());
        this.size--;
        return aux.getValor();
    }
}
