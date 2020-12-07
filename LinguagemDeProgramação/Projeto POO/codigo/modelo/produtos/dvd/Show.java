package modelo.produtos.dvd;

public class Show extends DVD {
    private String artista;
    private int numeroDeMusicas;

    public Show(int codigo, String descricao, double preco, String artista, int numeroDeMusicas) {
        super(codigo, descricao, preco);
        this.artista = artista;
        this.numeroDeMusicas = numeroDeMusicas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumeroDeMusicas() {
        return numeroDeMusicas;
    }

    public void setNumeroDeMusicas(int numeroDeMusicas) {
        this.numeroDeMusicas = numeroDeMusicas;
    }

    @Override
    public String toString() {
        return "Show{" +
                "artista='" + artista + '\'' +
                ", numeroDeMusicas=" + numeroDeMusicas +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria=" + categoria +
                '}';
    }
}
