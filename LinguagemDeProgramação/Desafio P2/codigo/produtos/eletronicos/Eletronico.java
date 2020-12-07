package desafiop2.produtos.eletronicos;

import desafiop2.produtos.CategoriaProdutos;
import desafiop2.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Eletronico extends Produto {
    private String fabricante;
    private List<String> componentes;

    public Eletronico(String nome, double precoDeCompra, CategoriaProdutos categoriaProduto, String fabricante) {
        super(nome, precoDeCompra, categoriaProduto);
        this.fabricante = fabricante;
        this.componentes = new ArrayList<String>();
    }

    @Override
    public void calcularPrecoDeVenda() {
        double precoDeVenda = this.precoDeCompra * 2.10;

        if(this.promocaoAtiva) {
            precoDeVenda = precoDeVenda - (precoDeVenda * 0.1);
        }

        this.precoDeVenda = precoDeVenda;
    }

    public void adicionarComponente(String componente) {
        this.componentes.add(componente);
    }


    public String getMarcaFabricante() {
        return fabricante;
    }

    public void setMarcaFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public List<String> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<String> componentes) {
        this.componentes = componentes;
    }
}
