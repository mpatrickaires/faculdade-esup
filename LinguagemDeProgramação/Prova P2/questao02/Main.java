package questao02;

import questao02.exception.ProcurarVeiculoException;
import questao02.veiculo.Veiculo;
import questao02.veiculo.dao.EsporteFileDAO;
import questao02.veiculo.dao.PopularFileDAO;
import questao02.veiculo.dao.UtilitarioFileDAO;
import questao02.veiculo.esporte.VeiculoEsporte;
import questao02.veiculo.exception.AdicionarDispositivoException;
import questao02.veiculo.popular.VeiculoPopular;
import questao02.veiculo.utilitario.VeiculoUtilitario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    * 02 - Tendo a descrição de um sistema de aluguel de veículos abaixo, crie o diagrama de classse e desenvolva
    * em Java:
    *
    *   ●	Os veículos são classificados da seguinte forma:
    *       ○	Todos os veículos: tendo fabricante, modelo, placa, cor, câmbio automático ou manual, quantidade de
    *           portas, lista de dispositivos: ar condicionado, vidro elétrico, retrovisor elétrico, direção
    *           hidráulica, elétrica ou manual (lista de Strings), tipo de combustível (álcool, gasolina, diesel,
    *           elétrico), preço do aluguel diária, quantidade marchas, numero máximo de passageiros.
    *
    *       ○	Populares: roda de aro de ferro ou de liga leve
    *
    *       ○	Esportes: velocidade máxima, número de segundos que atinge de 0 a 100 km/h, apenas câmbio automático,
    *           número de cavalos
    *
    *       ○	Utilitário: altura, possui carroceria, litros transporte carroceria, tração nas 4 rodas
    *
    *   ●	Não é necessário cadastro de cliente
    *
    *   ●	Devem existir três processos:
    *       ○	Cadastro de veículo
    *       ○	Aluguel, onde pega o carro
    *       ○	Devolução onde o processo é finalizado
    *
    *   ●	Os dados do veículo devem ser persistidos em um arquivo escrito no disco.
    *       ○	Ao buscar uma lista de veículos ler do arquivo
    *       ○	Ao salvar veículos salvar no arquivo
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PopularFileDAO popularDAO = new PopularFileDAO();
        EsporteFileDAO esporteDAO = new EsporteFileDAO();
        UtilitarioFileDAO utilitarioDAO = new UtilitarioFileDAO();

        List<Veiculo> veiculosCadastrados = new ArrayList<Veiculo>();
        List<Veiculo> veiculosAlugados = new ArrayList<Veiculo>();

        lerFilesDAO(veiculosCadastrados, popularDAO, esporteDAO, utilitarioDAO);

        int opcao;
        do {

            System.out.println("=======| M E N U |=======");
            System.out.println("[1] CADASTRAR VEÍCULO");
            System.out.println("[2] ALUGAR VEÍCULO");
            System.out.println("[3] DEVOLVER VEÍCULO");
            System.out.println("[4] LISTAR VEÍCULOS");
            System.out.println("[5] ENCERRAR PROGRAMA");
            System.out.println("=========================");
            opcao = lerOpcao(5);
            System.out.println("\n");

            switch(opcao) {
                case 1:
                    opcoesCadastro(veiculosCadastrados, popularDAO, esporteDAO, utilitarioDAO);
                    break;

                case 2:
                    if(veiculosCadastrados.isEmpty()) {
                        System.out.println("-> ERRO: Não há veículos cadastrados! Impossível alugar no momento.");
                        break;
                    }
                    alugarVeiculo(veiculosCadastrados, veiculosAlugados);
                    break;

                case 3:
                    if(veiculosAlugados.isEmpty()) {
                        System.out.println("-> ERRO: Não há veículos alugados! Impossível realizar a devolução.");
                        break;
                    }
                    devolverVeiculo(veiculosAlugados);
                    break;

                case 4:
                    if(veiculosCadastrados.isEmpty()) {
                        System.out.println("-> ERRO: Não há veículos cadastrados! Impossível mostrar a lista.");
                        break;
                    }
                    printarListaVeiculos(veiculosCadastrados);
                    System.out.println("\n====| PRESSIONE ENTER PARA VOLTAR AO MENU |====");
                    String enter = scan.nextLine();
                    break;

                case 5:
                    System.out.println("=====| E N C E R R A N D O . . . |=====");
            }

            System.out.println("\n");

        } while(opcao != 5);
    }

    public static void opcoesCadastro(List<Veiculo> veiculosCadastrados, PopularFileDAO popularDAO,
                                      EsporteFileDAO esporteDAO, UtilitarioFileDAO utilitarioDAO) {

        System.out.println("====================");
        System.out.println("[1] POPULAR");
        System.out.println("[2] ESPORTE");
        System.out.println("[3] UTILITÁRIO");
        System.out.println("[4] CANCELAR");
        System.out.println("====================");
        int opcao = lerOpcao(4);

        switch(opcao) {
            case 1:
                VeiculoPopular popular = cadastrarVeiculoPopular();
                popularDAO.write(popular);
                veiculosCadastrados.add(popular);
                System.out.println("---------------------------");
                System.out.println("Veículo cadastrado com sucesso!\n\n");
                break;

            case 2:
                VeiculoEsporte esporte = cadastrarVeiculoEsporte();
                esporteDAO.write(esporte);
                veiculosCadastrados.add(esporte);
                System.out.println("---------------------------");
                System.out.println("Veículo cadastrado com sucesso!\n\n");
                break;

            case 3:
                VeiculoUtilitario utilitario = cadastrarVeiculoUtilitario();
                utilitarioDAO.write(utilitario);
                veiculosCadastrados.add(utilitario);
                System.out.println("---------------------------");
                System.out.println("Veículo cadastrado com sucesso!\n\n");
                break;
        }
    }

    public static VeiculoPopular cadastrarVeiculoPopular() {
        VeiculoPopular popular = new VeiculoPopular();

        criarVeiculo(popular, false);

        System.out.println("======| RODA |======");
        System.out.println("[1] ARO DE FERRO");
        System.out.println("[2] LIGA LEVE");
        System.out.println("====================");
        int opcao = lerOpcao(2);

        String roda = "";
        switch(opcao) {
            case 1:
                roda = "Aro de Ferro";
                break;

            case 2:
                roda = "Liga Leve";
                break;
        }

        popular.cadastrarVeiculoPopular(roda);
        return popular;
    }

    public static VeiculoEsporte cadastrarVeiculoEsporte() {
        Scanner scan = new Scanner(System.in);

        VeiculoEsporte esporte = new VeiculoEsporte();

        criarVeiculo(esporte, true);

        int velocidadeMaxima;
        while(true) {

            try {

                System.out.print("Digite a velocidade máxima: ");
                velocidadeMaxima = scan.nextInt();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();
            }
        }

        System.out.println("---------------------------");

        double segundosPara100;
        while(true) {

            try {

                System.out.print("Digite quantos segundos para ir de 0 a 100 km/h: ");
                segundosPara100 = scan.nextDouble();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número.");
                scan.next();
            }
        }

        System.out.println("---------------------------");

        int cavalos;
        while(true) {

            try {

                System.out.print("Digite a quantidade de cavalos: ");
                cavalos = scan.nextInt();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();
            }
        }

        esporte.cadastrarVeiculoEsporte(velocidadeMaxima, segundosPara100, cavalos);
        return esporte;
    }

    public static VeiculoUtilitario cadastrarVeiculoUtilitario() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        VeiculoUtilitario utilitario = new VeiculoUtilitario();

        criarVeiculo(utilitario, false);

        double altura;
        while(true) {

            try {

                System.out.print("Digite a altura: ");
                altura = scan.nextDouble();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número.");
                scan.next();
            }
        }

        System.out.println("---------------------------");

        System.out.println("===| TEM CARROCERIA? |===");
        System.out.println("[1] SIM");
        System.out.println("[2] NÃO");
        System.out.println("=========================");
        opcao = lerOpcao(2);

        boolean carroceria = true;
        switch(opcao) {
            case 1:
                carroceria = true;
                break;

            case 2:
                carroceria = false;
                break;
        }

        System.out.println("---------------------------");

        double litrosCarroceria = 0;
        if(carroceria) {
            while(true) {

                try {

                    System.out.print("Digite a quantidade de litros da carroceria: ");
                    litrosCarroceria = scan.nextDouble();

                    System.out.println("---------------------------");

                    break;

                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor de entrada inválido! " +
                            "Tente novamente com um número.");
                    scan.next();
                }
            }
        }

        System.out.println("===| TEM TRAÇÃO NAS 4 RODAS? |===");
        System.out.println("[1] SIM");
        System.out.println("[2] NÃO");
        System.out.println("=================================");
        opcao = lerOpcao(2);

        boolean tracao4Rodas = false;
        switch(opcao) {
            case 1:
                tracao4Rodas = true;
                break;

            case 2:
                tracao4Rodas = false;
                break;
        }

        utilitario.cadastrarVeiculoUtilitario(altura, carroceria, litrosCarroceria, tracao4Rodas);

        return utilitario;
    }

    public static void criarVeiculo(Veiculo veiculo, boolean isEsporte) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("---------------------------");

        System.out.print("Digite o fabricante: ");
        String fabricante = scan.nextLine();

        System.out.println("---------------------------");

        System.out.print("Digite o modelo: ");
        String modelo = scan.nextLine();

        System.out.println("---------------------------");

        System.out.print("Digite a placa: ");
        String placa = scan.nextLine().toUpperCase();

        System.out.println("---------------------------");

        System.out.print("Digite a cor: ");
        String cor = scan.nextLine();

        System.out.println("---------------------------");

        String cambio = "";
        if(!isEsporte) {
            System.out.println("===| CÂMBIO |===");
            System.out.println("[1] AUTOMÁTICO");
            System.out.println("[2] MANUAL");
            System.out.println("================");
            opcao = lerOpcao(2);

            switch (opcao) {
                case 1:
                    cambio = "Automático";
                    break;

                case 2:
                    cambio = "Manual";
                    break;
            }

            System.out.println("---------------------------");
        }
        else {
            cambio = "Automático";
        }

        int quantidadePortas;
        while(true) {

            try {

                System.out.print("Digite a quantidade de portas: ");
                quantidadePortas = scan.nextInt();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();
            }
        }

        System.out.println("---------------------------");

        boolean dispositivosEscolhidos[] = new boolean[6];
        do {
            System.out.println("===| ADICIONAR DISPOSITIVOS |===");
            if(!dispositivosEscolhidos[0]) {
                System.out.println("[1] AR CONDICIONADO");
            }
            if(!dispositivosEscolhidos[1]) {
                System.out.println("[2] VIDRO ELÉTRICO");
            }
            if(!dispositivosEscolhidos[2]) {
                System.out.println("[3] RETROVISOR ELÉTRICO");
            }
            if(!dispositivosEscolhidos[3]) {
                System.out.println("[4] DIREÇÃO HIDRAÚLICA");
                System.out.println("[5] DIREÇÃO ELÉTRICA");
                System.out.println("[6] DIREÇÃO MANUAL");
            }
            System.out.println("[7] ENCERRAR");
            System.out.println("================================");
            opcao = lerOpcao(7);

            if(opcao != 7) {
                while(dispositivosEscolhidos[opcao - 1]) {
                    System.out.println("-> ERRO: Esse dispositivo já foi adicionado! " +
                            "Tente novamente com uma opção diferente.");
                    opcao = lerOpcao(7);

                    if(opcao == 7) {
                        break;
                    }
                }
            }

            try {

                switch (opcao) {
                    case 1:
                        veiculo.adicionarDispositivo("Ar Condicionado");
                        break;

                    case 2:
                        veiculo.adicionarDispositivo("Vidro Elétrico");
                        break;

                    case 3:
                        veiculo.adicionarDispositivo("Retrovisor Elétrico");
                        break;

                    case 4:
                        veiculo.adicionarDispositivo("Direção Hidraúlica");
                        break;

                    case 5:
                        veiculo.adicionarDispositivo("Direção Elétrica");
                        break;

                    case 6:
                        veiculo.adicionarDispositivo("Direção Manual");
                        break;
                }

                if(opcao < 4) {
                    dispositivosEscolhidos[opcao - 1] = true;
                }
                else {
                    dispositivosEscolhidos[3] = true;
                    dispositivosEscolhidos[4] = true;
                    dispositivosEscolhidos[5] = true;
                }

            } catch(AdicionarDispositivoException adicionarDispositivoException) {
                System.out.println(adicionarDispositivoException.getMessage());
            }

        } while(opcao != 7);

        System.out.println("===| COMBUSTÍVEL |===");
        System.out.println("[1] ÁLCOOL");
        System.out.println("[2] GASOLINA");
        System.out.println("[3] DIESEL");
        System.out.println("[4] ELÉTRICO");
        System.out.println("=====================");
        opcao = lerOpcao(4);

        String tipoCombustivel = "";
        switch(opcao) {
            case 1:
                tipoCombustivel = "Álcool";
                break;

            case 2:
                tipoCombustivel = "Gasolina";
                break;

            case 3:
                tipoCombustivel = "Diesel";
                break;

            case 4:
                tipoCombustivel = "Elétrico";
                break;
        }

        System.out.println("---------------------------");

        double precoDiaria;
        while(true) {

            try {

                System.out.print("Digite o preço da diária: R$");
                precoDiaria = scan.nextDouble();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número.");
                scan.next();
            }
        }

        System.out.println("---------------------------");

        int quantidadeMarchas;
        while(true) {

            try {

                System.out.print("Digite a quantidade de marchas: ");
                quantidadeMarchas = scan.nextInt();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();
            }
        }

        System.out.println("---------------------------");

        int quantidadePassageiros;
        while(true) {

            try {

                System.out.print("Digite a quantidade de passageiros: ");
                quantidadePassageiros = scan.nextInt();
                break;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();
            }
        }

        System.out.println("---------------------------");

        veiculo.cadastrarVeiculo(fabricante, modelo, placa, cor, cambio, quantidadePortas, tipoCombustivel,
                precoDiaria, quantidadeMarchas, quantidadePassageiros);
    }

    public static void alugarVeiculo(List<Veiculo> veiculosCadastrados, List<Veiculo> veiculosAlugados) {
        Scanner scan = new Scanner(System.in);

        if(veiculosAlugados.size() == veiculosCadastrados.size()) {
            System.out.println("-> ERRO: Todos os veículos estão alugados! Impossível alugar no momento.");
            return;
        }

        System.out.println("==============================");
        for(Veiculo veiculo : veiculosCadastrados) {
            if(!veiculo.isAlugado()) {
                veiculo.veiculoInformacoes();
                System.out.println("\n==============================");
            }
        }

        System.out.println("\n------------------------------");

        Veiculo veiculo;
        while(true) {

            try {

                System.out.print("Digite a placa do veículo para alugar (-999 para cancelar): ");
                String placa = scan.nextLine().toUpperCase();

                if(placa.equals("-999")) {
                    return;
                }

                veiculo = procurarVeiculo(veiculosCadastrados, placa);

                if(!validarDisponibilidade(veiculo, veiculosAlugados)) {
                    System.out.println("-> ERRO: Esse veículo já está alugado! Tente novamente com outro veículo.");
                    continue;
                }

                break;

            } catch(ProcurarVeiculoException procurarVeiculoException) {
                System.out.println("-> ERRO: Placa inválida! Tente novamente.");
            }

        }

        veiculo.setAlugado(true);
        veiculosAlugados.add(veiculo);
        System.out.println("------------------------------");
        System.out.println("Veículo alugado com sucesso!");
        System.out.println("------------------------------\n\n");
    }

    public static boolean validarDisponibilidade(Veiculo veiculo, List<Veiculo> veiculosAlugados) {
        for(Veiculo veiculoAlugado : veiculosAlugados) {
            if(veiculoAlugado == veiculo) {
                return false;
            }
        }

        return true;
    }

    public static void devolverVeiculo(List<Veiculo> veiculosAlugados) {
        Scanner scan = new Scanner(System.in);

        printarListaVeiculos(veiculosAlugados);

        System.out.println("\n------------------------------");

        Veiculo veiculo;
        while(true) {

            try {

                System.out.print("Digite a placa do veículo para devolver (-999 para cancelar): ");
                String placa = scan.nextLine().toUpperCase();

                if(placa.equals("-999")) {
                    return;
                }

                veiculo = procurarVeiculo(veiculosAlugados, placa);

                break;

            } catch(ProcurarVeiculoException procurarVeiculoException) {
                System.out.println("-> ERRO: Placa inválida! Tente novamente.");
            }

        }

        veiculo.setAlugado(false);
        veiculosAlugados.remove(veiculo);
        System.out.println("------------------------------");
        System.out.println("Veículo devolvido com sucesso!");
        System.out.println("------------------------------\n\n");
    }

    public static Veiculo procurarVeiculo(List<Veiculo> veiculosCadastrados, String placa)
            throws ProcurarVeiculoException {

        for(Veiculo veiculo : veiculosCadastrados) {
            if(veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }

        throw new ProcurarVeiculoException();
    }

    public static void printarListaVeiculos(List<Veiculo> listaVeiculos) {
        System.out.println("==============================");
        for(Veiculo veiculo : listaVeiculos) {
            veiculo.veiculoInformacoes();
            System.out.println("\n==============================");
        }
    }

    public static int lerOpcao(int limiteOpcao) {
        Scanner scan = new Scanner(System.in);

        int opcao;
        while(true) {

            try {

                System.out.print("Digite uma opção: ");
                opcao = scan.nextInt();

                while(opcao < 1 || opcao > limiteOpcao) {
                    System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();
                }

                break;

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();
            }

        }

        return opcao;
    }

    public static void lerFilesDAO(List<Veiculo> listaVeiculos, PopularFileDAO popularDAO,
                                   EsporteFileDAO esporteDAO, UtilitarioFileDAO utilitarioDAO) {

        List<Veiculo> veiculosPopular = popularDAO.read();
        List<Veiculo> veiculosEsporte = esporteDAO.read();
        List<Veiculo> veiculosUtilitario = utilitarioDAO.read();

        listaVeiculos.addAll(veiculosPopular);
        listaVeiculos.addAll(veiculosEsporte);
        listaVeiculos.addAll(veiculosUtilitario);
    }
}
