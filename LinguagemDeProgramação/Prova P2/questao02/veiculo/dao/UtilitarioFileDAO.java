package questao02.veiculo.dao;

import questao02.veiculo.Veiculo;
import questao02.veiculo.exception.AdicionarDispositivoException;
import questao02.veiculo.utilitario.VeiculoUtilitario;

import java.util.ArrayList;
import java.util.List;

public class UtilitarioFileDAO extends FileDAO {

    public UtilitarioFileDAO() {
        super("utilitario.txt");
    }

    @Override
    public List<Veiculo> read() {
        List<String> linhas = this.openFileToRead();

        List<Veiculo> veiculosUtilitario = new ArrayList<Veiculo>();

        for(String linha : linhas) {
            Veiculo utilitario = convertLineToEntity(linha);
            veiculosUtilitario.add(utilitario);
        }
        return veiculosUtilitario;
    }

    public Veiculo convertLineToEntity(String linha) {
        String[] explodeLine = linha.split(";");
        VeiculoUtilitario utilitario = new VeiculoUtilitario();

        String fabricante = explodeLine[0];
        utilitario.setFabricante(fabricante);

        String modelo = explodeLine[1];
        utilitario.setModelo(modelo);

        String placa = explodeLine[2];
        utilitario.setPlaca(placa);

        String cor = explodeLine[3];
        utilitario.setCor(cor);

        String cambio = explodeLine[4];
        utilitario.setCambio(cambio);

        int quantidadePortas = Integer.parseInt(explodeLine[5]);
        utilitario.setQuantidadePortas(quantidadePortas);

        try {

            String[] explodeDispositivos = explodeLine[6].split("/");
            for(String dispositivo : explodeDispositivos) {
                utilitario.adicionarDispositivo(dispositivo);
            }

        } catch(AdicionarDispositivoException adicionarDispositivoException) {
            System.out.println(adicionarDispositivoException.getMessage());
        }

        String tipoCombustivel = explodeLine[7];
        utilitario.setTipoCombustivel(tipoCombustivel);

        double precoDiaria = Double.parseDouble(explodeLine[8]);
        utilitario.setPrecoDiaria(precoDiaria);

        int quantidadeMarchas = Integer.parseInt(explodeLine[9]);
        utilitario.setQuantidadeMarchas(quantidadeMarchas);

        int quantidadePassageiros = Integer.parseInt(explodeLine[10]);
        utilitario.setQuantidadePassageiros(quantidadePassageiros);

        boolean alugado = Boolean.parseBoolean(explodeLine[11]);
        utilitario.setAlugado(alugado);

        double altura = Double.parseDouble(explodeLine[12]);
        utilitario.setAltura(altura);

        boolean carroceria = Boolean.parseBoolean(explodeLine[13]);
        utilitario.setCarroceria(carroceria);

        double litrosCarroceria = Double.parseDouble(explodeLine[14]);
        utilitario.setLitrosCarroceria(litrosCarroceria);

        boolean tracao4Rodas = Boolean.parseBoolean(explodeLine[15]);
        utilitario.setTracao4Rodas(tracao4Rodas);

        return utilitario;
    }
}
