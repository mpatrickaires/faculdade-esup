package exercicio01;

public class TestaCadastro {
    /*
    * 01 - Implemento o seguinte diagrama:
    * ----- VERIFICAR ANEXO NA LISTA -----
    */

    public static void main(String[] args) {
        // CLIENTE
        Cliente cliente = new Cliente("Beatriz Mendes", 12345);
        cliente.setNascimento(new Data(05, 12, 1998));

        // FUNCIONÁRIO
        Funcionario funcionario = new Funcionario("Roberto Pereira", 1500);
        funcionario.setNascimento(new Data(13, 07, 1990));

        // GERENTE
        Gerente gerente = new Gerente("Claúdia Marinho", 3800, "Vendas");
        gerente.setNascimento(new Data(20, 02, 1984));

        // CADASTRO DE PESSOAS
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        cadastroPessoas.cadastraPessoa(cliente);
        cadastroPessoas.cadastraPessoa(funcionario);
        cadastroPessoas.cadastraPessoa(gerente);
        cadastroPessoas.imprimeCadastro();
    }
}
