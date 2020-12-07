package exercicio02;

import exercicio02.exception.RemoveListException;

public class Exercicio02 {
    /*
    * 02 - Escreva uma função que receba como parâmetro uma lista encadeada contendo apenas
    * valores 0 e 1 e que retorne as posições inicial e final da maior sequência de elementos 0
    * dentro da lista. Ex: Lista={0,1,1,0,0,0,1,0} posicaoInicial = 4 e posicaoFim = 6
    * sequencia={0,0,0} Obs: No caso de empate em tamanho, a primeira ocorrência de
    * sequencia é a que deve ser retornada.
    */

    public static void main(String[] args) {
        DinamicList lista = new DinamicList();

        // APLICANDO A LISTA QUE ESTÁ NO EXEMPLO DO ENUNCIADO
        lista.insertLast(0);
        lista.insertLast(1);
        lista.insertLast(1);
        lista.insertLast(0);
        lista.insertLast(0);
        lista.insertLast(0);
        lista.insertLast(1);
        lista.insertLast(0);

        System.out.println("-----| MAIOR SEQUÊNCIA DE ZEROS |-----");
        maiorSequenciaZeros(lista);
        System.out.println("--------------------------------------");
    }

    public static void maiorSequenciaZeros(DinamicList lista) {
        if(lista.isEmpty()) {
            System.out.println("-> ERRO: Lista vazia! Impossível executar a função.");
            return;
        }

        DinamicList listaAuxiliar = new DinamicList();
        int posicaoLista = 1, posicaoInicial = -1, posicaoFim = -1, tamanhoMaiorSequencia = 0;
        int posicaoInicialAux = 0, posicaoFimAux = 0, tamanhoSequenciaAux = 0;

        try {

            while (!lista.isEmpty()) {
                int elementoLista = lista.remove();

                if(elementoLista == 0) {
                    if(tamanhoSequenciaAux == 0) {
                        posicaoInicialAux = posicaoLista;
                    }
                    posicaoFimAux = posicaoLista;

                    tamanhoSequenciaAux++;
                }

                if(tamanhoSequenciaAux > tamanhoMaiorSequencia) {
                    posicaoInicial = posicaoInicialAux;
                    posicaoFim = posicaoFimAux;
                    tamanhoMaiorSequencia = tamanhoSequenciaAux;
                }

                if(elementoLista != 0) {
                    tamanhoSequenciaAux = 0;
                }

                listaAuxiliar.insertFirst(elementoLista);

                posicaoLista++;
            }

            while(!listaAuxiliar.isEmpty()) {
                lista.insertFirst(listaAuxiliar.remove());
            }

        } catch(RemoveListException removeListException) {
            System.out.println(removeListException.getMessage());
        }

        if(posicaoInicial == -1 || posicaoFim == -1) {
            System.out.println("A lista não possui elementos zero! Não é possível retornar as posições.");
            return;
        }

        System.out.println("Posição Inicial: " + posicaoInicial);
        System.out.println("Posição Final: " + posicaoFim);
    }
}
