package stack;

import java.util.Scanner;

public class Exercicio15 {
    /*
    * 15 - Crie um PROGRAMA que implemente o jogo Torres de Hanói. Utilize três pilhas
    * estáticas para representar os três pinos.
    * Seu programa deverá obedecer a seguinte estrutura:
    *
    *    1. Programa inicializa o jogo com os 7 discos no primeiro pino.
    *        a. Programa imprime uma visualização gráfica do estado dos três pinos
    *        apresentando onde estão os discos.
    *        b. Programa lê do teclado dois números inteiros: um indicando o pino de origem
    *        e outro indicando o pino de destino. Se o pino for inválido, o usuário deverá
    *        ser avisado, e o pograma deverá pedir um novo número.
    *
    *    2. Programa verifica se existe algum disco no pino de origem e se é possível realizar a
    *    movimentação do disco que está no topo desse pino para o pino de destino.
    *        a. Se existir e for possível realizar o movimento, programa deverá realizar o
    *        movimento.
    *        b. não for possível, programa mostra mensagem de erro e continua no passo
    *
    *    3. Programa verifica se todos os discos já estão no 3º pino.
    *        a. Se estiverem, programa finaliza com uma mensagem parabenizando o jogador.
    *        b. Se não estiverem, programa volta a executar o passo 2.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticStack pino1 = new StaticStack(7);
        StaticStack pino2 = new StaticStack(7);
        StaticStack pino3 = new StaticStack(7);
        int valorPinoOrigem, pinoDestino, movimentos = 0;

        popularPino1(pino1);

        while(!pino3.isFull()) {
            printarPinos(pino1, pino2, pino3);

            do {
                valorPinoOrigem = lerPinoOrigem(pino1, pino2, pino3);

                pinoDestino = lerPinoDestino(valorPinoOrigem, pino1, pino2, pino3);
            } while(pinoDestino == 0);

            movimentos++;
            limparTela();
        }

        printarPinos(pino1, pino2, pino3);
        System.out.println("Parabéns! Você terminou a Torre de Hanóis com " + movimentos + " movimentos!");
    }

    public static void popularPino1(StaticStack pino1) {
        for(int numero = 7; numero >= 1; numero--) {
            pino1.push(numero);
        }
    }

    public static void printarPinos(StaticStack pino1, StaticStack pino2, StaticStack pino3) {
        StaticStack pinoAuxiliar1 = new StaticStack(pino1.length());
        StaticStack pinoAuxiliar2 = new StaticStack(pino2.length());
        StaticStack pinoAuxiliar3 = new StaticStack(pino3.length());

        System.out.println("===== PINO 1 =====" + "-----" + "===== PINO 2 =====" + "-----"
                + "===== PINO 3 =====");

        for(int contador = 0; contador < pino1.length(); contador++) {

            System.out.print("        ");
            if(!pino1.isEmpty()) {
                System.out.print(pino1.peek());
                pinoAuxiliar1.push(pino1.pop());
            }
            else {
                System.out.print("|");
            }
            System.out.print("        ");

            System.out.print("              ");
            if(!pino2.isEmpty()) {
                System.out.print(pino2.peek());
                pinoAuxiliar2.push(pino2.pop());
            }
            else {
                System.out.print("|");
            }
            System.out.print("         ");

            System.out.print("             ");
            if(!pino3.isEmpty()) {
                System.out.print(pino3.peek());
                pinoAuxiliar3.push(pino3.pop());
            }
            else {
                System.out.print("|");
            }

            System.out.println();
        }
        System.out.println("================================================================");

        while(!pinoAuxiliar1.isEmpty()) {
            pino1.push(pinoAuxiliar1.pop());
        }

        while(!pinoAuxiliar2.isEmpty()) {
            pino2.push(pinoAuxiliar2.pop());
        }

        while(!pinoAuxiliar3.isEmpty()) {
            pino3.push(pinoAuxiliar3.pop());
        }
    }

    static public int lerPinoOrigem(StaticStack pino1, StaticStack pino2, StaticStack pino3) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Digite o pino de origem: ");
            int pinoOrigem = scan.nextInt();

            switch (pinoOrigem) {
                case 1:
                    if (pino1.isEmpty()) {
                        System.out.println("ERRO: Pino vazio! Tente novamente.\n");
                        break;
                    }
                    return pino1.pop();

                case 2:
                    if (pino2.isEmpty()) {
                        System.out.println("ERRO: Pino vazio! Tente novamente.\n");
                        break;
                    }
                    return pino2.pop();

                case 3:
                    if (pino3.isEmpty()) {
                        System.out.println("ERRO: Pino vazio! Tente novamente.\n");
                        break;
                    }
                    return pino3.pop();

                default:
                    System.out.println("ERRO: Pino de origem inválido! Tente novamente.\n");
            }
        }
    }

    public static int lerPinoDestino(int valorPinoOrigem, StaticStack pino1, StaticStack pino2,
                                     StaticStack pino3) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o pino de destino: ");
        int pinoDestino = scan.nextInt();

        switch(pinoDestino) {
            case 1:
                if(pino1.isEmpty()) {
                    pino1.push(valorPinoOrigem);
                    return 1;
                }
                if(pino1.isFull() || valorPinoOrigem >= pino1.peek()) {
                    System.out.print("ERRO: Pino de destino inválido! Tente novamente.\n");
                    return 0;
                }
                pino1.push(valorPinoOrigem);
                return 1;

            case 2:
                if(pino2.isEmpty()) {
                    pino2.push(valorPinoOrigem);
                    return 1;
                }
                if(pino2.isFull() || valorPinoOrigem >= pino2.peek()) {
                    System.out.println("ERRO: Pino de destino inválido! Tente novamente.\n");
                    return 0;
                }
                pino2.push(valorPinoOrigem);
                return 1;

            case 3:
                if(pino3.isEmpty()) {
                    pino3.push(valorPinoOrigem);
                    return 1;
                }
                if(pino3.isFull() || valorPinoOrigem >= pino3.peek()) {
                    System.out.println("ERRO: Pino de destino inválido! Tente novamente.\n");
                    return 0;
                }
                pino3.push(valorPinoOrigem);
                return 1;
        }

        System.out.println("ERRO: Pino de destino inválido! Tente novamente.\n");
        return 0;
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }
}
