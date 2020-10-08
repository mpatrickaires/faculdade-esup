package exercicio10;

public class Ingresso {
    private double preco;
    private Sessao sessao;

    public Ingresso(double preco, Sessao sessao) {
        this.preco = preco;
        this.sessao = sessao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
