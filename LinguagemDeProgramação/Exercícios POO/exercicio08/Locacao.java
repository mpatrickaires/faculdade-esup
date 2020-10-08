package exercicio08;

public class Locacao {
    private Reserva reserva;
    private double precoTotal;

    public Locacao(Reserva reserva) {
        this.reserva = reserva;
    }

    public void finalizarLocacao() {
        reserva.getVeiculo().setDisponibilidade(true);
        this.precoTotal = calcularPrecoTotal();
    }

    public double calcularPrecoTotal() {
        return this.reserva.getVeiculo().getDiaria() * this.reserva.getTotalDiarias();
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}
