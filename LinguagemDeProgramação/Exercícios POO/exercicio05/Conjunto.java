package exercicio05;

public class Conjunto {
    private int conjunto[];
    private int tamanho;
    private int topo;

    public Conjunto(int tamanho) {
        this.conjunto = new int[tamanho];
        this.tamanho = tamanho;
        this.topo = 0;
    }

    public void adicionarElemento(int elemento) throws Exception {
        if(topo == tamanho) {
            throw new Exception("Conjunto cheio! Não foi possível adicionar novo elemento.");
        }
        for(int posicao = 0; posicao < this.tamanho; posicao++) {
            if(this.conjunto[posicao] == elemento) {
                throw new Exception("Elemento já existe no conjunto! Não foi possível adicionar novo elemento.");
            }
        }

        conjunto[topo] = elemento;
        this.topo++;
    }

    public boolean verificarElemento(int elemento) {
        for(int posicao = 0; posicao < this.tamanho; posicao++) {
            if(this.conjunto[posicao] == elemento) {
                return true;
            }
        }
        return false;
    }

    public int verificarPosicaoElemento(int elemento) throws Exception {
        for(int posicao = 0; posicao < this.tamanho; posicao++) {
            if(this.conjunto[posicao] == elemento) {
                return posicao;
            }
        }
        throw new Exception("Elemento não existe no conjunto! Não é possível retornar a posição.");
    }

    public Conjunto uniao(Conjunto conjuntoParametro) {
        Conjunto conjuntoUniao = new Conjunto(tamanhoUniao(conjuntoParametro));

        try {

            for (int elementoConjunto : this.conjunto) {
                if (!verificarRepeticao(conjuntoUniao, elementoConjunto)) {
                    conjuntoUniao.adicionarElemento(elementoConjunto);
                }
            }

        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {

            for (int elementoConjunto : conjuntoParametro.getConjunto()) {
                if (!verificarRepeticao(conjuntoUniao, elementoConjunto)) {
                    conjuntoUniao.adicionarElemento(elementoConjunto);
                }
            }

        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

        return conjuntoUniao;
    }

    private int tamanhoUniao(Conjunto conjuntoParametro) {
        int repeticao = 0;

        for(int elementoConjunto : this.conjunto) {
            if(verificarRepeticao(conjuntoParametro, elementoConjunto)) {
                repeticao++;
            }
        }

        return this.tamanho + conjuntoParametro.getTamanho() - repeticao;
    }

    private boolean verificarRepeticao(Conjunto conjunto, int elemento) {
        for(int elementoConjunto : conjunto.getConjunto()) {
            if(elementoConjunto == elemento) {
                return true;
            }
        }
        return false;
    }

    public Conjunto inter(Conjunto conjuntoParametro) {
        Conjunto conjuntoInter = new Conjunto(tamanhoInter(conjuntoParametro));

        try {
            for (int elementoConjunto : this.conjunto) {
                if (verificarRepeticao(conjuntoParametro, elementoConjunto)
                        && !verificarRepeticao(conjuntoInter, elementoConjunto)) {
                    conjuntoInter.adicionarElemento(elementoConjunto);
                }
            }
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

        return conjuntoInter;
    }

    public int tamanhoInter(Conjunto conjuntoParametro) {
        int repeticao = 0;

        for(int elementoConjunto : this.conjunto) {
            if(verificarRepeticao(conjuntoParametro, elementoConjunto)) {
                repeticao++;
            }
        }
        return repeticao;
    }

    public Conjunto menos(Conjunto conjuntoParametro) {
        Conjunto conjuntoMenos = new Conjunto(tamanhoMenos(conjuntoParametro));

        try {
            for (int elementoConjunto : this.conjunto) {
                if (!verificarRepeticao(conjuntoParametro, elementoConjunto)) {
                    conjuntoMenos.adicionarElemento(elementoConjunto);
                }
            }
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

        return conjuntoMenos;
    }

    private int tamanhoMenos(Conjunto conjuntoParametro) {
        int repeticao = 0;

        for(int elementoConjunto : this.conjunto) {
            if(verificarRepeticao(conjuntoParametro, elementoConjunto)) {
                repeticao++;
            }
        }

        return this.tamanho - repeticao;
    }

    public int[] getConjunto() {
        return conjunto;
    }

    public void setConjunto(int[] conjunto) {
        this.conjunto = conjunto;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
}
