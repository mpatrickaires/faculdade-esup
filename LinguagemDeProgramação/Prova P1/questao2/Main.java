package questao2;

public class Main {

    public static void main(String[] args) {
        try {

            // ABRINDO CONTAS
            Conta conta1 = new Conta(7063, 37565, 80);
            Conta conta2 = new Conta(5274, 69351, 50);
            System.out.println("Saldo da Conta 1 após abrir conta -> R$" + conta1.consultarSaldo());
            System.out.println("Saldo da Conta 2 após abrir conta -> R$" + conta2.consultarSaldo());

            System.out.println("------------------------------------------");
            // EFETUANDO SAQUES
            conta1.saque(50);
            conta2.saque(30);
            System.out.println("\nSaldo da Conta 1 após efetuar saque de R$50,00 -> R$" + conta1.consultarSaldo());
            System.out.println("Saldo da Conta 2 após efetuar saque de R$30,00 -> R$" + conta2.consultarSaldo());
            System.out.println("------------------------------------------");

            // EFETUANDO DEPÓSITOS
            conta1.deposito(100);
            conta2.deposito(200);
            System.out.println("\nSaldo da Conta 1 após depósito de R$100,00 -> R$" + conta1.consultarSaldo());
            System.out.println("Saldo da Conta 2 após depósito de R$200,00 -> R$" + conta2.consultarSaldo());
            System.out.println("------------------------------------------");

        } catch(AbrirContaException abrirContaException) {
            System.out.println(abrirContaException.getMessage());

        } catch(LimiteDiarioException limiteDiarioException) {
            System.out.println(limiteDiarioException.getMessage());

        } catch(SaldoInsuficienteException saldoInsuficienteException) {
            System.out.println(saldoInsuficienteException.getMessage());
        }


        // TESTES COM CÓDIGOS QUE DÃO GATILHO EM EXCEÇÕES
        System.out.println("\n========== CENÁRIO PARA TESTE DE EXCEÇÕES ==========");

        try {

            System.out.println("\n---------- ABRINDO CONTA COM SALDO MENOR QUE R$50,00 ----------");
            Conta contaExcecao1 = new Conta(1872, 76868, 30);

        } catch(AbrirContaException abrirContaException) {
            System.out.println(abrirContaException.getMessage());
        }

        try {

            System.out.println("\n---------- EXCEDENDO O VALOR DO SAQUE DIÁRIO ----------");
            Conta contaExcecao2 = new Conta(5636, 94370, 500);
            contaExcecao2.saque(200);
            contaExcecao2.saque(250);

        } catch(LimiteDiarioException limiteDiarioException) {
            System.out.println(limiteDiarioException.getMessage());
        } catch(SaldoInsuficienteException saldoInsuficienteException) {
            System.out.println(saldoInsuficienteException.getMessage());
        } catch(AbrirContaException abrirContaException) {
            System.out.println(abrirContaException.getMessage());
        }

        try {

            System.out.println("\n---------- EFETUANDO SAQUE COM VALOR MAIOR QUE O DISPONÍVEL EM SALDO ----------");
            Conta contaExcecao4 = new Conta(8096, 32699, 200);
            contaExcecao4.saque(300);

        } catch(SaldoInsuficienteException saldoInsuficienteException) {
            System.out.println(saldoInsuficienteException.getMessage());
        } catch(LimiteDiarioException limiteDiarioException) {
            System.out.println(limiteDiarioException.getMessage());
        } catch(AbrirContaException abrirContaException) {
            System.out.println((abrirContaException.getMessage()));
        }
    }
}
