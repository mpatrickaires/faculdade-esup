package questao3;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private int registro;
    private Titulo titulo;
    private List<Disciplina> disciplinas;

    public Professor(String nome, Genero genero, int registro, Titulo titulo) {
        this.nome = nome;
        this.genero = genero;
        this.registro = registro;
        this.titulo = titulo;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
