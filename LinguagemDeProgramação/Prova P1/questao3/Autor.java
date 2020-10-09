package questao3;

public class Autor extends Pessoa {
    private int codigo;

    public Autor(String nome, Genero genero, int codigo) {
        this.nome = nome;
        this.genero = genero;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
