package exercicio08;


public class Reserva {
    private int totalDiarias;
    private int codigo;
    private Cliente cliente;
    private Veiculo veiculo;

    public Reserva(int totalDiarias, int codigo, Cliente cliente) {
        this.totalDiarias = totalDiarias;
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public void escolherVeiculo(Veiculo veiculo) throws Exception {
        if(!veiculo.disponibilidade) {
            throw new Exception("Esse veículo não está disponível!");
        }
        this.veiculo = veiculo;
        this.veiculo.setDisponibilidade(false);
    }

    public int getTotalDiarias() {
        return totalDiarias;
    }

    public void setTotalDiarias(int totalDiarias) {
        this.totalDiarias = totalDiarias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
