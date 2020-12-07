package exercicio04;

public class CD extends Produto {
    private int numeroDeFaixas;

    public CD(String nome, double preco, int numeroDeFaixas) {
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    private int getNumeroDeFaixas() {
        return this.numeroDeFaixas;
    }

    private void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public String toString() {
        return "CD{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", numeroDeFaixas=" + numeroDeFaixas +
                '}';
    }
}
