package questao3;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private List<Aluno> listaDeAlunos;
    private String horario;
    private DiaDaSemana dia;

    public Turma(int codigo, Disciplina disciplina, String horario, DiaDaSemana dia) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.horario = horario;
        this.dia = dia;
        this.listaDeAlunos = new ArrayList<Aluno>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public DiaDaSemana getDia() {
        return dia;
    }

    public void setDia(DiaDaSemana dia) {
        this.dia = dia;
    }
}
