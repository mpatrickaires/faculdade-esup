package questao01.funcionario;

import questao01.endereco.Endereco;

import java.util.Date;

public class Funcionario {
    private String nome;
    private Date nascimento;
    private String cpf;
    private Endereco enderecos;

    public Funcionario(String nome, Date nascimento, String cpf, Endereco enderecos) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Endereco getEnderecos() {
        return this.enderecos;
    }
}
