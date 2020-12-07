package questao02.veiculo.esporte;

import questao02.veiculo.Veiculo;

public class VeiculoEsporte extends Veiculo {
    private int velocidadeMaxima;
    private double segundosPara100;
    private int cavalos;

    public void cadastrarVeiculoEsporte(int velocidadeMaxima, double segundosPara100,
                                        int cavalos) {

        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosPara100 = segundosPara100;
        this.cavalos = cavalos;
    }

    @Override
    public void veiculoInformacoes() {
        System.out.println("CATEGORIA: ESPORTE");
        System.out.println("------------------------------");
        informacoesGerais();
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + " km/h");
        System.out.println(this.segundosPara100 + " segundos de 0 a 100 km/h");
        System.out.println(this.cavalos + " Cavalos");
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getSegundosPara100() {
        return segundosPara100;
    }

    public void setSegundosPara100(double segundosPara100) {
        this.segundosPara100 = segundosPara100;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    @Override
    public String toString() {
        String veiculoString = veiculoToString();

        return veiculoString + ";" + this.velocidadeMaxima + ";" + this.segundosPara100 + ";" + this.cavalos;
    }
}
