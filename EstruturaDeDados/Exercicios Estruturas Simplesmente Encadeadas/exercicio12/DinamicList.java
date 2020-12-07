package exercicio12;

import exercicio12.exception.ListException;
import exercicio12.exception.RemoveListException;
import exercicio12.exception.SearchListException;

/*
* 12 - Crie uma função search na lista simplesmente encadeada que busca e remove o
* elemento da lista. Se o elemento não existir, soltar uma exceção específica criada para
* elemento buscado e não encontrado. Ao final do exercício, a lista deve manter sua
* configuração original, sem o elemento buscado.
*/

public class DinamicList {
    int size;
    No head;
    
    public DinamicList() {
        this.head = new No(-1);
        this.size = 0;
    }

    public void search(int value) throws SearchListException {
        DinamicList listaAux = new DinamicList();
        boolean encontrou = false;

        try {

            while(!isEmpty()) {
                int listValue = remove();

                if(listValue == value) {
                    encontrou = true;
                    continue;
                }

                listaAux.insertLast(listValue);
            }

            while(!listaAux.isEmpty()) {
                insertLast(listaAux.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        if(!encontrou) {
            throw new SearchListException();
        }
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
