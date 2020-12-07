package modelo.venda;

import modelo.carrinho.Carrinho;
import modelo.usuario.Endereco;
import modelo.usuario.Usuario;

import java.util.Random;

public class Venda {
    private Usuario usuario;
    private int codigo;
    private Endereco enderecoEntrega;
    private Carrinho carrinho;
    private double valorTotal;
    private StatusVenda status;

    public Venda(Usuario usuario, Endereco enderecoEntrega, Carrinho carrinho, double valorTotal) {
        this.usuario = usuario;
        setCodigo();
        this.enderecoEntrega = enderecoEntrega;
        this.carrinho = carrinho;
        this.valorTotal = carrinho.getValorTotal();
        this.status = StatusVenda.AGUARDANDO;
    }

    public void confirmarEntrega() {
        this.status = StatusVenda.FINALIZADA;
    }

    public void informacoesVenda() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Comprador: " + this.usuario.getNome());
        System.out.println("Endereço de Entrega: " + this.enderecoEntrega.getLogradouro() +
                ", " + this.enderecoEntrega.getBairro() + ", " + this.enderecoEntrega.getCidade() +
                " - " + this.enderecoEntrega.getEstado());
        System.out.println("----- Produtos -----");
        this.carrinho.printarProdutos();
        System.out.println("--------------------");
        System.out.printf("Valor Total: R$%.2f\n", this.valorTotal);
    }

    public int getCodigo() {
        return codigo;
    }

    private void setCodigo() {
        Random random = new Random();
        int codigo = random.nextInt(9999);
        for(Venda venda : this.usuario.getCompras()) {
            while(codigo == venda.getCodigo()) {
                codigo = random.nextInt(9999);
            }
        }

        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusVenda getStatus() {
        return status;
    }

    public void setStatus(StatusVenda status) {
        this.status = status;
    }
}
