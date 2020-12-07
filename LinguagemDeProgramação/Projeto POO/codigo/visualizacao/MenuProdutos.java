package visualizacao;

import modelo.commerce.Commerce;
import modelo.commerce.exception.BuscarProdutoException;
import modelo.produtos.Produto;

public class MenuProdutos {
    private Commerce commerce;

    public MenuProdutos(Commerce commerce) {
        this.commerce = commerce;
    }

    public void printarProdutos() {
        commerce.printarProdutos();
    }

    public void buscarProduto(int codigo) {
        try {

            System.out.println(commerce.buscarProduto(codigo).toString());

        } catch(BuscarProdutoException buscarProdutoException) {
            System.out.println(buscarProdutoException.getMessage());
        }
    }

    public Produto retornarProduto(int codigo) throws BuscarProdutoException {
        return commerce.buscarProduto(codigo);
    }
}
