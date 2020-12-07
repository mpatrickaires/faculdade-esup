package modelo.produtos.dvd;

public class Filme extends DVD {
    private String diretor;
    private int anoLancamento;

    public Filme(int codigo, String descricao, double preco, String diretor, int anoLancamento) {
        super(codigo, descricao, preco);
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "diretor='" + diretor + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria=" + categoria +
                '}';
    }
}
