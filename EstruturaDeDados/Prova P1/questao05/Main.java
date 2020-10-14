package questao05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double matrizDistancia[][] = popularMatrizDistancia();
        String vetorCidades[] = popularVetorCidades();

        menu(vetorCidades);
        int cidadeOrigem = cadastrarCidadeOrigem();
        int cidadeDestino = cadastrarCidadeDestino();
        double distancia = calcularDistancia(matrizDistancia, cidadeOrigem, cidadeDestino);

        System.out.println("------------------------------");
        System.out.println("A distância de " + vetorCidades[cidadeOrigem] + " até " + vetorCidades[cidadeDestino] +
                " é de " + distancia + " Km");
        System.out.println("------------------------------");
    }

    public static double[][] popularMatrizDistancia() { // Insere os elementos de acordo com a tabela de distâncias.
        double matrizDistancia[][] = {
                {-1, 63, 210, 190, 0, 190},
                {63, -1, 160, 150, 95, 0},
                {210, 160, -1, 10, 0, 0},
                {190, 150, 10, -1, 0, 0},
                {0, 95, 0, 0, -1, 80},
                {190, 0, 0, 0, 80, -1}
        };
        return matrizDistancia;
    }

    public static String[] popularVetorCidades() { // Insere os nomes das cidades de acordo com seu índice.
        String vetorCidades[] = {"Cáceres", "BBugres", "Cuiabá", "VGrande", "Tangará", "PLacerda"};
        return vetorCidades;
    }

    public static void menu(String vetorCidades[]) {  // Procedimento puramente estético para mostrar uma interface.
        System.out.println("==============================");
        System.out.println("|             GPS            |");
        System.out.println("==============================");
        for(int cidade = 0; cidade < vetorCidades.length; cidade++) {
            System.out.println("[" + (cidade + 1) + "] " + vetorCidades[cidade]);
        }
        System.out.println("==============================");
    }

    public static int cadastrarCidadeOrigem() {
        /*
         * Função que retorna um índice (linha/cidade de origem) que o usuário digitar, ao mesmo tempo em que valida
         * a existência desse índice na matriz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a cidade de origem: ");
        int cidadeOrigem = scan.nextInt() - 1;  // Subtrai 1 do índice digitado para bater com os índices da matriz.

        while(cidadeOrigem < 0 || cidadeOrigem > 5) {  // Laço de repetição para validar o índice.
            System.out.println("ERRO: Dígito inválido! Tente novamente.");
            System.out.print("Digite a cidade de origem: ");
            cidadeOrigem = scan.nextInt() - 1;
        }

        return cidadeOrigem;
    }

    public static int cadastrarCidadeDestino() {
        /*
         * Função que retorna um índice (coluna/cidade de destino) que o usuário digitar, ao mesmo tempo em que valida
         * a existência desse índice na matriz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a cidade de destino: ");
        int cidadeDestino = scan.nextInt() - 1; // Subtrai 1 do índice digitado para bater com os índices da matriz.

        while(cidadeDestino < 0 || cidadeDestino > 5) { // Laço de repetição para validar o índice.
            System.out.println("ERRO: Dígito inválido! Tente novamente.");
            System.out.print("Digite a cidade de destino: ");
            cidadeDestino = scan.nextInt() - 1;
        }

        return cidadeDestino;
    }

    public static double calcularDistancia(double matrizDistancia[][], int cidadeOrigem, int cidadeDestino) {
        /*
         * Função que retorna a distância baseado na linha (cidadeOrigem) e coluna (cidadeDestino) correspondente
         * dentro da matrizDistancia.
         * */
        if(matrizDistancia[cidadeOrigem][cidadeDestino] == 0) {
            // Verifica se a distância entre as cidades é igual a zero; caso seja verdade, executa a função.
            return recalcularDistancia(matrizDistancia, cidadeOrigem, cidadeDestino);
        }
        return matrizDistancia[cidadeOrigem][cidadeDestino];
    }

    public static double recalcularDistancia(double matrizDistancia[][], int cidadeOrigem, int cidadeDestino) {
        /*
         * Função executável caso a distância original seja zero. Essa função retorna uma nova distância ao calcular
         * uma nova rota através de uma nova linha (nova cidade de origem).
         * */
        int novaCidadeOrigem = 0;
        /*
         * Laço de repetição para verificar:
         * - Se a nova cidade de origem é igual a cidade de origem anterior;
         * - se a distância da cidade de origem original até a nova cidade de origem é igual a zero;
         * - se a distância da nova cidade de origem até a cidade de destino é igual a zero.
         * O laço vai executar e passar para a próxima cidade enquanto qualquer uma das condições acima for
         * verdadeira.
         * */
        while(novaCidadeOrigem == cidadeOrigem || matrizDistancia[cidadeOrigem][novaCidadeOrigem] == 0
                || matrizDistancia[novaCidadeOrigem][cidadeDestino] == 0) {
            novaCidadeOrigem++;
        }
        /*
         * O retorno é a distância da cidade de origem original até a nova cidade de origem somado com
         * a distância da nova cidade de origem até a cidade de destino.
         */
        return matrizDistancia[cidadeOrigem][novaCidadeOrigem] +
                matrizDistancia[novaCidadeOrigem][cidadeDestino];
    }
}


