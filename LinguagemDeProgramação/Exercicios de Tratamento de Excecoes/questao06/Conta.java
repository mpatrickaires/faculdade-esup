package exerciciostratamentoexcecoes.questao06;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private double limite;

    public Conta() {
        this.saldo = 0;
        this.limite = 0;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double saca(double valor) throws ContaExcecao {
        if(this.saldo < valor) {
            throw new ContaExcecao();
        }
        this.saldo -= valor;
        return valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
