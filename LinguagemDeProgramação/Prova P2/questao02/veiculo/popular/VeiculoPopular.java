package questao02.veiculo.popular;

import questao02.veiculo.Veiculo;

public class VeiculoPopular extends Veiculo {
    private String roda;

    public void cadastrarVeiculoPopular(String roda) {
        this.roda = roda;
    }

    @Override
    public void veiculoInformacoes() {
        System.out.println("CATEGORIA: POPULAR");
        System.out.println("------------------------------");
        informacoesGerais();
        System.out.println("Roda: " + this.roda);
    }

    public String getRoda() {
        return roda;
    }

    public void setRoda(String roda) {
        this.roda = roda;
    }

    @Override
    public String toString() {
        String veiculoString = veiculoToString();

        return veiculoString + ";" + this.roda;
    }
}
