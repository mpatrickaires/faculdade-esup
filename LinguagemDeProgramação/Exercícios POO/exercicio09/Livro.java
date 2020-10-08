package exercicio09;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private int paginas;
    private Genero genero;
    private Editora editora;
    private boolean lido;
    private List<Autor> autores;

    public Livro(String titulo, int paginas, Genero genero, Editora editora) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.genero = genero;
        this.editora = editora;
        this.lido = false;
        this.autores = new ArrayList<Autor>();
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void informacoes() {
        int numeroAutores = 0;
        System.out.print("Título: " + this.titulo +
                ", Páginas: " + this.paginas +
                ", Genero: " + this.genero +
                ", Editora: " + this.editora.getNome() +
                ", Lido: " + this.lido +
                ", Autores: ");

        System.out.print("[");
        for(Autor autor : this.autores) {
            System.out.print(autor.getNome());
            numeroAutores++;
            if(autores.size() > 1 && numeroAutores < autores.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
