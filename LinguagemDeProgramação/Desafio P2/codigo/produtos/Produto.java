package desafiop2.produtos;

public abstract class Produto implements MetodosProdutos {
    protected String nome;
    protected String descricao;
    protected double precoDeCompra;
    protected double precoDeVenda;
    protected CategoriaProdutos categoriaProduto;
    protected int quantidadeVendidos;
    protected boolean promocaoAtiva;

    public Produto(String nome, double precoDeCompra, CategoriaProdutos categoriaProduto) {
        this.nome = nome;
        this.precoDeCompra = precoDeCompra;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeVendidos = 0;
        this.promocaoAtiva = false;
        calcularPrecoDeVenda();
    }

    @Override
    public double calcularValorTotalVendas() {
        return this.quantidadeVendidos * this.precoDeVenda;
    }

    @Override
    public double calcularValorTotalCompras() {
        return this.quantidadeVendidos * this.precoDeCompra;
    }

    @Override
    public void incrementarVenda() {
        this.quantidadeVendidos++;
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

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public CategoriaProdutos getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProdutos categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public int getQuantidadeVendidos() {
        return quantidadeVendidos;
    }

    public void setQuantidadeVendidos(int quantidadeVendidos) {
        this.quantidadeVendidos = quantidadeVendidos;
    }

    public boolean isPromocaoAtiva() {
        return promocaoAtiva;
    }

    public void setPromocaoAtiva(boolean promocaoAtiva) {
        this.promocaoAtiva = promocaoAtiva;
        calcularPrecoDeVenda();
    }
}
