package modelo.produtos.dvd;

import modelo.produtos.CategoriaProduto;
import modelo.produtos.Produto;

public abstract class DVD extends Produto {

    public DVD(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco, CategoriaProduto.DVD);
    }
}
