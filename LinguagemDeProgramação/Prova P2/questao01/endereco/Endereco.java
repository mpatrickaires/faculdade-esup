package questao01.endereco;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private Cidade cidade;

    public Endereco(String rua, int numero, String bairro, String cep, Cidade cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }
}
