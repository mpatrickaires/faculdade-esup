package exercicio06;

public class Hospede {
    private String nome;
    private String cpf;
    private Genero genero;
    private String telefone;

    public Hospede(String nome, String cpf, Genero genero, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.telefone = telefone;
    }
}
