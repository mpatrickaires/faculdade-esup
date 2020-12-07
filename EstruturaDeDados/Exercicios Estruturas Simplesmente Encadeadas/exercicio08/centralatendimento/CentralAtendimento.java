package exercicio08.centralatendimento;

import exercicio08.dinamicqueue.DequeueException;
import exercicio08.dinamicqueue.DinamicQueue;

import java.util.ArrayList;
import java.util.List;

public class CentralAtendimento {
    private DinamicQueue filaEspera;
    private List<Atendente> atendentes;

    public CentralAtendimento() {
        this.filaEspera = new DinamicQueue();
        this.atendentes = new ArrayList<>();
    }

    public void adicionarAtendente(Atendente atendente) {
        this.atendentes.add(atendente);
    }

    public void enfileirarCliente(double valorChamada) {
        filaEspera.enqueue(valorChamada);
    }

    public void transferirParaAtendente() {
        if(this.filaEspera.isEmpty()) {
            System.out.println("-> ERRO: Fila de espera vazia! Impossível realizar atendimento.");
            return;
        }

        try {

            for (Atendente atendente : this.atendentes) {
                if (atendente.isDisponivel()) {
                    atendente.atenderCliente(filaEspera.dequeue());
                    return;
                }
            }

        } catch(DequeueException dequeueException) {
            System.out.println(dequeueException.getMessage());
        }

        System.out.println("-> ERRO: Todos os atendentes estão ocupados! Impossível realizar o atendimento.");
    }

    public void liberarAtendente() {
        for (Atendente atendente : this.atendentes) {
            if(!atendente.isDisponivel()) {
                atendente.finalizarAtendimento();
                return;
            }
        }
    }

    public void printarCentral() {
        DinamicQueue filaAux = new DinamicQueue();
        int numeroAtendente = 1, numeroChamada = 1;

        for(Atendente atendente : this.atendentes) {
            System.out.print("ATENDENTE " + numeroAtendente + ": ");

            if(atendente.isDisponivel()) {
                System.out.println("DISPONÍVEL");
            }
            else {
                System.out.println("INDISPONÍVEL");
            }

            numeroAtendente++;
        }

        System.out.println("------------- FILA DE ESPERA -------------");
        try {

            while(!this.filaEspera.isEmpty()) {
                double valorChamada = this.filaEspera.dequeue();
                System.out.println(numeroChamada + "ª Chamada: R$" + valorChamada);

                filaAux.enqueue(valorChamada);
                numeroChamada++;
            }

            while(!filaAux.isEmpty()) {
                this.filaEspera.enqueue(filaAux.dequeue());
            }

        } catch(DequeueException dequeueException) {
            System.out.println(dequeueException.getMessage());
        }
    }
}
