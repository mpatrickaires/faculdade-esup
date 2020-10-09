package questao1;

public class Filme {
    private String nome;
    private String descricao;
    private int duracaoMinutos;
    private int anoLancamento;
    private double preco;
    private TipoFilme tipoFilme;
    private CategoriaFilme categoriaFilme;

    public Filme(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoFilme getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(TipoFilme tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public CategoriaFilme getCategoriaFilme() {
        return categoriaFilme;
    }

    public void setCategoriaFilme(CategoriaFilme categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }
}
