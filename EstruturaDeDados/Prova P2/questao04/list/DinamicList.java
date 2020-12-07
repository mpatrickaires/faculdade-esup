package provap2.questao04.list;

import provap2.questao04.list.exception.ListException;
import provap2.questao04.list.exception.RemoveListException;

public class DinamicList {
    int size;
    No head;
    
    public DinamicList() {
        this.head = new No(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head.getNoProximo() == null;
    }

    public void insertFirst(int value) {
        No newNo = new No(value);

        newNo.setNoProximo(head.getNoProximo());
        head.setNoProximo(newNo);
        this.size++;
    }

    public void insertLast(int value) {
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

    public int remove() throws RemoveListException {
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
