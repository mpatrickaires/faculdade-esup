package visualizacao;

import modelo.carrinho.Carrinho;
import modelo.carrinho.exception.RemoverProdutoCarrinhoException;
import modelo.produtos.Produto;
import modelo.usuario.Usuario;
import modelo.venda.StatusVenda;
import modelo.venda.Venda;
import visualizacao.exception.ComprasUsuarioAguardandoException;
import visualizacao.exception.FecharCarrinhoException;

import java.util.ArrayList;
import java.util.List;

public class MenuVendas {
    private Usuario usuarioAtual;
    private Carrinho carrinhoAtual;
    private MenuProdutos menuProdutos;
    private List<Venda> listaVendas;

    public MenuVendas(MenuProdutos menuProdutos) {
        this.menuProdutos = menuProdutos;
        this.usuarioAtual = null;
        this.carrinhoAtual = null;
        this.listaVendas = new ArrayList<>();
    }

    public void abrirCarrinho(Usuario usuario) {
        this.carrinhoAtual = new Carrinho(usuario);
    }

    public void fecharCarrinho() throws FecharCarrinhoException {
        if(this.carrinhoAtual.getProdutos().isEmpty()) {
            throw new FecharCarrinhoException();
        }

        Venda venda = this.carrinhoAtual.fecharCarrinho(this.usuarioAtual.getEnderecoEntrega());
        this.usuarioAtual.adicionarCompra(venda);
        this.carrinhoAtual = null;
    }

    public void cancelarCompra() {
        try {
            while(!this.carrinhoAtual.getProdutos().isEmpty()) {
                for (Produto produto : this.carrinhoAtual.getProdutos()) {
                    this.carrinhoAtual.removerProduto(produto.getCodigo());
                    break;
                }
            }

            this.carrinhoAtual = null;
        } catch(RemoverProdutoCarrinhoException removerProdutoCarrinhoException) {
            System.out.println(removerProdutoCarrinhoException.getMessage());
        }
    }

    public void comprasAguardandoUsuario() throws ComprasUsuarioAguardandoException {
        int qtdAberto = 0;
        for(Venda venda : this.usuarioAtual.getCompras()) {
            if(venda.getUsuario() == this.usuarioAtual && venda.getStatus().equals(StatusVenda.AGUARDANDO)) {
                qtdAberto++;
                venda.informacoesVenda();
                System.out.println("---------------------\n\n");
            }
        }

        if(qtdAberto == 0) {
            throw new ComprasUsuarioAguardandoException();
        }
    }

    public boolean validarCodigoCompra(int codigo) {
        for(Venda venda : this.usuarioAtual.getCompras()) {
            if(codigo == venda.getCodigo()) {
                return true;
            }
        }

        return false;
    }

    public void confirmarEntrega(int codigo) {
        for(Venda venda : this.usuarioAtual.getCompras()) {
            if(codigo == venda.getCodigo()) {
                venda.confirmarEntrega();
            }
        }
    }

    public Usuario getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(Usuario usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }

    public Carrinho getCarrinhoAtual() {
        return carrinhoAtual;
    }

    public MenuProdutos getMenuProdutos() {
        return this.menuProdutos;
    }
}
