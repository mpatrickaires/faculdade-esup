package stack;

public class StaticStackString {
    private int top;
    private String stack[];
    private int size;

    public StaticStackString(int size) {
        this.stack = new String[size];
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

    public String peek() {
        if(isEmpty()) {
            System.out.println("Pilha vazia. Não é possível retornar o topo.");
            return "";
        }
        return this.stack[this.top];
    }

    public void push(String palavra) {
        if(isFull()) {
            System.out.println("Pilha cheia. Não é possível empilhar.");
            return;
        }
        this.top++;
        this.stack[top] = palavra;
    }

    public String pop() {
        if(isEmpty()) {
            System.out.println("Pilha vazia. Não é possível desempilhar");
            return "";
        }
        String palavra = this.stack[this.top];
        this.top--;
        return palavra;
    }

    public void print() {
        for(String elemento: stack) {
            System.out.println(elemento);
        }
    }
}
