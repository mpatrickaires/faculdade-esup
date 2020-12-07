package modelo.produtos;

public abstract class Produto implements MetodosProduto {
    protected int codigo;
    protected String descricao;
    protected double preco;
    protected int estoque;
    protected CategoriaProduto categoria;

    public Produto(int codigo, String descricao, double preco, CategoriaProduto categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = 0;
    }

    @Override
    public void adicionarEstoque() {
        this.estoque++;
    }

    @Override
    public void removerEstoque() {
        this.estoque--;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }
}
