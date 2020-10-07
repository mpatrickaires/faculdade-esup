package exerciciosdematrizes;

import java.util.Scanner;

public class Exercicio11 {
    /*
    * 11 - Leia uma matriz 100 x 10 que se refere respostas de 10 questões de múltipla escolha,
    * referentes a 100 alunos. Leia também um vetor de 10 posições contendo o gabarito de respostas que podem ser
    * a, b, c ou d. Seu programa deverá comparar as respostas de cada candidato com o gabarito e emitir
    * um vetor Resultado, contendo a pontuação correspondente.
    */

    public static void main(String[] args) {
        String listaAlunos[][] = new String[100][10];  // Linha = total de alunos ----- Coluna = total de questões
        String gabarito[] = new String[listaAlunos[0].length];  // Tamanho do vetor 'gabarito' = total de questões
        int pontuacao[] = new int[listaAlunos.length];  // Tamanho do vetor 'pontuacao' = total de alunos

        System.out.println("==========| G A B A R I T O |==========");
        preencherGabarito(gabarito);
        limparTela();

        preencherListaAlunos(listaAlunos, gabarito, pontuacao);

        System.out.println("==========| P O N T U A Ç Ã O |==========");
        mostrarPontuacao(pontuacao);
        System.out.println("=========================================");
    }

    public static void preencherGabarito(String gabarito[]) {
        Scanner scan = new Scanner(System.in);
        String resposta;

        for(int posicao = 0; posicao < gabarito.length; posicao++) {
            do {
                System.out.print("Resposta da questão (" + (posicao + 1) + ") -> ");
                resposta = scan.nextLine().toLowerCase();
            } while(!validarResposta(resposta));

            gabarito[posicao] = resposta;
        }
    }

    public static boolean validarResposta(String resposta) {
        if(!resposta.equals("a") && !resposta.equals("b") && !resposta.equals("c") && !resposta.equals("d")) {
            System.out.println("ERRO: Resposta inválida! Tente novamente com 'a', 'b', 'c' ou 'd'.");
            return false;
        }
        return true;
    }

    public static void limparTela() {
        for(int enter = 0; enter < 30; enter++) {
            System.out.println();
        }
    }

    public static void preencherListaAlunos(String listaAlunos[][], String gabarito[], int pontuacao[]) {
        Scanner scan = new Scanner(System.in);
        String resposta;

        for(int aluno = 0; aluno < listaAlunos.length; aluno++) {  // aluno = linha atual
            System.out.println("==========| A L U N O  Nº " + (aluno + 1) + " |==========");
            for(int questao = 0; questao < listaAlunos[0].length; questao++) {  // questao = coluna atual
                do {
                    System.out.print("Resposta da questão (" + (questao + 1) + ") -> ");
                    resposta = scan.nextLine().toLowerCase();
                } while(!validarResposta(resposta));

                if(resposta.equals(gabarito[questao])) {  /*
                * Verifica se a resposta digitada é igual a resposta nessa determinada questão (coluna) é igual
                * a resposta que está no vetor gabarito nessa mesma posição (questão, índice).
                */
                    pontuacao[aluno] += 1;  // Se sim, o índice atual (aluno) do vetor 'pontuacao' recebe + 1 ponto.
                }

                listaAlunos[aluno][questao] = resposta;  // Preenche a questão atual do aluno com a resposta digitada
            }
            limparTela();
        }
    }

    public static void mostrarPontuacao(int pontuacao[]) {
        System.out.println("------------------------------");

        for(int aluno = 0; aluno < pontuacao.length; aluno++) {
            System.out.println("Aluno nº " + (aluno + 1) +" -> " + pontuacao[aluno] + " pontos");
            System.out.println("------------------------------");
            /*
            * Esse for anda por cada aluno (índice) dentro do vetor 'pontuacao' e mostra a determinada pontuacao
            * registrada nessa posição.
            */
        }
    }
}
