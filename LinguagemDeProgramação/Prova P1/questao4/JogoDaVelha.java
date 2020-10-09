package questao4;

import java.util.Scanner;

public class JogoDaVelha {
    private int jogo[][];
    private int jogador1;
    private int jogador2;
    private int preenchido;

    public JogoDaVelha() {
        this.jogo = new int[3][3];
        esvaziarJogo();
        this.jogador1 = 1;
        this.jogador2 = 0;
        this.preenchido = 0;
    }

    public void esvaziarJogo() {
        for(int linha = 0; linha < this.jogo.length; linha++) {
            for(int coluna = 0; coluna < this.jogo[0].length; coluna++) {
                this.jogo[linha][coluna] = -1;
            }
        }
    }

    public void exibirGrade() {
        System.out.print("    ");
        for(int coluna = 0; coluna < this.jogo[0].length; coluna++) {
            System.out.print(coluna + "   ");
        }
        System.out.println();

        for(int linha = 0; linha < this.jogo.length; linha++) {
            System.out.print(linha + " | ");
            for(int coluna = 0; coluna < this.jogo[0].length; coluna++) {
                if(this.jogo[linha][coluna] == 1) {
                    System.out.print("X");
                }
                else if(this.jogo[linha][coluna] == 0) {
                    System.out.print("O");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public void jogarX() {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Digite uma linha -> ");
            int linhaJogada = scan.nextInt();

            while (linhaJogada < 0 || linhaJogada > 2) {
                System.out.print("Linha inválida! Digite uma nova linha -> ");
                linhaJogada = scan.nextInt();
            }

            System.out.print("\nDigite uma coluna -> ");
            int colunaJogada = scan.nextInt();

            while (colunaJogada < 0 || colunaJogada > 2) {
                System.out.print("Coluna inválida! Digite uma nova coluna -> ");
                colunaJogada = scan.nextInt();
            }

            if(this.jogo[linhaJogada][colunaJogada] == -1) {
                this.jogo[linhaJogada][colunaJogada] = this.jogador1;
                this.preenchido++;
                return;
            }

            System.out.println("\nPosição já preenchida! Tente novamente.\n");
        }
    }

    public void jogarO() {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Digite uma linha -> ");
            int linhaJogada = scan.nextInt();

            while (linhaJogada < 0 || linhaJogada > 2) {
                System.out.print("Linha inválida! Digite uma nova linha -> ");
                linhaJogada = scan.nextInt();
            }

            System.out.print("\nDigite uma coluna -> ");
            int colunaJogada = scan.nextInt();

            while (colunaJogada < 0 || colunaJogada > 2) {
                System.out.print("Coluna inválida! Digite uma nova coluna -> ");
                colunaJogada = scan.nextInt();
            }

            if(this.jogo[linhaJogada][colunaJogada] == -1) {
                this.jogo[linhaJogada][colunaJogada] = this.jogador2;
                this.preenchido++;
                return;
            }

            System.out.println("\nPosição já preenchida! Tente novamente.\n");
        }
    }

    public int verificarVitoria() {
        // VITÓRIA POR LINHA PREENCHIDA
        for(int linha = 0; linha < this.jogo.length; linha++) {
            if((this.jogo[linha][0] == this.jogo[linha][1] && this.jogo[linha][1] == this.jogo[linha][2]) &&
            this.jogo[linha][0] != -1) {
                return this.jogo[linha][0];
            }
        }

        // VITÓRIA POR COLUNA PREENCHIDA
        for(int coluna = 0; coluna < this.jogo[0].length; coluna++) {
            if((this.jogo[0][coluna] == this.jogo[1][coluna] && this.jogo[1][coluna] == this.jogo[2][coluna]) &&
            this.jogo[0][coluna] != -1) {
                return this.jogo[0][coluna];
            }
        }

        // VITÓRIA POR DIAGONAL PRINCIPAL PREENCHIDA
        if((this.jogo[0][0] == this.jogo[1][1] && this.jogo[1][1] == this.jogo[2][2]) && this.jogo[0][0] != -1) {
            return this.jogo[0][0];
        }

        // VITÓRIA POR DIAGONAL SECUNDÁRIA PREENCHIDA
        if((this.jogo[0][2] == this.jogo[1][1] && this.jogo[1][1] == this.jogo[2][0]) && this.jogo[0][2] != -1) {
            return this.jogo[0][2];
        }

        // EMPATE
        if(this.preenchido == this.jogo.length * this.jogo[0].length) {
            return 2;
        }

        // AINDA SEM VITÓRIA OU EMPATE
        return -1;
    }

    public void fimDoJogo() {
        if(verificarVitoria() == 1) {
            System.out.println("======== FIM DO JOGO ========");
            System.out.println("   >>VITÓRIA DO JOGADOR 1<<");
        }

        if(verificarVitoria() == 0) {
            System.out.println("======== FIM DO JOGO ========");
            System.out.println("   >>VITÓRIA DO JOGADOR 2<<");
        }

        else if(verificarVitoria() == 2) {
            System.out.println("======== FIM DO JOGO ========");
            System.out.println("         >>EMPATE<<");
        }
    }

    public int[][] getJogo() {
        return jogo;
    }

    public void setJogo(int[][] jogo) {
        this.jogo = jogo;
    }

    public int getJogador1() {
        return jogador1;
    }

    public void setJogador1(int jogador1) {
        this.jogador1 = jogador1;
    }

    public int getJogador2() {
        return jogador2;
    }

    public void setJogador2(int jogador2) {
        this.jogador2 = jogador2;
    }

    public int getPreenchido() {
        return preenchido;
    }

    public void setPreenchido(int preenchido) {
        this.preenchido = preenchido;
    }
}
