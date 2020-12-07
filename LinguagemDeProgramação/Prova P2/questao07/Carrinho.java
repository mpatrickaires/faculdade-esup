package questao07;

import questao07.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> listaProdutos;
    private double valorTotal;
    private Usuario usuario;
    private boolean ativo;

    public Carrinho(Usuario usuario) {
        this.usuario = usuario;
        this.valorTotal = 0;
        this.ativo = true;
        this.listaProdutos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        this.listaProdutos.add(produto);
        this.valorTotal += produto.getPrecoDeVenda();
    }

    public void removerProduto(String nome) {
        for(Produto produto : this.listaProdutos) {
            if(produto.getNome().equals(nome)) {
                this.valorTotal -= produto.getPrecoDeVenda();
                this.listaProdutos.remove(produto);
                return;
            }
        }

        System.out.println("Produto não encontrado no carrinho! Impossível efetuar a remoção.");
    }

    public void finalizarCompra() {
        for(Produto produto : listaProdutos) {
            produto.incrementarVenda();
        }
        this.ativo = false;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
