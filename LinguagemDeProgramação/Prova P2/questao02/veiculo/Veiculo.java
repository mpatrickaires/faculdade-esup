package questao02.veiculo;

import questao02.veiculo.exception.AdicionarDispositivoException;

import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    protected String fabricante;
    protected String modelo;
    protected String placa;
    protected String cor;
    protected String cambio;
    protected int quantidadePortas;
    protected List<String> listaDispositivos = new ArrayList<>();
    protected String tipoCombustivel;
    protected double precoDiaria;
    protected int quantidadeMarchas;
    protected int quantidadePassageiros;
    protected boolean alugado;

    public void cadastrarVeiculo(String fabricante, String modelo, String placa, String cor, String cambio,
                                 int quantidadePortas, String tipoCombustivel, double precoDiaria,
                                 int quantidadeMarchas, int quantidadePassageiros) {

        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.cambio = cambio;
        this.quantidadePortas = quantidadePortas;
        this.tipoCombustivel = tipoCombustivel;
        this.precoDiaria = precoDiaria;
        this.quantidadeMarchas = quantidadeMarchas;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public String veiculoToString() {
        String dispositivos = listaDispositivosToString();
        return this.fabricante + ";" + this.modelo + ";" + this.placa + ";" + this.cor + ";" + this.cambio + ";" +
                this.quantidadePortas + ";" + dispositivos + ";" + this.tipoCombustivel + ";" + this.precoDiaria +
                ";" + this.quantidadeMarchas + ";" + this.quantidadePassageiros + ";" + this.alugado;
    }

    public String listaDispositivosToString() {
        if(this.listaDispositivos.isEmpty()) {
            return "";
        }

        StringBuilder dispositivos = new StringBuilder();

        int contador = 1;
        for(String dispositivo : this.listaDispositivos) {
            dispositivos.append(dispositivo);

            if(contador != this.listaDispositivos.size()) {
                dispositivos.append("/");
            }

            contador++;
        }

        return dispositivos.toString();
    }

    public void adicionarDispositivo(String dispositivo) throws AdicionarDispositivoException {
        if(procurarDispositivo(dispositivo)) {
            throw new AdicionarDispositivoException();
        }

        this.listaDispositivos.add(dispositivo);
    }

    public boolean procurarDispositivo(String dispositivo) {
        if(this.listaDispositivos.isEmpty()) {
            return false;
        }

        for(String dispositivoLista : listaDispositivos) {
            if(dispositivoLista.equals(dispositivo)) {
                return true;
            }
        }

        return false;
    }

    public void informacoesGerais() {
        System.out.println("PLACA: " + this.placa);
        System.out.printf("PREÇO DA DIÁRIA: R$%.2f\n", this.precoDiaria);
        System.out.println("------------------------------");
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Câmbio: " + this.cambio);
        System.out.println(this.quantidadePortas + " Portas");
        System.out.print("Dipositivos: ");
        if(this.listaDispositivos.isEmpty()) {
            System.out.println("Nenhum");
        }
        else {
            System.out.println(listaDispositivosToString());
        }
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println(this.quantidadeMarchas + " Marchas");
        System.out.println("Capacidade para " + this.quantidadePassageiros + " Passageiros");
    }

    public abstract void veiculoInformacoes();

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public List<String> getListaDispositivos() {
        return listaDispositivos;
    }

    public void setListaDispositivos(List<String> listaDispositivos) {
        this.listaDispositivos = listaDispositivos;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public int getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    public void setQuantidadeMarchas(int quantidadeMarchas) {
        this.quantidadeMarchas = quantidadeMarchas;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}
