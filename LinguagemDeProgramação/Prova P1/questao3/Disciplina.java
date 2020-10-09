package questao3;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String descricao;
    private List<Livro> livros;

    public Disciplina(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
