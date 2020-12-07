package exercicio04;

public abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getPreco() {
        return this.preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }
}
