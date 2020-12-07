package modelo.commerce;

import modelo.commerce.exception.*;
import modelo.produtos.CategoriaProduto;
import modelo.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Commerce {
    private List<Produto> listaProdutos;

    public Commerce() {
        listaProdutos = new ArrayList<>();
    }

    public void adicionarNovoProduto(Produto produto) throws CodigoJaExistenteException {
        for(Produto produtoNaLista : this.listaProdutos) {
            if(produtoNaLista.getCodigo() == produto.getCodigo()) {
                throw new CodigoJaExistenteException();
            }
        }

        this.listaProdutos.add(produto);
    }

    public void removerProduto(int codigo) throws RemoverProdutoException {
        for(Produto produto : this.listaProdutos) {
            if(produto.getCodigo() == codigo) {
                this.listaProdutos.remove(produto);
                return;
            }
        }

        throw new RemoverProdutoException();
    }

    public void aumentarEstoqueProduto(int codigo) throws AlterarEstoqueException {
        for(Produto produto : this.listaProdutos) {
            if(produto.getCodigo() == codigo) {
                produto.adicionarEstoque();
                return;
            }
        }

        throw new AlterarEstoqueException();
    }

    public Produto buscarProduto(int codigo) throws BuscarProdutoException {
        for(Produto produto : this.listaProdutos) {
            if(produto.getCodigo() == codigo) {
                return produto;
            }
        }

        throw new BuscarProdutoException();
    }

    public void printarProdutos() {
        List<Produto> livros = new ArrayList<>();
        List<Produto> relogios = new ArrayList<>();
        List<Produto> perfumes = new ArrayList<>();
        List<Produto> dvds = new ArrayList<>();

        for(Produto produto : this.listaProdutos) {
            if(produto.getCategoria() == CategoriaProduto.LIVRO) {
                livros.add(produto);
            }

            else if(produto.getCategoria() == CategoriaProduto.RELOGIO) {
                relogios.add(produto);
            }

            else if(produto.getCategoria() == CategoriaProduto.PERFUME) {
                perfumes.add(produto);
            }

            else {
                dvds.add(produto);
            }
        }

        System.out.println("----- LIVROS -----");
        printarCategoria(livros);

        System.out.println("\n----- RELÓGIOS -----");
        printarCategoria(relogios);

        System.out.println("\n----- PERFUMES -----");
        printarCategoria(perfumes);

        System.out.println("\n----- DVDs -----");
        printarCategoria(dvds);
    }

    private void printarCategoria(List<Produto> produtosCategoria) {
        for(Produto produto : produtosCategoria) {
            System.out.printf("[%s] -> %s - R$%.2f -- Estoque: %d\n",
                    produto.getCodigo(), produto.getDescricao(), produto.getPreco(), produto.getEstoque());
        }
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }
}
