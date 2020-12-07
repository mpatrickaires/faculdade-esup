package exercicio14;

import exercicio14.exception.ListException;
import exercicio14.exception.RemoveListException;

/*
* 14 - Crie uma função na estrutura de Lista dinâmica que insere elementos inteiros de forma
* crescente. Sempre que um novo número é inserido, este deve ser inserido de forma que
* toda lista esteja ordenada crescente.
*/

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

    public void insertSorted(int value) {
        No newNo = new No(value);

        No pointer = this.head;
        while(pointer.getNoProximo() != null) {
            if(pointer.getNoProximo().getValor() > newNo.getValor()) {
                newNo.setNoProximo(pointer.getNoProximo());
                pointer.setNoProximo(newNo);
                break;
            }
            pointer = pointer.getNoProximo();
        }

        if(pointer.getNoProximo() == null) {
            newNo.setNoProximo(pointer.getNoProximo());
            pointer.setNoProximo(newNo);
        }

        if(pointer == this.head) {
            this.head.setNoProximo(newNo);
        }
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
