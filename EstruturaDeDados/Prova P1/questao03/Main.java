package questao03;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random gerador =  new Random();

        int jogador1[][] = new int[5][5];
        preencherCartelaJogador(jogador1);
        System.out.println("=========== |CARTELA DO JOGADOR 1| ===========");
        printarCartela(jogador1);
        System.out.println("==============================================");

        int jogador2[][] = new int[5][5];
        preencherCartelaJogador(jogador2);
        System.out.println("\n=========== |CARTELA DO JOGADOR 2| ===========");
        printarCartela(jogador2);
        System.out.println("==============================================");

        int jogador3[][] = new int[5][5];
        preencherCartelaJogador(jogador3);
        System.out.println("\n=========== |CARTELA DO JOGADOR 3| ===========");
        printarCartela(jogador3);
        System.out.println("==============================================");

        int jogador4[][] = new int[5][5];
        preencherCartelaJogador(jogador4);
        System.out.println("\n=========== |CARTELA DO JOGADOR 4| ===========");
        printarCartela(jogador4);
        System.out.println("==============================================");

        int jogador5[][] = new int[5][5];
        preencherCartelaJogador(jogador5);
        System.out.println("\n=========== |CARTELA DO JOGADOR 5| ===========");
        printarCartela(jogador5);
        System.out.println("==============================================");

        int numerosSorteados[] = new int[100];
        int zeroSorteado = 0, numero;

        for(int rodada = 0; rodada < numerosSorteados.length; rodada++) {
            System.out.println("\n-----> RODADA " + (rodada + 1) + " <-----");
            do {
                numero = gerador.nextInt(100);
                if(numero == 0 && zeroSorteado == 0) {
                    zeroSorteado++;
                    break;
                }
            } while(verificarRepeticaoSorteio(numerosSorteados, numero));

            System.out.println("Número sorteado: " + numero);

            marcarCartela(jogador1, numero);
            if(verificarBingo(jogador1)) {
                System.out.println("\n======== |BINGO| ======== \nVencedor: Jogador 1");
                printarCartela(jogador1);
                break;
            }

            marcarCartela(jogador2, numero);
            if(verificarBingo(jogador2)) {
                System.out.println("\n======== |BINGO| ======== \nVencedor: Jogador 2");
                printarCartela(jogador2);
                break;
            }

            marcarCartela(jogador3, numero);
            if(verificarBingo(jogador3)) {
                System.out.println("\n======== |BINGO| ======== \nVencedor: Jogador 3");
                printarCartela(jogador3);
                break;
            }

            marcarCartela(jogador4, numero);
            if(verificarBingo(jogador4)) {
                System.out.println("\n======== |BINGO| ======== \nVencedor: Jogador 4");
                printarCartela(jogador4);
                break;
            }

            marcarCartela(jogador5, numero);
            if(verificarBingo(jogador5)) {
                System.out.println("\n======== |BINGO| ======== \nVencedor: Jogador 5");
                printarCartela(jogador5);
                break;
            }
        }
    }

    public static void preencherCartelaJogador(int cartela[][]) {
        Random gerador = new Random();
        int numero, totalZero = 0;

        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[0].length; coluna++) {
                do {
                    numero = gerador.nextInt(101);
                    if(numero == 0 && totalZero == 0) {
                        totalZero++;
                        break;
                    }
                } while(verificarRepeticaoCartela(cartela, numero));

                cartela[linha][coluna] = numero;
            }
        }
    }

    public static boolean verificarRepeticaoCartela(int cartela[][], int numero) {
        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[0].length; coluna++) {
                if(cartela[linha][coluna] == numero) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void printarCartela(int cartela[][]) {
        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[0].length; coluna++) {
                System.out.print("[  " + cartela[linha][coluna] + "  ] ");
            }
            System.out.println();
        }
    }

    public static void marcarCartela(int cartela[][], int numero) {
        /*
        * Na função marcarCartela, toda a matriz (cartela) é percorrida para verificar se ela possui algum número
        * igual ao número que foi sorteado.
        * Caso possua, a matriz na determinada posição em que se encontra esse número recebe o valor -1.
        * Ela recebe o valor -1 porque as cartelas só são preenchidas com valores entre 0 e 99, logo o valor
        * -1 não está naturalmente nos valores da cartela.
        * Portanto, caso uma determinada posição da cartela tenha o valor -1, isso significa que essa posição
        * foi marcada.
        */
        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[0].length; coluna++) {
                if(cartela[linha][coluna] == numero) {
                    cartela[linha][coluna] = -1;
                    return;
                }
            }
        }
    }

    public static boolean verificarRepeticaoSorteio(int numeroSorteados[], int numero) {
        for(int posicao = 0; posicao < numeroSorteados.length; posicao++) {
            if(numeroSorteados[posicao] == numero) {
                return true;
            }
        }

        return false;
    }

    public static boolean verificarBingo(int cartela[][]) {
        /*
        * Como as posições marcadas da cartela são representadas pelo valor -1, a função verificarBingo percorre
        * todas as linhas e todas as colunas da matriz para verificar se a determinada linha ou coluna está toda
        * marcada (possui valor -1).
        * Caso esteja toda marcada, a função retorna o valor booleano true, indicando que nessa cartela
        * ocorreu bingo.
        * Caso contrário, a função retorna o valor booleano false, indciando que nessa cartela não ocorreu bingo.
        * */
        for(int linha = 0; linha < cartela.length; linha++) {
            if(cartela[linha][0] == -1 && cartela[linha][1] == -1 && cartela[linha][2] == -1 &&
            cartela[linha][3] == -1 && cartela[linha][4] == -1) {
                return true;
            }
        }

        for(int coluna = 0; coluna < cartela[0].length; coluna++) {
            if(cartela[0][coluna] == -1 && cartela[1][coluna] == -1 && cartela[2][coluna] == -1 &&
            cartela[3][coluna] == -1 && cartela[4][coluna] == -1) {
                return true;
            }
        }

        return false;
    }
}
