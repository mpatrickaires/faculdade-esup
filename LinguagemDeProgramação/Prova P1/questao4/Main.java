package questao4;

public class Main {

    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        jogoDaVelha.exibirGrade();

        while(true) {
            // JOGADA DO JOGADOR 1 -> X
            System.out.println("---------------------------------------------");
            System.out.println("É a vez do Jogador 1! Escolha sua posição.");
            jogoDaVelha.jogarX();

            limparTela();
            jogoDaVelha.exibirGrade();

            if(jogoDaVelha.verificarVitoria() != -1) {
                break;
            }


            // JOGADA DO JOGADOR 2 -> O
            System.out.println("---------------------------------------------");
            System.out.println("É a vez do Jogador 2! Escolha sua posição.");
            jogoDaVelha.jogarO();

            limparTela();
            jogoDaVelha.exibirGrade();

            if(jogoDaVelha.verificarVitoria() != -1) {
                break;
            }
        }
        jogoDaVelha.fimDoJogo();
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }
}
