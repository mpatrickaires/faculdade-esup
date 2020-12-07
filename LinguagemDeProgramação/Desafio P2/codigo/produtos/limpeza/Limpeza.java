package desafiop2.produtos.limpeza;

import desafiop2.produtos.CategoriaProdutos;
import desafiop2.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Limpeza extends Produto {
    private List<String> composicaoQuimica;

    public Limpeza(String nome, double precoDeCompra, CategoriaProdutos categoriaProduto) {
        super(nome, precoDeCompra, categoriaProduto);
        composicaoQuimica = new ArrayList<String>();
    }

    @Override
    public void calcularPrecoDeVenda() {
        double precoDeVenda = this.precoDeCompra * 1.35;

        if(this.promocaoAtiva) {
            precoDeVenda = precoDeVenda - (precoDeVenda * 0.1);
        }

        this.precoDeVenda = precoDeVenda;
    }

    public void adicionarComposicao(String componente) {
        this.composicaoQuimica.add(componente);
    }

    public List<String> getComposicaoQuimica() {
        return composicaoQuimica;
    }

    public void setComposicaoQuimica(List<String> composicaoQuimica) {
        this.composicaoQuimica = composicaoQuimica;
    }
}
