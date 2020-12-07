package desafiop2.produtos.livros;

import desafiop2.produtos.CategoriaProdutos;
import desafiop2.produtos.Produto;

public class Livro extends Produto {
    private String editora;
    private String autor;
    private CategoriaLivro categoriaLivro;
    private FormatoLivro formatoLivro;

    public Livro(String nome, double precoDeCompra, CategoriaProdutos categoriaProdutos,
                 String autor, String editora, CategoriaLivro categoriaLivro) {
        super(nome, precoDeCompra, categoriaProdutos);
        this.autor = autor;
        this.editora = editora;
        this.categoriaLivro = categoriaLivro;
    }

    @Override
    public void calcularPrecoDeVenda() {
        double precoDeVenda = this.precoDeCompra * 1.8;

        if(promocaoAtiva) {
            precoDeVenda = precoDeVenda - (precoDeVenda * 0.1);
        }

        this.precoDeVenda = precoDeVenda;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public CategoriaLivro getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(CategoriaLivro categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public FormatoLivro getFormatoLivro() {
        return formatoLivro;
    }

    public void setFormatoLivro(FormatoLivro formatoLivro) {
        this.formatoLivro = formatoLivro;
    }
}
