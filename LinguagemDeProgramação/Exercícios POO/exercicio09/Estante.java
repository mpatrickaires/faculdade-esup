package exercicio09;

import java.util.ArrayList;
import java.util.List;

public class Estante {
    private List<Livro> acervo;

    public Estante() {
        acervo = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
        livro.setLido(false);
    }

    /*
    * Como no enunciado não está especificado o tipo de retorno dos métodos de buscar livro pelo título ou autor,
    * coloquei para esses dois métodos serem void e simplesmente printarem o toString do livro buscado.
    * Caso o livro não seja encontrado, é printado uma mensagem dizendo que o livro não foi encontrado.
    * No caso da busca do livro pelo autor, é printado o toString de todos os livros com esse determinado autor.
    */

    public void buscarLivroTitulo(String titulo) {
        for(Livro livro : this.acervo) {
            if(livro.getTitulo().equals(titulo)) {
                livro.informacoes();
                return;
            }
        }
        System.out.println("Esse título não existe na estante! Impossível mostrar suas informações.");
    }

    public void buscarLivroAutor(Autor autorParametro) {
        List<Livro> livrosDoAutor = new ArrayList<Livro>();

        for(Livro livro : this.acervo) {

            for(Autor autor : livro.getAutores()) {
                if(autor.getNome().equals(autorParametro.getNome())) {
                    livrosDoAutor.add(livro);
                    break;
                }
            }
        }

        if(!livrosDoAutor.isEmpty()) {
            for(Livro livro : livrosDoAutor) {
                livro.informacoes();
            }
            return;
        }

        System.out.println("Não existe livro desse autor na estante! Impossível mostrar suas informações.");
    }

    public void lerLivro(Livro livroParametro) {
        for(Livro livro : this.acervo) {
            if(livro == livroParametro) {
                livro.setLido(true);
                return;
            }
        }

        System.out.println("Esse livro não existe na estante! Impossível marca-lo como lido.");
    }

    public int quantidadeLido() {
        int lidos = 0;

        for(Livro livro : this.acervo) {
            if(livro.isLido()) {
                lidos++;
            }
        }

        return lidos;
    }

    public int quantidadeNaoLidos() {
        int naoLidos = 0;

        for(Livro livro : this.acervo) {
            if(!livro.isLido()) {
                naoLidos++;
            }
        }

        return naoLidos;
    }
}
