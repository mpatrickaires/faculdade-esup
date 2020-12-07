package desafiop2.produtos.alimenticio;

import desafiop2.produtos.CategoriaProdutos;
import desafiop2.produtos.Produto;

public class Alimenticio extends Produto {
    private String validade;
    private String marcaFabricante;

    public Alimenticio(String nome, double precoDeCompra, CategoriaProdutos categoriaProduto,
                       String validade, String marcaFabricante) {
        super(nome, precoDeCompra, categoriaProduto);
        this.validade = validade;
        this.marcaFabricante = marcaFabricante;
    }

    @Override
    public void calcularPrecoDeVenda() {
        double precoDeVenda = this.precoDeCompra * 1.45;

        if(this.promocaoAtiva) {
            precoDeVenda = precoDeVenda - (precoDeVenda * 0.1);
        }

        this.precoDeVenda = precoDeVenda;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getMarcaFabricante() {
        return marcaFabricante;
    }

    public void setMarcaFabricante(String marcaFabricante) {
        this.marcaFabricante = marcaFabricante;
    }
}
