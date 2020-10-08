package exercicio04;

public class Pais {
    private String codigoISO;
    private String nome;
    private int populacao;
    private double dimensao;
    private Pais paisesVizinhos[];
    private int topoPaisesVizinhos;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.paisesVizinhos = new Pais[40];
        this.topoPaisesVizinhos = 0;
    }

    public boolean verificarIgualdadePaises(Pais paisParametro) {
        return this.codigoISO.equals(paisParametro.getCodigoISO());
    }

    public void adicionarPaisVizinho(Pais pais) throws Exception {
        if(this.topoPaisesVizinhos == this.paisesVizinhos.length) {
            throw new Exception("Número máximo de países vizinhos atingido! " +
                    "Impossível adicionar mais um país vizinho.");
        }
        this.paisesVizinhos[this.topoPaisesVizinhos] = pais;
        this.topoPaisesVizinhos++;
    }

    public boolean verificarFronteira(Pais paisParametro) {
        for(int posicao = 0; posicao < this.topoPaisesVizinhos; posicao++) {
            if(this.paisesVizinhos[posicao].getCodigoISO().equals(paisParametro.getCodigoISO())) {
                return true;
            }
        }
        return false;
    }

    public double densidadePopulacional() throws Exception {
        if(this.dimensao <= 0) {
            throw new Exception("Valor inválido para a dimensão! " +
                    "Impossível retornar a densidade populacional.");
        }
        if(this.populacao <= 0) {
            throw new Exception("Valor inválido para a população! " +
                    "Impossível retornar a densidade populacional.");
        }

        return this.dimensao / this.populacao;
    }

    public Pais[] paisesVizinhosComuns(Pais paisParametro) {
        Pais[] vizinhosComuns = new Pais[calcularTamanhoVizinhosComuns(paisParametro)];
        int topoVizinhosComuns = 0;

        for(int posicao = 0; posicao < this.topoPaisesVizinhos; posicao ++) {

            for(int posicaoParametro = 0; posicaoParametro < paisParametro.getTopoPaisesVizinhos();
                posicaoParametro++) {

                if(this.paisesVizinhos[posicao].getCodigoISO().equals
                        (paisParametro.paisesVizinhos[posicaoParametro].getCodigoISO())) {

                    vizinhosComuns[topoVizinhosComuns] = this.paisesVizinhos[posicao];
                    topoVizinhosComuns++;
                    break;
                }
            }
        }

        return vizinhosComuns;
    }

    private int calcularTamanhoVizinhosComuns(Pais paisParametro) {
        int repete = 0;

        for(int posicao = 0; posicao < this.topoPaisesVizinhos; posicao++) {

            for(int posicaoParametro = 0; posicaoParametro < paisParametro.getTopoPaisesVizinhos();
                posicaoParametro++) {

                if(this.paisesVizinhos[posicao] == paisParametro.getPaisesVizinhos()[posicaoParametro]) {
                    repete++;
                    break;
                }
            }
        }

        return repete;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public Pais[] getPaisesVizinhos() {
        return this.paisesVizinhos;
    }

    public int getTopoPaisesVizinhos() {
        return topoPaisesVizinhos;
    }

    public void setTopoPaisesVizinhos(int topoPaisesVizinhos) {
        this.topoPaisesVizinhos = topoPaisesVizinhos;
    }
}
