package exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Poltrona {
    private int numeracao;
    private List<Ingresso> sessoesReservadas;

    public Poltrona(int numeracao) {
        this.numeracao = numeracao;
        this.sessoesReservadas = new ArrayList<Ingresso>();
    }

    public void reservarPoltrona(Ingresso ingresso) {
        if(!this.sessoesReservadas.isEmpty()) {

            for (Ingresso reservado : this.sessoesReservadas) {
                if (reservado.getSessao().getHorario().equals(ingresso.getSessao().getHorario())) {
                    System.out.println("Poltrona já reservada nessa sessão! Impossível reservar.");
                    return;
                }
            }
        }

        System.out.println("Poltrona reservada com sucesso!");
        this.sessoesReservadas.add(ingresso);
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public List<Ingresso> getSessoesReservadas() {
        return sessoesReservadas;
    }

    public void setSessoesReservadas(List<Ingresso> sessoesReservadas) {
        this.sessoesReservadas = sessoesReservadas;
    }
}
