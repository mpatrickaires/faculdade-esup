package questao02.veiculo.utilitario;

import questao02.veiculo.Veiculo;

public class VeiculoUtilitario extends Veiculo {
    private double altura;
    private boolean carroceria;
    private double litrosCarroceria;
    private boolean tracao4Rodas;

    public void cadastrarVeiculoUtilitario(double altura, boolean carroceria, double litrosCarroceria,
                                           boolean tracao4Rodas) {

        this.altura = altura;
        this.carroceria = carroceria;
        this.litrosCarroceria = litrosCarroceria;
        this.tracao4Rodas = tracao4Rodas;
    }

    @Override
    public void veiculoInformacoes() {
        System.out.println("CATEGORIA: UTILITÁRIO");
        System.out.println("------------------------------");
        informacoesGerais();
        System.out.println("Altura: " + this.altura + " metros");
        if(this.carroceria) {
            System.out.println("Possui Carroceria de " + this.litrosCarroceria + " litros");
        }
        else {
            System.out.println("Não possui Carroceria");
        }
        if(this.tracao4Rodas) {
            System.out.println("Possui Tração nas 4 Rodas");
        }
        else {
            System.out.println("Não possui Tração nas 4 Rodas");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCarroceria() {
        return carroceria;
    }

    public void setCarroceria(boolean carroceria) {
        this.carroceria = carroceria;
    }

    public double getLitrosCarroceria() {
        return litrosCarroceria;
    }

    public void setLitrosCarroceria(double litrosCarroceria) {
        this.litrosCarroceria = litrosCarroceria;
    }

    public boolean isTracao4Rodas() {
        return tracao4Rodas;
    }

    public void setTracao4Rodas(boolean tracao4Rodas) {
        this.tracao4Rodas = tracao4Rodas;
    }

    @Override
    public String toString() {
        String veiculoString = veiculoToString();

        return veiculoString + ";" + this.altura + ";" + this.carroceria + ";" + this.litrosCarroceria + ";" +
                this.tracao4Rodas;
    }
}
