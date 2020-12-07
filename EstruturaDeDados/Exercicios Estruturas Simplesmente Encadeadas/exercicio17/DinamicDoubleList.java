package exercicio17;

import exercicio17.exception.ListException;
import exercicio17.exception.BreakListException;
import exercicio17.exception.RemoveListException;

/*
* 17 - Escreva um método para lista duplamente encadeada tradicional (apresentada em sala),
* que quebre a lista a partir de um valor passado por parâmetro, e retorne uma nova lista a
* partir deste nó. Veja o exemploa abaixo:
*
* Lista passado por parâmetro:
* ----- CONFERIR IMAGEM EM ANEXO NA LISTA -----
*
* Lista de retornod a função:
* ----- CONFERIR IMAGEM EM ANEXO NA LISTA -----
*/

public class DinamicDoubleList {
    private No head;
    private No tail;
    private int size;

    public DinamicDoubleList() {
        this.head = new No(-1);
        this.tail = new No(-1);
        this.size = 0;
    }

    public DinamicDoubleList breakList(int value) throws BreakListException {
        DinamicDoubleList returnList = new DinamicDoubleList();
        DinamicDoubleList auxList = new DinamicDoubleList();

        try {

            while(!isEmpty()) {
                int thisValue = remove();

                if(thisValue == value || !returnList.isEmpty()) {
                    returnList.insertLast(thisValue);
                }

                auxList.insertLast(thisValue);
            }

            while(!auxList.isEmpty()) {
                insertLast(auxList.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        if(returnList.isEmpty()) {
            throw new BreakListException();
        }

        return returnList;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insertFirst(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.head.setNoProximo(newNo);
            newNo.setNoAnterior(this.head);

            this.tail.setNoAnterior(newNo);
            newNo.setNoProximo(this.tail);
        }

        else {
            No first = this.head.getNoProximo();
            newNo.setNoProximo(first);
            first.setNoAnterior(newNo);

            newNo.setNoAnterior(this.head);
            this.head.setNoProximo(newNo);
        }

        this.size++;
    }

    public void insertLast(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.head.setNoProximo(newNo);
            newNo.setNoAnterior(this.head);

            this.tail.setNoAnterior(newNo);
            newNo.setNoProximo(this.tail);
        }

        else {
            No last = this.tail.getNoAnterior();
            newNo.setNoAnterior(last);
            last.setNoProximo(newNo);

            newNo.setNoProximo(this.tail);
            this.tail.setNoAnterior(newNo);
        }

        this.size++;
    }

    public int remove() throws RemoveListException {
        if(isEmpty()) {
            throw new RemoveListException();
        }

        No aux = this.head.getNoProximo();

        this.head.setNoProximo(aux.getNoProximo());
        this.head.getNoProximo().setNoAnterior(this.head);
        this.size--;

        return aux.getValor();
    }

    public void list() throws ListException {
        if(isEmpty()) {
            throw new ListException();
        }

        No aux = this.head.getNoProximo();

        while(aux != this.tail) {
            System.out.println("Elemento: " + aux.getValor());
            aux = aux.getNoProximo();
        }
    }

    public int getSize() {
        return this.size;
    }
}
