package exerciciosdevetores;

import java.util.Scanner;

public class Exercicio10 {
    /*
    * 10 - Foi realizada uma pesquisa de algumas características físicas de 50 habitantes de uma certa região.
    * De cada habitante foram coletados os seguintes dados: gênero, cor dos olhos (azuis, verdes ou castanhos),
    * cor dos cabelos (louros, pretos ou castanhos) e idade. Faça um algoritmo que crie e leia do usuário
    * os seguintes valores e insira em cadas respectivo vetor:
    *
    * ●	genero: tipo char que armazena ‘f’ para femino e ‘m’ para masculino
    *
    * ●	olhos: tipo int, no qual 1- azul, 2- verde 3- castanho
    *
    * ●	cabelos: tipo int, no qual 1- louro, 2- preto, 3- castanho
    *
    * No final, a saída deve informar a quantidade de cada ítem.
    */

    public static void main(String[] args) {
        int totHomem = 0, totMulher = 0;
        int totOlhoAzul = 0, totOlhoVerde = 0, totOlhoCastanho = 0;
        int totCabeloLouro = 0, totCabeloPreto = 0, totCabeloCastanho = 0;

        char genero[] = new char[50];
        int olhos[] = new int[50];
        int cabelos[] = new int[50];

        for(int posicao = 0; posicao < 50; posicao++) {
            System.out.println("===== CADASTRO DA PESSOA Nº " + (posicao + 1) + " =====");

            genero[posicao] = cadastrarGenero();

            olhos[posicao] = cadastrarCorOlhos();

            cabelos[posicao] = cadastrarCorCabelos();

            limparTela();
        }

        for(char posicao: genero) { // Verifica o total de homens e o total de mulheres.
            if(posicao == 'M') {
                totHomem++;
            }
            else {
                totMulher++;
            }
        }

        for(int posicao: olhos) { // Verifica o total de cada cor de olho.
            if(posicao == 1) {
                totOlhoAzul++;
            }
            else if(posicao == 2) {
                totOlhoVerde++;
            }
            else {
                totOlhoCastanho++;
            }
        }

        for(int posicao: cabelos) { // Verifica o total de cada cor de cabelo.
            if(posicao == 1) {
                totCabeloLouro++;
            }
            else if(posicao == 2) {
                totCabeloPreto++;
            }
            else {
                totCabeloCastanho++;
            }
        }

        System.out.println("====== GÊNERO =====");
        System.out.println("-> " + totHomem + " homens");
        System.out.println("-> " + totMulher + " mulheres");

        System.out.println("====== OLHOS ======");
        System.out.println("-> " + totOlhoAzul + " azuis");
        System.out.println("-> " + totOlhoVerde + " verdes");
        System.out.println("-> " + totOlhoCastanho + " castanhos");

        System.out.println("===== CABELOS =====");
        System.out.println("-> " + totCabeloLouro + " louros");
        System.out.println("-> " + totCabeloPreto + " pretos");
        System.out.println("-> " + totCabeloCastanho + " castanhos");
    }

    public static char cadastrarGenero() {
        Scanner scan = new Scanner(System.in);
        char genero;
        System.out.println("---------- GÊNERO ---------");
        System.out.println("[M] Masculino \n[F] Feminino");
        System.out.print("Digite o gênero -> ");
        genero = scan.next().toUpperCase().charAt(0);
        genero = verificarGenero(genero);
        return genero;
    }

    public static int cadastrarCorOlhos() {
        Scanner scan = new Scanner(System.in);
        int corOlhos;
        System.out.println("---------- OLHOS ----------");
        System.out.println("[1] Azul \n[2] Verde \n[3] Castanho");
        System.out.print("Digite a cor dos olhos -> ");
        corOlhos = scan.nextInt();
        corOlhos = verificarCorOlhos(corOlhos);
        return corOlhos;
    }

    public static int cadastrarCorCabelos() {
        Scanner scan = new Scanner(System.in);
        int corCabelos;
        System.out.println("---------- CABELOS --------");
        System.out.println("[1] Louro \n[2] Preto \n[3] Castanho");
        System.out.print("Digite a cor dos cabelos -> ");
        corCabelos = scan.nextInt();
        corCabelos = verificarCorCabelos(corCabelos);
        return corCabelos;
    }

    public static char verificarGenero(char genero) {
        Scanner scan = new Scanner(System.in);
        while(genero!= 'M' && genero!= 'F') {
            System.out.println("\nERRO: Gênero inválido! Tente novamente com 'M' ou 'F'.");
            System.out.print("Digite o gênero -> ");
            genero = scan.next().toUpperCase().charAt(0);
        }
        return genero;
    }

    public static int verificarCorOlhos(int corOlhos) {
        Scanner scan = new Scanner(System.in);
        while(corOlhos < 1 || corOlhos > 3) {
            System.out.println("\nERRO: Dígito inválido! Tente novamente com '1', '2' ou '3'.");
            System.out.print("Digite a cor dos olhos -> ");
            corOlhos = scan.nextInt();
        }
        return corOlhos;
    }

    public static int verificarCorCabelos(int corCabelos) {
        Scanner scan = new Scanner(System.in);
        while(corCabelos < 1 || corCabelos > 3) {
            System.out.println("\nERRO: Dígito inválido! Tente novamente com '1', '2' ou '3'.");
            System.out.print("Digite a cor dos cabelos -> ");
            corCabelos = scan.nextInt();
        }
        return corCabelos;
    }

    public static void limparTela() {
        for(int contador = 0; contador < 30; contador++) {
            System.out.println();
        }
    }
}
