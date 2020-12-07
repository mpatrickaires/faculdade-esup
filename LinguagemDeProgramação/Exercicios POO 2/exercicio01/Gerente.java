package exercicio01;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, float salario, String area) {
        super(nome, salario);
        this.area = area;
    }

    public float calculaImposto() {
        return (float) (this.salario * 0.05);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Gerente");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.nascimento.toString());
        System.out.println("Área: " + this.area);
    }
}
