package questao01.funcionario.gerente;

import questao01.endereco.Endereco;
import questao01.funcionario.Funcionario;

import java.util.Date;

public class Gerente extends Funcionario {

    public Gerente(String nome, Date nascimento, String cpf, Endereco enderecos) {
        super(nome, nascimento, cpf, enderecos);
    }

    /*
     * No diagrama de classes da prova, o getSalario do gerente está como void, porém tomei a liberdade de colocar
     * o retorno como float para que o código não tenha erros.
     */
    public float getSalario() {
        return 4500;
    }
}
