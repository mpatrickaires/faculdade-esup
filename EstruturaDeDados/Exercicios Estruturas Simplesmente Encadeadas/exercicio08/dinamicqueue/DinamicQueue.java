package exercicio08.dinamicqueue;

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

    public void enqueue(double custo) {
        No newNo = new No(custo);

        if(isEmpty()) {
            this.last.setNoProximo(newNo);
            this.first.setNoProximo(newNo);
        }
        else if(this.size == 1) {
            No pointer = this.first.getNoProximo();
            if(pointer.getValor() > newNo.getValor()) {
                pointer.setNoProximo(newNo);
                this.last.setNoProximo(newNo);
            }
            else {
                newNo.setNoProximo(pointer);
                this.first.setNoProximo(newNo);
            }
        }
        else {
            No pointer = this.first;

            while(pointer.getNoProximo() != null) {
                if(pointer.getNoProximo().getValor() < newNo.getValor()) {
                    newNo.setNoProximo(pointer.getNoProximo());
                    pointer.setNoProximo(newNo);
                    break;
                }
                pointer = pointer.getNoProximo();
            }

            if(pointer.getNoProximo() == null) {
                this.last.getNoProximo().setNoProximo(newNo);
                this.last.setNoProximo(newNo);
            }

            if(this.first == pointer) {
                this.first.setNoProximo(newNo);
            }
        }
        this.size++;
    }

    public double dequeue() throws DequeueException {
        if(isEmpty()) {
            throw new DequeueException();
        }

        No aux = this.first.getNoProximo();
        this.first.setNoProximo(aux.getNoProximo());
        this.size--;
        return aux.getValor();
    }
}
