package questao01.funcionario.vendedor;

import questao01.endereco.Endereco;
import questao01.funcionario.Funcionario;

import java.util.Date;

public class Vendedor extends Funcionario {
    private EquipeVenda equipe;

    public Vendedor(String nome, Date nascimento, String cpf, Endereco enderecos, EquipeVenda equipe) {
        super(nome, nascimento, cpf, enderecos);
        this.equipe = equipe;
    }

    public float getSalario() {
        return 3500;
    }
}
