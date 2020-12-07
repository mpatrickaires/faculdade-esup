package exercicio08.centralatendimento;

public class Atendente {
    private boolean disponivel;
    private double valorChamada;

    public Atendente() {
        this.disponivel = true;
    }

    public void atenderCliente(double valorChamada) {
        this.valorChamada = valorChamada;
        this.disponivel = false;
    }

    public void finalizarAtendimento() {
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

}
