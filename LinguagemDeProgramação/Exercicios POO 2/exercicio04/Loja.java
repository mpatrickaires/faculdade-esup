package exercicio04;

public class Loja {

    public static void main(String[] args) {
        Produto produtos[] = new Produto[5];

        Livro livro1 = new Livro("Clube Da Luta", 35, "Chuck Palahniuk");
        Livro livro2 = new Livro("A Divina Comédia", 20, "Dante Alighieri");
        produtos[0] = livro1;
        produtos[1] = livro2;

        CD cd1 = new CD("Summer Eletrohits 2", 15, 16);
        CD cd2 = new CD("A Night at the Opera", 38, 12);
        produtos[2] = cd1;
        produtos[3] = cd2;

        DVD dvd1 = new DVD("Interstellar", 20, 168);
        produtos[4] = dvd1;

        for(int contador = 0; contador < produtos.length; contador++) {
            System.out.println("|Produto " + contador + "|");
            System.out.println(produtos[contador].toString());
            System.out.println("-----------------------------------");
        }
    }
}
