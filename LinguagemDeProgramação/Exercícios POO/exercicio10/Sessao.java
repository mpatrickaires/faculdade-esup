package exercicio10;

public class Sessao {
    private Filme filme;
    private String horario;
    private Sala sala;

    public Sessao(Filme filme, String horario) {
        this.filme = filme;
        this.horario = horario;
    }


    public Filme getFilme() {
        return this.filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
