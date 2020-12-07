package exercicio01;

public abstract class Pessoa {
    protected String nome;
    protected Data nascimento;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    abstract void imprimeDados();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
}
