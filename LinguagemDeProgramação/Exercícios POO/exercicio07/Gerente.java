package exercicio07;

public class Gerente extends Empregado {
    private String departamento;

    public Gerente(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + this.getNome() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }
}
