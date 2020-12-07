package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private int qtdAtual;
    private List<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();

    public void cadastraPessoa(Pessoa pess) {
        this.pessoasCadastradas.add(pess);
        this.qtdAtual = pessoasCadastradas.size();
    }

    public void imprimeCadastro() {
        System.out.println("Quantidade de pessoas cadastradas: " + qtdAtual);
        System.out.println("===============================================");
        for(Pessoa pessoa : pessoasCadastradas) {
            pessoa.imprimeDados();
            System.out.println("------------------------------------");
        }
    }
}
