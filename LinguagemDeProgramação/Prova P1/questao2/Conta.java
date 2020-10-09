package questao2;

public class Conta {
    private int numeroConta;
    private int agencia;
    private double saldo;
    private double saqueDiario;


    public Conta(int agencia, int numeroConta, double saldo) throws AbrirContaException {
        this.agencia = agencia;
        this.numeroConta = numeroConta;

        if(saldo < 50) {
            throw new AbrirContaException();
        }

        this.saldo = saldo;
    }


    public void saque(double valor) throws LimiteDiarioException, SaldoInsuficienteException {
        if(this.saqueDiario + valor > 350) {
            throw new LimiteDiarioException();
        }

        if(valor > this.saldo) {
            throw new SaldoInsuficienteException();
        }

        this.saldo = this.saldo - valor;
        this.saqueDiario = this.saqueDiario + valor;
    }

    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
