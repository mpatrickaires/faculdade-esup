package exercicio02;

public class Invoice {
    private int numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Invoice(int numero, String descricao, int quantidade, int preco) {
        this.numero = numero;
        this.descricao = descricao;

        if(quantidade < 0) {
            this.quantidade = 0;
        }
        else {
            this.quantidade = quantidade;
        }

        if(preco < 0) {
            this.preco = 0;
        }
        else {
            this.preco = preco;
        }
    }

    public double getInvoiceAmount() {
        return this.preco * this.quantidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
