package questao1;

public class Main {

    public static void main(String[] args) {
        Filme filme1 = new Filme("Clube da Luta");
        Filme filme2 = new Filme("Um Sonho de Liberdade");

        Locacao locacao1 = new Locacao();
        locacao1.setFilme(filme1);

        Locacao locacao2 = new Locacao();
        locacao2.setFilme(filme2);
    }
}
