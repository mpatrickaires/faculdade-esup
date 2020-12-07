package provap2.questao06.dinamicqueue;

import provap2.questao06.dinamicqueue.exception.DequeueException;

public class DinamicQueue {
    private No first;
    private No last;
    private int size;

    public DinamicQueue() {
        this.first = new No(null);
        this.last = new No(null);
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(Cliente cliente) {
        No newNo = new No(cliente);

        if(isEmpty()) {
            this.last.setNoProximo(newNo);
            this.first.setNoProximo(newNo);
        }
        else if(this.size == 1) {
            if(this.first.getNoProximo().getCliente().isPrioridade()) {
                this.first.getNoProximo().setNoProximo(newNo);
                this.last.setNoProximo(newNo);
            }
            else {
                newNo.setNoProximo(this.first.getNoProximo());
                this.first.setNoProximo(newNo);
            }
        }
        else {
            if(cliente.isPrioridade()) {
                No pointer = this.first;
                while(pointer.getNoProximo() != null) {
                    if(!pointer.getNoProximo().getCliente().isPrioridade()) {
                        break;
                    }
                    pointer = pointer.getNoProximo();
                }

                if(pointer.getNoProximo() != null) {
                    newNo.setNoProximo(pointer.getNoProximo());
                    pointer.setNoProximo(newNo);
                }
                else {
                    pointer.setNoProximo(newNo);
                    this.last.setNoProximo(newNo);
                }
            }

            else {
                this.last.getNoProximo().setNoProximo(newNo);
                this.last.setNoProximo(newNo);
            }
        }
        this.size++;
    }

    public Cliente dequeue() throws DequeueException {
        if(isEmpty()) {
            throw new DequeueException();
        }

        No aux = this.first.getNoProximo();
        this.first.setNoProximo(aux.getNoProximo());
        this.size--;
        return aux.getCliente();
    }
}
