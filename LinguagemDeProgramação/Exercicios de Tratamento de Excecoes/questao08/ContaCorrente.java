package exerciciostratamentoexcecoes.questao08;

public class ContaCorrente {
    private double limite;
    private double saldo;
    private double valorLimite;

    public void sacar(float valor) throws ValueInvalidException, ImpossibleOperationException {
        if(valor <= 0) {
            throw new ValueInvalidException();
        }
        if(this.limite + valor > this.valorLimite || valor > this.saldo) {
            throw new ImpossibleOperationException();
        }

        this.saldo -= valor;
        this.limite += valor;
    }

    public void depositar(float valor) throws ValueInvalidException {
        if(valor <= 0) {
            throw new ValueInvalidException();
        }

        this.saldo += valor;
    }

    public void setValorLimite(float valor) throws ValueInvalidException {
        if(valor <= 0) {
            throw new ValueInvalidException();
        }
        this.valorLimite = valor;
    }
    public double mostrarSaldo() {
        return this.saldo;
    }
}
