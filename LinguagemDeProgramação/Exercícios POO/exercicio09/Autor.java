package exercicio09;

public class Autor {
    private String endereco;
    private String nome;
    private String email;

    public Autor(String endereco, String nome, String email) {
        this.endereco = endereco;
        this.nome = nome;
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
