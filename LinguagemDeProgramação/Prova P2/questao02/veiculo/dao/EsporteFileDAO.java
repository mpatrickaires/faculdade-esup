package questao02.veiculo.dao;

import questao02.veiculo.Veiculo;
import questao02.veiculo.esporte.VeiculoEsporte;
import questao02.veiculo.exception.AdicionarDispositivoException;

import java.util.ArrayList;
import java.util.List;

public class EsporteFileDAO extends FileDAO {

    public EsporteFileDAO() {
        super("esporte.txt");
    }

    @Override
    public List<Veiculo> read() {
        List<String> linhas = this.openFileToRead();

        List<Veiculo> veiculosEsporte = new ArrayList<Veiculo>();

        for(String linha : linhas) {
            Veiculo esporte = convertLineToEntity(linha);
            veiculosEsporte.add(esporte);
        }
        return veiculosEsporte;
    }

    public Veiculo convertLineToEntity(String linha) {
        String[] explodeLine = linha.split(";");
        VeiculoEsporte esporte = new VeiculoEsporte();

        String fabricante = explodeLine[0];
        esporte.setFabricante(fabricante);

        String modelo = explodeLine[1];
        esporte.setModelo(modelo);

        String placa = explodeLine[2];
        esporte.setPlaca(placa);

        String cor = explodeLine[3];
        esporte.setCor(cor);

        String cambio = explodeLine[4];
        esporte.setCambio(cambio);

        int quantidadePortas = Integer.parseInt(explodeLine[5]);
        esporte.setQuantidadePortas(quantidadePortas);

        try {

            String[] explodeDispositivos = explodeLine[6].split("/");
            for(String dispositivo : explodeDispositivos) {
                esporte.adicionarDispositivo(dispositivo);
            }

        } catch(AdicionarDispositivoException adicionarDispositivoException) {
            System.out.println(adicionarDispositivoException.getMessage());
        }

        String tipoCombustivel = explodeLine[7];
        esporte.setTipoCombustivel(tipoCombustivel);

        double precoDiaria = Double.parseDouble(explodeLine[8]);
        esporte.setPrecoDiaria(precoDiaria);

        int quantidadeMarchas = Integer.parseInt(explodeLine[9]);
        esporte.setQuantidadeMarchas(quantidadeMarchas);

        int quantidadePassageiros = Integer.parseInt(explodeLine[10]);
        esporte.setQuantidadePassageiros(quantidadePassageiros);

        boolean alugado = Boolean.parseBoolean(explodeLine[11]);
        esporte.setAlugado(alugado);

        int velocidadeMaxima = Integer.parseInt(explodeLine[12]);
        esporte.setVelocidadeMaxima(velocidadeMaxima);

        double segundosPara100 = Double.parseDouble(explodeLine[13]);
        esporte.setSegundosPara100(segundosPara100);

        int cavalos = Integer.parseInt(explodeLine[14]);
        esporte.setCavalos(cavalos);

        return esporte;
    }
}
