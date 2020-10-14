package questao04;

public class StaticStack {
    private int top;
    private int stack[];
    private int size;

    public StaticStack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.size -1;
    }

    public int length() {
        return this.size;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Pilha vazia. Não é possível retornar o topo.");
            return 0;
        }
        return this.stack[this.top];
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Pilha cheia! Não é possível empilhar novo item");;
        }
        this.top++;
        this.stack[top] = value;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Pilha vazia! Não é possível desempilhar novo item.");
            return -1;
        }
        int numero = this.stack[this.top];
        this.top--;
        return numero;
    }

    public void print() {
        for(int elemento: stack) {
            System.out.println(elemento);
        }
    }
}
