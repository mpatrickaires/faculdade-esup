package exercicio01;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, int codigo) {
        super(nome);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Cliente");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.nascimento.toString());
        System.out.println("Código: " + this.codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
