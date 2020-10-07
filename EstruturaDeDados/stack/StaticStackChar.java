package stack;

public class StaticStackChar {
    private int top;
    private char stack[];
    private int size;

    public StaticStackChar(int size) {
        this.stack = new char[size];
        this.top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public int length() {
        return this.size;
    }

    public char peek() {
        if(isEmpty()) {
            System.out.println("Pilha vazia. Não é possível retornar o topo.");
            return 0;
        }
        return this.stack[this.top];
    }

    public void push(char letra) {
        if(isFull()) {
            System.out.println("Pilha cheia. Não é possível empilhar.");
            return;
        }
        this.top++;
        this.stack[top] = letra;
    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("Pilha vazia. Não é possível desempilhar");
            return 0;
        }
        char letra = this.stack[this.top];
        this.top--;
        return letra;
    }

    public void print() {
        for(int elemento: stack) {
            System.out.println(elemento);
        }
    }
}
