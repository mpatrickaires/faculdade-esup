package questao3;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, Genero genero, int matricula) {
        this.nome = nome;
        this.genero = genero;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
