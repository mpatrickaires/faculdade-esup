package exercicio07;

import exercicio07.exception.DequeueException;

/*
* 07 - Altere sua estrutura de fila simplesmente encadeada, para que a estrutura tenha
* capacidade de lidar com prioridades. Existem três tipos de prioridade para um nó: alta,
* baixa, média (configure como achar melhor, número, enum). Esta nova fila dinâmica com
* prioridades, segue as seguintes regras:
    * ● Só existe uma única fila, organizada por prioridade.
    * ● Um nó de prioriodadade maior não pode estar atrás de um nó de prioride menor.
    * ● Ao inserir na fila deve-se organizar a fila a fim de obedecer as regras anteriores.
*/

public class DinamicQueue {
    private No first;
    private No last;
    private int size;

    public DinamicQueue() {
        this.first = new No(-1, null);
        this.last = new No(-1, null);
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int value, FilaPrioridade prioridade) {
        No newNo = new No(value, prioridade);

        if(isEmpty()) {
            this.last.setNoProximo(newNo);
            this.first.setNoProximo(newNo);
        }
        else {
            No pointer = this.first.getNoProximo();

            if(prioridade.equals(FilaPrioridade.ALTA)) {

                while(pointer.getPrioridade().equals(FilaPrioridade.ALTA)) {
                    pointer = pointer.getNoProximo();
                }

                newNo.setNoProximo(pointer.getNoProximo());
                pointer.setNoProximo(newNo);
            }

            else if(prioridade.equals(FilaPrioridade.MEDIA)) {

                while(pointer.getPrioridade().equals(FilaPrioridade.ALTA)
                || pointer.getPrioridade().equals(FilaPrioridade.MEDIA)) {
                    pointer = pointer.getNoProximo();
                }

                newNo.setNoProximo(pointer.getNoProximo());
                pointer.setNoProximo(newNo);
            }

            if(prioridade.equals(FilaPrioridade.BAIXA) || newNo.getNoProximo() == null) {
                this.last.getNoProximo().setNoProximo(newNo);
                this.last.setNoProximo(newNo);
            }
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
