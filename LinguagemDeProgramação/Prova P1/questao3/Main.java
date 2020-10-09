package questao3;

public class Main {

    public static void main(String[] args) {
        // AUTORES
        Autor autor1 = new Autor("Leandro", Genero.MASCULINO, 1837);
        Autor autor2 = new Autor("Flávia", Genero.FEMININO, 3586);
        Autor autor3 = new Autor("Luciana", Genero.FEMININO, 8016);


        // LIVROS
        Livro livro1 = new Livro("Geografia Ensino Médio", autor1);
        Livro livro2 = new Livro("Geografia Ensino Fundamental", autor1);
        Livro livro3 = new Livro("Matemática Básica", autor2);
        Livro livro4 = new Livro("Fundamentos da Biologia", autor3);


        // DISCIPLINAS
        Disciplina disciplina1 = new Disciplina("Geografia");
        disciplina1.getLivros().add(livro1);
        disciplina1.getLivros().add(livro2);

        Disciplina disciplina2 = new Disciplina("Matemática");
        disciplina2.getLivros().add(livro3);

        Disciplina disciplina3 = new Disciplina("Biologia");
        disciplina3.getLivros().add(livro4);


        // PROFESSORES
        Professor professor1 = new Professor("Adalberto", Genero.MASCULINO, 6575, Titulo.MESTRE);
        professor1.getDisciplinas().add(disciplina1);
        professor1.getDisciplinas().add(disciplina3);

        Professor professor2 = new Professor("Regina", Genero.FEMININO, 2024, Titulo.ESPECIALISTA);
        professor2.getDisciplinas().add(disciplina2);

        Professor professor3 = new Professor("Josias", Genero.MASCULINO, 9351, Titulo.DOUTOR);
        professor3.getDisciplinas().add(disciplina2);


        // ALUNOS
        Aluno aluno1 = new Aluno("Márcia", Genero.FEMININO, 56469);
        Aluno aluno2 = new Aluno("Roberto", Genero.MASCULINO, 67072);
        Aluno aluno3 = new Aluno("Sérgio", Genero.MASCULINO, 44420);


        // TURMAS
        Turma turma1 = new Turma(48040, disciplina1, "07:00", DiaDaSemana.SEGUNDA);
        turma1.getListaDeAlunos().add(aluno1);
        turma1.getListaDeAlunos().add(aluno2);
        turma1.getListaDeAlunos().add(aluno3);

        Turma turma2 = new Turma(12552, disciplina2, "09:00", DiaDaSemana.QUARTA);
        turma2.getListaDeAlunos().add(aluno1);
        turma2.getListaDeAlunos().add(aluno3);

        Turma turma3 = new Turma(66811, disciplina3, "10:30", DiaDaSemana.TERCA);
        turma3.getListaDeAlunos().add(aluno2);
        turma3.getListaDeAlunos().add(aluno3);
    }
}
