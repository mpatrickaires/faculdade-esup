package provap2.questao06.dinamicqueue;

public class Cliente {
    private String nome;
    private boolean prioridade;

    public Cliente(String nome, boolean prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isPrioridade() {
        return this.prioridade;
    }
}
