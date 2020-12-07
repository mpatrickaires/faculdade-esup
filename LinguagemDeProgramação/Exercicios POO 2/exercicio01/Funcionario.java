package exercicio01;

public class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, float salario) {
        super(nome);
        this.salario = salario;
    }

    public float calculaImposto() {
        return (float) (this.salario * 0.03);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Funcionário");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.nascimento.toString());
        System.out.println("Salário: R$" + this.salario);
    }
}
