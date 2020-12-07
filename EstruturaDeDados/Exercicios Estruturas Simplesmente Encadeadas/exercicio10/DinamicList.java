package exercicio10;

import exercicio10.exception.ListException;
import exercicio10.exception.RemoveListException;

public class DinamicList {
    int size;
    No head;
    
    public DinamicList() {
        this.head = new No('1');
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head.getNoProximo() == null;
    }

    public void insertFirst(char value) {
        No newNo = new No(value);

        newNo.setNoProximo(head.getNoProximo());
        head.setNoProximo(newNo);
        this.size++;
    }

    public void insertLast(char value) {
        No newNo = new No(value);

        if(isEmpty()) {
            head.setNoProximo(newNo);
        }
        else {
            No aux = this.head.getNoProximo();

            while(aux.getNoProximo() != null) {
                aux = aux.getNoProximo();
            }

            aux.setNoProximo(newNo);
        }

        this.size++;
    }

    public char remove() throws RemoveListException {
        if(isEmpty()) {
            throw new RemoveListException();
        }

        No aux = this.head.getNoProximo();
        this.head.setNoProximo(aux.getNoProximo());

        this.size--;
        return aux.getValor();
    }

    public void list() throws ListException {
        if(isEmpty()) {
            throw new ListException();
        }

        No aux = this.head.getNoProximo();

        while(aux != null) {
            System.out.println("Elemento: " + aux.getValor());
            aux = aux.getNoProximo();
        }
    }

    public int getSize() {
        return this.size;
    }
}
