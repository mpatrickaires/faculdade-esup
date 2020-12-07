package modelo.usuario;

import modelo.venda.Venda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private List<Endereco> enderecos;
    private Endereco enderecoEntrega;
    private List<Venda> compras;
    private String senha;

    public Usuario(String nome, String cpf, String dataNascimento,  String senha, Endereco endereco) {
        this.nome = nome;

        this.cpf = cpf;

        this.dataNascimento = dataNascimento;

        this.enderecos = new ArrayList<>();
        this.enderecos.add(endereco);

        this.enderecoEntrega = endereco;

        this.compras = new ArrayList<>();

        this.senha = senha;
    }

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void definirEnderecoEntrega(Endereco endereco) {
        this.enderecoEntrega = endereco;
    }

    public void informacoesConta() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Senha: " + this.senha);
        System.out.println("Endereço de Entrega: " + this.enderecoEntrega.getLogradouro() +
                ", " + this.enderecoEntrega.getBairro() + ", " + this.enderecoEntrega.getCidade() +
                " - " + this.enderecoEntrega.getEstado());

        int numeroEndereco = 1;
        System.out.println("\n----- Endereços -----");
        for(Endereco endereco : this.enderecos) {
            System.out.println("Endereço " + numeroEndereco);
            endereco.informacoesEndereco();
            System.out.println("---------------------");
            numeroEndereco++;
        }
    }

    public void adicionarCompra(Venda compra) {
        this.compras.add(compra);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public Endereco getEnderecoEntrega() {
        return this.enderecoEntrega;
    }

    public List<Venda> getCompras() {
        return this.compras;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }


}
