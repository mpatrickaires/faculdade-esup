package modelo.produtos.relogio;

import modelo.produtos.CategoriaProduto;
import modelo.produtos.Produto;

public class Relogio extends Produto {
    private String marca;
    private TipoRelogio tipo;

    public Relogio(int codigo, String descricao, double preco, String marca, TipoRelogio tipo) {
        super(codigo, descricao, preco, CategoriaProduto.RELOGIO);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoRelogio getTipo() {
        return tipo;
    }

    public void setTipo(TipoRelogio tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Relogio{" +
                "marca='" + marca + '\'' +
                ", tipo=" + tipo +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria=" + categoria +
                '}';
    }
}
