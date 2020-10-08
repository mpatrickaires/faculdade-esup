package exercicio09;

public class Main {
    /*
    * 09 - Escreva um diagrama de classes e implemente em linguagem Java o seguinte
    * cenário: o seu programa deve contemplar uma estantes de livros:
    *
    *     a. um livro tem titulo, quantidade de páginas, possui um assunto que deve ser
    *     criado como enum (exemplos de enum: ficção, fantasia, terror, suspense,
    *     direito), é vinculado a uma editora, e um valor lógico (booleano) que diz se foi
    *     lido ou não.
    *
    *     b. Editora tem nome, endereco.
    *
    *     c. O livro é vinculado a um ou vários autores, autores, possui endereco, nome, email.
    *
    *     d. Uma estante possui um acervo (lista) de livros. A partir dos métodos de
    *     estante, você pode adicionar novos livros, ao adicionar um novo livro, ele está
    *     marcado como não lido, pode buscar um livro pelo título ou autor, pode
    *     marcar um livro como lido, ainda obter a quantidade de livros lidos e
    *     quantidade de livros não lidos.
    *
    *     e. Crie uma classe main que teste os seus objetos.
    */

    public static void main(String[] args) {
        Editora editora1 = new Editora("Andromeda", "São Paulo");
        Editora editora2 = new Editora("Arqueiro", "Goiás");

        Autor autor1 = new Autor("Minas Gerais", "Antônio Roberto", "antonioroberto@gmail.com");
        Autor autor2 = new Autor("Minas Gerais", "Thaís Marinho", "thaismarinho@hotmail.com");
        Autor autor3 = new Autor("Pernambuco", "Pedro Antônio", "pedroantonio@bol.com.br");

        Livro livro1 = new Livro("Fundamentos Do Direito Penal", 800, Genero.DIREITO, editora1);
        livro1.adicionarAutor(autor1);
        livro1.adicionarAutor(autor2);

        Livro livro2 = new Livro("As Crônicas Do Advogado", 320, Genero.FANTASIA, editora2);
        livro2.adicionarAutor(autor1);

        Livro livro3 = new Livro("Como Sobreviver No Espaço", 400, Genero.FICCAO, editora2);
        livro3.adicionarAutor(autor3);

        Estante estante = new Estante();

        estante.adicionarLivro(livro1);
        estante.adicionarLivro(livro2);

        estante.lerLivro(livro1);

        System.out.println("------ BUSCANDO LIVRO PELO TÍTULO 'Fundamentos Do Direito Penal' -----");
        estante.buscarLivroTitulo("Fundamentos Do Direito Penal");

        System.out.println("\n------ BUSCANDO LIVRO PELO TÍTULO 'Como Sobreviver No Espaço' -----");
        estante.buscarLivroTitulo("Como Sobreviver No Espaço");


        System.out.println("\n------ BUSCANDO LIVRO PELO AUTOR1 -----");
        estante.buscarLivroAutor(autor1);

        System.out.println("\n------ BUSCANDO LIVRO PELO AUTOR3 -----");
        estante.buscarLivroAutor(autor3);

        System.out.println("\n---------------------------------------");
        System.out.println("Quantidade de livros lidos: " + estante.quantidadeLido());

        System.out.println("\n---------------------------------------");
        System.out.println("Quantidade de livros não lidos: " + estante.quantidadeLido());

    }
}
