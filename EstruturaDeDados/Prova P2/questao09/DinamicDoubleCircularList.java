package provap2.questao09;

import provap2.questao09.exception.RemoveListException;

/*
* 09 - Uma lista duplamente encadeada possui registros que tem ligações com o sucessor e o
* predecessor de cada nó.
* Tendo como base a lista apresentada em sala de aula, crie uma nova lista, que seja circular, ou seja,
* o próximo nó do último elemento aponta para o primeiro elemento da lista.
* Desta forma, exclua o tail da da sua lista circular (visto que como é uma lista circular,
* sua nova lista não deverá contar com um final), o Head continua existindo, o próximo do head aponta
* para o primeiro elemento, e o anterior do head aponta para null
* (comportamento semelhante na lista duplamente encadeada tradicional). Adapte todos os métodos para que o
* comportamento da lista duplamente encadeada circular funciona adequadamente.
 */

public class DinamicDoubleCircularList {
    private No head;
    private int size;

    public DinamicDoubleCircularList() {
        this.head = new No(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insertFirst(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.head.setNoProximo(newNo);

            newNo.setNoAnterior(this.head);
            newNo.setNoProximo(newNo);
        }

        else {
            No first = this.head.getNoProximo();
            newNo.setNoProximo(first);
            first.setNoAnterior(newNo);

            newNo.setNoAnterior(this.head);
            this.head.setNoProximo(newNo);

            No last = first;
            while(last.getNoProximo() != first) {
                last = last.getNoProximo();
            }
            last.setNoProximo(newNo);
        }

        this.size++;
    }

    public void insertLast(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.head.setNoProximo(newNo);

            newNo.setNoAnterior(this.head);
            newNo.setNoProximo(newNo);
        }

        else {
            No last = this.head.getNoProximo();
            while(last.getNoProximo() != this.head.getNoProximo()) {
                last = last.getNoProximo();
            }

            last.setNoProximo(newNo);
            newNo.setNoProximo(this.head.getNoProximo());
        }

        this.size++;
    }

    public int remove() throws RemoveListException {
        if(isEmpty()) {
            throw new RemoveListException();
        }

        No aux = this.head.getNoProximo();

        if(aux.getNoProximo() == aux) {
            aux.setNoProximo(null);
        }

        this.head.setNoProximo(aux.getNoProximo());

        if(aux.getNoProximo() != null) {
            this.head.getNoProximo().setNoAnterior(this.head);

            No last = this.head.getNoProximo();
            while (last.getNoProximo() != aux) {
                last = last.getNoProximo();
            }
            last.setNoProximo(this.head.getNoProximo());
        }

        this.size--;

        return aux.getValor();
    }
}
