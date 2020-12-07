package exerciciostratamentoexcecoes.questao08;

public class Main {
    /*
    * 08 - Construa uma classe chamada “ContaCorrente” , com os atributos “limite” que armazena
    * a quantidade atual disponível do limite da conta que o usuário possui , o atributo “saldo” que
    * é o valor que realmente é pertencente ao usuário, e o atributo “valorLimite” que consiste no
    * valor máximo que o banco lhe fornece como valor de limite, todos float.
    *
    *     ● Construa os métodos public void, sacar(float valor), depositar(float valor), e
    *     setValorLimite(float valor).
    *
    *     ● Na construção dos três métodos faça com que eles lancem exceptions relacionados
    *     aos argumentos, por exemplo, sacar, depositar ou setar um valor negativo para
    *     esses eventos. Exceção: ValueInvalidException, herdando de Exception.
    *
    *     ● Lance também uma exception no caso de tentar sacar um valor maior que o
    *     possível. ImpossibleOperationException, herdando de Exception
    *
    *     ● Crie uma classe main, onde se deve instanciar um objeto da classe “ContaCorrente”,
    *     usar os três métodos construídos acima e tratar ás exceções propostas com os
    *     comandos “try” e “catch”, no catch imprimir na tela o método “getMessage()” da
    *     exception declarada no catch.
    *
    *     ● Use o finally para printar o valor do saldo da conta obrigatoriamente
    */

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        try {
            contaCorrente.setValorLimite(3000);
            contaCorrente.depositar(5000);
            contaCorrente.sacar(2500);

        } catch(ValueInvalidException valueInvalidException) {
            System.out.println(valueInvalidException.getMessage());

        } catch(ImpossibleOperationException impossibleOperationException) {
            System.out.println(impossibleOperationException.getMessage());

        } finally {
            System.out.println("Saldo: R$" + contaCorrente.mostrarSaldo());
        }
    }
}
