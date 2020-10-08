package exercicio10;

public class Main {
    /*
    * 10 - Escreva um diagrama de classes e implemente na linguagem JAVA o seguinte
    * cenário: um cinema que precisa vender ingressos, a poltrona é numerada, só pode
    * existir um ingresso por poltrona por sala e sessão. O filme em uma sala é
    * determinado pela sessão que acontece em um determinado horário. Observando que
    * um filme tem: nome, descrição, categoria. Um ingresso tem preço, filme, sessão do
    * filme, esta sessão acontece em um determinado horário.
    */

    public static void main(String[] args) {
        Filme filme1 = new Filme("Velozes e Furiosos", Categoria.ACAO);
        Filme filme2 = new Filme("2001: Uma Odisseia no Espaço", Categoria.FICCAO);
        Filme filme3 = new Filme("O Senhor dos Anéis", Categoria.AVENTURA);


        Poltrona poltrona1 = new Poltrona(1);
        Poltrona poltrona2 = new Poltrona(2);
        Poltrona poltrona3 = new Poltrona(3);


        Sessao sessao1 = new Sessao(filme1, "18:30");
        Sessao sessao2 = new Sessao(filme1, "15:00");
        Sessao sessao3 = new Sessao(filme2, "18:30");
        Sessao sessao4 = new Sessao(filme3, "15:00");


        Sala sala1 = new Sala();

        System.out.println("----- ADICIONANDO POLTRONA 1 NA SALA 1 -----");
        sala1.adicionarPoltrona(poltrona1);
        System.out.println("\n----- ADICIONANDO POLTRONA 1 NA SALA 1 NOVAMENTE-----");
        sala1.adicionarPoltrona(poltrona1);
        System.out.println("\n----- ADICIONANDO POLTRONA 2 NA SALA 1 -----");
        sala1.adicionarPoltrona(poltrona2);
        System.out.println("\n----- ADICIONANDO POLTRONA 3 NA SALA 1 -----");
        sala1.adicionarPoltrona(poltrona3);

        System.out.println("\n----- ADICIONANDO SESSÃO 1 NA SALA 1 -----");
        sala1.adicionarSessao(sessao1);
        System.out.println("\n----- ADICIONANDO SESSÃO 2 NA SALA 1 -----");
        sala1.adicionarSessao(sessao2);

        System.out.println("\n======================================================");

        Sala sala2 = new Sala();

        System.out.println("\n----- ADICIONANDO POLTRONA 1 NA SALA 2 -----");
        sala2.adicionarPoltrona(poltrona1);
        System.out.println("\n----- ADICIONANDO POLTRONA 2 NA SALA 2 -----");
        sala2.adicionarPoltrona(poltrona2);
        System.out.println("\n----- ADICIONANDO POLTRONA 3 NA SALA 2 -----");
        sala2.adicionarPoltrona(poltrona3);

        System.out.println("\n----- ADICIONANDO SESSÃO 1 NA SALA 2 -----");
        sala2.adicionarSessao(sessao1);
        System.out.println("\n----- ADICIONANDO SESSÃO 3 NA SALA 2 -----");
        sala2.adicionarSessao(sessao3);
        System.out.println("\n----- ADICIONANDO SESSÃO 4 NA SALA 2 -----");
        sala2.adicionarSessao(sessao4);

        System.out.println("\n======================================================");

        Ingresso ingresso1 = new Ingresso(30, sessao1);
        System.out.println("\n----- RESERVANDO POLTRONA 1 PARA O INGRESSO 1 -----");
        poltrona1.reservarPoltrona(ingresso1);

        System.out.println("\n======================================================");

        Ingresso ingresso2 = new Ingresso(30, sessao2);
        System.out.println("\n----- RESERVANDO POLTRONA 1 PARA O INGRESSO 2 -----");
        poltrona1.reservarPoltrona(ingresso2);

        System.out.println("\n======================================================");

        Ingresso ingresso3 = new Ingresso(30, sessao3);
        System.out.println("\n----- RESERVANDO POLTRONA 1 PARA O INGRESSO 3 -----");
        poltrona1.reservarPoltrona(ingresso3);

        System.out.println("\n======================================================");

        Ingresso ingresso4 = new Ingresso(30, sessao4);
        System.out.println("\n----- RESERVANDO POLTRONA 2 PARA O INGRESSO 4 -----");
        poltrona2.reservarPoltrona(ingresso4);
    }
}
