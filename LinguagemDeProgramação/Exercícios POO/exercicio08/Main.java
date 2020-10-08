package exercicio08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    * 08 - Implemente o seguinte diagrama de classes:
    *
    *     a. Ao fazer uma reserva, o cliente pode optar por listar todos os veículos
    *
    *     b. Para fazer uma reserva, é necessário verificar a disponibilidade do veículo, se
    *     não foi alugado anteriormente
    *
    *     c. No momento da locação é necessário setar disponbilidade false no veículo
    *
    *     d. O main, deve cadastrar veículos, utilitarios e esportivos, cadastrar cliente, e
    *     fazer o processo de reserva:
    *         i. Dizer o inicio e fim da reserva
    *         ii. Escolher um veículo em uma lista de veículos
    *
    *     e. Na locação deve-se finalizar a locação e calcular o preço final do total de diárias
    */

    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

        Esportivo lamborghini = new Esportivo();
        lamborghini.setModelo("Lamborghini");
        lamborghini.setPlaca("LAMBORGHINI-1234");
        lamborghini.setTipoCarro(TipoCarro.LUXO);
        lamborghini.setAno(2020);
        lamborghini.setDiaria(600);
        lamborghini.setVelocidade(325);
        listaVeiculos.add(lamborghini);

        Esportivo ferrari = new Esportivo();
        ferrari.setModelo("Ferrari");
        ferrari.setPlaca("FERRARI-1234");
        ferrari.setTipoCarro(TipoCarro.LUXO);
        ferrari.setAno(2017);
        ferrari.setDiaria(800);
        ferrari.setVelocidade(340);
        listaVeiculos.add(ferrari);

        Utilitario prisma = new Utilitario();
        prisma.setModelo("Prisma");
        prisma.setPlaca("PRISMA-1234");
        prisma.setTipoCarro(TipoCarro.SEDA);
        prisma.setAno(2018);
        prisma.setDiaria(150);
        prisma.setQuantidadePessoas(5);
        listaVeiculos.add(prisma);

        Utilitario kombi = new Utilitario();
        kombi.setModelo("Kombi");
        kombi.setPlaca("KOMBI-1234");
        kombi.setTipoCarro(TipoCarro.POPULAR);
        kombi.setAno(2019);
        kombi.setDiaria(120);
        kombi.setQuantidadePessoas(7);
        listaVeiculos.add(kombi);

        Cliente cliente = new Cliente("Ana", "979.285.150-08");
        Cliente cliente2 = new Cliente("Roberto", "615.896.630-47");

        Reserva reserva = new Reserva(30, 12345, cliente);
        Reserva reserva2 = new Reserva(15, 6789, cliente2);

        listarVeiculos(listaVeiculos);

        Locacao locacao = new Locacao(reserva);
        Locacao locacao2 = new Locacao(reserva2);

        try {

            reserva.escolherVeiculo(ferrari);
            reserva2.escolherVeiculo(ferrari);
            locacao.finalizarLocacao();
            locacao2.finalizarLocacao();

            System.out.println("\n----- RESERVA 1 -----");
            System.out.println("Nome: " + reserva.getCliente().getNome());
            System.out.println("Carro: " + reserva.getVeiculo().getModelo());
            System.out.println("Preço total: R$" + locacao.getPrecoTotal());
            System.out.println("---------------------");

            System.out.println("\n----- RESERVA 2 -----");
            System.out.println("Nome: " + reserva2.getCliente().getNome());
            System.out.println("Carro: " + reserva2.getVeiculo().getModelo());
            System.out.println("Preço total: R$" + locacao2.getPrecoTotal());
            System.out.println("---------------------");

        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void listarVeiculos(List<Veiculo> listaVeiculos) {
        System.out.println("===== VEÍCULOS =====");
        for(Veiculo veiculo: listaVeiculos) {
            System.out.println(veiculo.getModelo());
        }
        System.out.println("====================");
    }
}
