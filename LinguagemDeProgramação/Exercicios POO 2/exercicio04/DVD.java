package exercicio04;

public class DVD extends Produto {
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", duracao=" + duracao +
                '}';
    }


}
