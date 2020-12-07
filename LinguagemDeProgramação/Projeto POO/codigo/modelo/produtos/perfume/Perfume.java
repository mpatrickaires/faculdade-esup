package modelo.produtos.perfume;

import modelo.produtos.CategoriaProduto;
import modelo.produtos.Produto;

public class Perfume extends Produto {
    private String marca;
    private int quantidade;

    public Perfume(int codigo, String descricao, double preco, String marca, int quantidade) {
        super(codigo, descricao, preco, CategoriaProduto.PERFUME);
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "marca='" + marca + '\'' +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria=" + categoria +
                '}';
    }
}
