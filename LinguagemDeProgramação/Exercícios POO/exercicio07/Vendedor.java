package exercicio07;

public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(double salario, double comissao) {
        this.salario = salario;
        this.comissao = comissao;
    }

    public float calcularSalario() {
        return (float) (this.salario + (this.salario * this.comissao));
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + this.getNome() + '\'' +
                ", salário sem comissão=" + salario +
                ", salario com comissão=" + calcularSalario() +
                ", percentual de comissão=" + this.comissao +
                '}';
    }
}
