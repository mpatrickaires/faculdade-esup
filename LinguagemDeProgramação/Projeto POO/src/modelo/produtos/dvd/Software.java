package modelo.produtos.dvd;

public class Software extends DVD {
    private String versao;
    private String requisitosSistema;

    public Software(int codigo, String descricao, double preco, String versao, String requisitosSistema) {
        super(codigo, descricao, preco);
        this.versao = versao;
        this.requisitosSistema = requisitosSistema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getRequisitosSistema() {
        return requisitosSistema;
    }

    public void setRequisitosSistema(String requisitosSistema) {
        this.requisitosSistema = requisitosSistema;
    }

    @Override
    public String toString() {
        return "Software{" +
                "versao=" + versao +
                ", requisitosSistema='" + requisitosSistema + '\'' +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria=" + categoria +
                '}';
    }
}
