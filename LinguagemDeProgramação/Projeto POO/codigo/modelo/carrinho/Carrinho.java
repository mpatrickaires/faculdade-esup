package modelo.carrinho;

import modelo.carrinho.exception.AdicionarProdutoException;
import modelo.carrinho.exception.RemoverProdutoCarrinhoException;
import modelo.produtos.Produto;
import modelo.usuario.Endereco;
import modelo.usuario.Usuario;
import modelo.venda.Venda;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private Usuario usuario;
    private boolean aberto;
    private List<Produto> produtos;
    private double valorTotal;

    public Carrinho(Usuario usuario) {
        this.usuario = usuario;
        this.aberto = true;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarProduto(Produto produto) throws AdicionarProdutoException {
        if(produto.getEstoque() == 0) {
            throw new AdicionarProdutoException();
        }

        this.produtos.add(produto);
        produto.removerEstoque();
        calcularValorTotal();
    }

    public void removerProduto(int codigo) throws RemoverProdutoCarrinhoException {
        if(quantidadeProdutos() == 0) {
            throw new RemoverProdutoCarrinhoException();
        }

        for(Produto produto : this.produtos) {
            if(produto.getCodigo() == codigo) {
                this.produtos.remove(produto);
                produto.adicionarEstoque();
                calcularValorTotal();
                return;
            }
        }

        throw new RemoverProdutoCarrinhoException();
    }

    public void calcularValorTotal() {
        this.valorTotal = 0;
        for(Produto produto : this.produtos) {
            this.valorTotal += produto.getPreco();
        }
    }

    public Venda fecharCarrinho(Endereco enderecoEntrega) {
        this.aberto = false;

        return new Venda(this.usuario, enderecoEntrega, this, this.valorTotal);
    }

    public int quantidadeProdutos() {
        return this.produtos.size();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void printarProdutos() {
        for(Produto produto : this.produtos) {
            System.out.printf("[%d] -> %s -- R$ %.2f\n",
                    produto.getCodigo(), produto.getDescricao(), produto.getPreco());
        }
    }

    public void visualizarCarrinho() {
        System.out.println("=====| CARRINHO |=====");
        System.out.println("Usuário: " + this.usuario.getNome());
        System.out.println("Aberto: " + this.aberto);
        System.out.println("----- PRODUTOS -----");
        printarProdutos();
        System.out.println("--------------------");
        System.out.println("Valor Total: R$" + this.valorTotal);
    }
}
