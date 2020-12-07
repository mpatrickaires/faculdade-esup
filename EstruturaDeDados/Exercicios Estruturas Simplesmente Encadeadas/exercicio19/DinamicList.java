package exercicio19;

import exercicio19.exception.ListException;
import exercicio19.exception.RemoveListException;
import exercicio19.exception.SearchValueListException;

/*
* 19 - Implemente uma função na sua lista simplesmente encadeada que busca um
* determinado elemento e retorne o elemento no retorno da função. Se o elemento não for
* encontrado, soltar exceção, elemento não encontrado.
*/

public class DinamicList {
    int size;
    No head;
    
    public DinamicList() {
        this.head = new No(-1);
        this.size = 0;
    }

    public int searchValue(int value) throws SearchValueListException {
        No pointer = this.head.getNoProximo();

        while(pointer.getValor() != value) {
            if(pointer.getNoProximo() == null) {
                throw new SearchValueListException();
            }

            pointer = pointer.getNoProximo();
        }

        return pointer.getValor();
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
