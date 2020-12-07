package questao02.veiculo.dao;

import questao02.veiculo.Veiculo;
import questao02.veiculo.exception.AdicionarDispositivoException;
import questao02.veiculo.popular.VeiculoPopular;

import java.util.ArrayList;
import java.util.List;

public class PopularFileDAO extends FileDAO {

    public PopularFileDAO() {
        super("popular.txt");
    }

    @Override
    public List<Veiculo> read() {
        List<String> linhas = this.openFileToRead();

        List<Veiculo> veiculosPopular = new ArrayList<Veiculo>();

        for(String linha : linhas) {
            Veiculo popular = convertLineToEntity(linha);
            veiculosPopular.add(popular);
        }
        return veiculosPopular;
    }

    public Veiculo convertLineToEntity(String linha) {
        String[] explodeLine = linha.split(";");
        VeiculoPopular popular = new VeiculoPopular();

        String fabricante = explodeLine[0];
        popular.setFabricante(fabricante);

        String modelo = explodeLine[1];
        popular.setModelo(modelo);

        String placa = explodeLine[2];
        popular.setPlaca(placa);

        String cor = explodeLine[3];
        popular.setCor(cor);

        String cambio = explodeLine[4];
        popular.setCambio(cambio);

        int quantidadePortas = Integer.parseInt(explodeLine[5]);
        popular.setQuantidadePortas(quantidadePortas);

        try {

            String[] explodeDispositivos = explodeLine[6].split("/");
            for(String dispositivo : explodeDispositivos) {
                popular.adicionarDispositivo(dispositivo);
            }

        } catch(AdicionarDispositivoException adicionarDispositivoException) {
            System.out.println(adicionarDispositivoException.getMessage());
        }

        String tipoCombustivel = explodeLine[7];
        popular.setTipoCombustivel(tipoCombustivel);

        double precoDiaria = Double.parseDouble(explodeLine[8]);
        popular.setPrecoDiaria(precoDiaria);

        int quantidadeMarchas = Integer.parseInt(explodeLine[9]);
        popular.setQuantidadeMarchas(quantidadeMarchas);

        int quantidadePassageiros = Integer.parseInt(explodeLine[10]);
        popular.setQuantidadePassageiros(quantidadePassageiros);

        boolean alugado = Boolean.parseBoolean(explodeLine[11]);
        popular.setAlugado(alugado);

        String roda = explodeLine[12];
        popular.setRoda(roda);

        return popular;
    }
}
