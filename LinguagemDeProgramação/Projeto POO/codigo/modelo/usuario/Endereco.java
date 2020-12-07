package modelo.usuario;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;

    public Endereco(String cep, String estado, String cidade, String bairro, String logradouro) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public void informacoesEndereco() {
        System.out.println("CEP: " + this.cep);
        System.out.println("Estado: " + this.estado);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Logradouro: " + this.logradouro);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
