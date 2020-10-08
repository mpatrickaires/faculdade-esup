package exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private List<Poltrona> poltronas;
    private List<Sessao> sessoes;

    public Sala() {
        this.poltronas = new ArrayList<Poltrona>();
        this.sessoes = new ArrayList<Sessao>();
    }

    public void adicionarPoltrona(Poltrona poltrona) {
        for(Poltrona poltronaExistente : poltronas) {
            if(poltronaExistente.getNumeracao() == poltrona.getNumeracao()) {
                System.out.println("Poltrona com essa numeração já existente! Impossível adicionar essa poltrona.");
                return;
            }
        }

        System.out.println("Poltrona adicionada com sucesso!");
        poltronas.add(poltrona);
    }

    public void adicionarSessao(Sessao sessao) {
        for(Sessao sessaoExistente : sessoes) {
            if(sessaoExistente.getHorario().equals(sessao.getHorario())) {
                System.out.println("Já existe sessão com esse horário! Impossível adicionar essa sessão.");
                return;
            }
        }

        System.out.println("Sessão adicionada com sucesso!");
        sessoes.add(sessao);
    }

    public List<Poltrona> getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(List<Poltrona> poltronas) {
        this.poltronas = poltronas;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}
