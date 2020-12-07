package modelo.produtos.livro;

import modelo.produtos.CategoriaProduto;
import modelo.produtos.Produto;

public class Livro extends Produto {
    private String autor;
    private Genero genero;

    public Livro(int codigo, String descricao, double preco, String autor, Genero genero) {
        super(codigo, descricao, preco, CategoriaProduto.LIVRO);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", genero=" + genero +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria=" + categoria +
                '}';
    }
}
