package visualizacao;

import modelo.carrinho.exception.AdicionarProdutoException;
import modelo.carrinho.exception.RemoverProdutoCarrinhoException;
import modelo.commerce.Commerce;
import modelo.commerce.exception.AlterarEstoqueException;
import modelo.commerce.exception.BuscarProdutoException;
import modelo.commerce.exception.CodigoJaExistenteException;
import modelo.produtos.Produto;
import modelo.produtos.dvd.Filme;
import modelo.produtos.dvd.Show;
import modelo.produtos.dvd.Software;
import modelo.produtos.livro.Genero;
import modelo.produtos.livro.Livro;
import modelo.produtos.perfume.Perfume;
import modelo.produtos.relogio.Relogio;
import modelo.produtos.relogio.TipoRelogio;
import modelo.usuario.Endereco;
import modelo.usuario.Usuario;
import visualizacao.exception.*;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Commerce commerce = new Commerce();

        MenuProdutos menuProdutos = new MenuProdutos(commerce);

        MenuVendas menuVendas = new MenuVendas(menuProdutos);

        MenuUsuario menuUsuario = new MenuUsuario();

        // CADASTRANDO PRODUTOS
        try {

            // CADASTRANDO LIVROS
            Livro livro1 = new Livro(9979, "Dom Quixote", 45, "Miguel de Cervantes",
                    Genero.ROMANCE);
            commerce.adicionarNovoProduto(livro1);
            Livro livro2 = new Livro(5860, "It: A Coisa", 30, "Stephen King",
                    Genero.TERROR);
            commerce.adicionarNovoProduto(livro2);
            Livro livro3 = new Livro(7533, "Neuromancer", 35, "William Gibson",
                    Genero.FICCAO);
            commerce.adicionarNovoProduto(livro3);

            // CADASTRANDO RELÓGIOS
            Relogio relogio1 = new Relogio(3293, "Mi Band 5", 230, "Xiaomi",
                    TipoRelogio.DIGITAL);
            commerce.adicionarNovoProduto(relogio1);
            Relogio relogio2 = new Relogio(6537, "Pro Diver Dourado", 610, "Invicta",
                    TipoRelogio.ANALOGICO);
            commerce.adicionarNovoProduto(relogio2);
            Relogio relogio3 = new Relogio(6719, "Casio Retro Vintage", 257, "Casio",
                    TipoRelogio.DIGITAL);
            commerce.adicionarNovoProduto(relogio3);

            // CADASTRANDO PERFUMES
            Perfume perfume1 = new Perfume(9637, "Man Eau de Toilette", 200,
                    "Mercedes Benz", 100);
            commerce.adicionarNovoProduto(perfume1);
            Perfume perfume2 = new Perfume(4885, "Coach Dreams Feminino", 300,
                    "Coach", 40);
            commerce.adicionarNovoProduto(perfume2);
            Perfume perfume3 = new Perfume(4041, "This Is Her", 690,
                    "Zadig & Voltaire", 100);
            commerce.adicionarNovoProduto(perfume3);

            // CADASTRANDO FILMES
            Filme filme1 = new Filme(5323, "Avatar", 25, "James Cameron",
                    2010);
            commerce.adicionarNovoProduto(filme1);
            Filme filme2 = new Filme(9294, "Capitão América: Guerra Civil", 19,
                    "Anthony Russo, Joe Russo", 2016);
            commerce.adicionarNovoProduto(filme2);
            Filme filme3 = new Filme(1056, "Toy Story 4", 30, "Josh Cooley",
                    2019);
            commerce.adicionarNovoProduto(filme3);

            // CADASTRANDO SHOWS
            Show show1 = new Show(5135, "Master Of Puppets", 23, "Metallica",
                    8);
            commerce.adicionarNovoProduto(show1);
            Show show2 = new Show(1529, "Nevermind", 18, "Nirvana",
                    13);
            commerce.adicionarNovoProduto(show2);
            Show show3 = new Show(1163, "Appetite For Destruction", 28, "Guns N' Roses",
                    12);
            commerce.adicionarNovoProduto(show3);

            // CADASTRANDO SOFTWARES
            Software software1 = new Software(5835, "VEGAS", 1470, "Pro 18",
                    "Windows 10 - Core i7 7ª Geração - 3,0 GHz - 16 GB RAM - 1,5 GB de Espaço em Disco");
            commerce.adicionarNovoProduto(software1);
            Software software2 = new Software(8892, "Intellij IDEA", 2500, "Ultimate",
                    "Windows 10/8 64 bits - 8 GB RAM - 2,5 GB de Espaço em Disco - " +
                            "Resolução Mínima de Tela de 1024x768");
            commerce.adicionarNovoProduto(software2);
            Software software3 = new Software(1896, "Windows 10", 1100, "Home",
                    "1,0 GHz - 1 GB RAM - 20 GB de Espaço em Disco - " +
                            "Resolução Mínima de Tela de 800x600");
            commerce.adicionarNovoProduto(software3);

            estocar(commerce);

        } catch(CodigoJaExistenteException codigoJaExistenteException) {
            System.out.println(codigoJaExistenteException.getMessage());
        }

        int opcao, sair;
        do {
            System.out.println("\n\n=====| E-COMMERCE |=====");
            System.out.println("[1] MENU DE PRODUTOS");
            System.out.println("[2] MENU DE USUÁRIO");
            if(menuUsuario.getUsuarioLogado() != null) {
                System.out.println("[3] MENU DE COMPRAS");
                System.out.println("[4] ENCERRAR PROGRAMA");
                sair = 4;
            }
            else {
                System.out.println("[3] ENCERRAR PROGRAMA");
                sair = 3;
            }
            System.out.println("========================");

            while(true) {

                try {

                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();

                    if(sair == 4) {
                        while (opcao < 1 || opcao > 4) {
                            System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                            System.out.print("Digite uma opção: ");
                            opcao = scan.nextInt();
                        }
                    }
                    else {
                        while (opcao < 1 || opcao > 3) {
                            System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                            System.out.print("Digite uma opção: ");
                            opcao = scan.nextInt();
                        }
                    }

                    break;

                } catch(InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor de entrada inválido! Tente novamente com um número inteiro.");
                    scan.next();
                }
            }

            limparTela();

            switch(opcao) {
                case 1:
                    acessarMenuProdutos(menuProdutos);
                    break;

                case 2:
                    acessarMenuUsuario(menuUsuario);
                    break;
            }

            if(menuUsuario.getUsuarioLogado() != null && opcao == 3) {
                acessarMenuCompras(menuVendas, menuUsuario);
            }

        } while(opcao != sair);

        System.out.println("=====| PROGRAMA ENCERRADO COM SUCESSO |=====");
    }

    public static void acessarMenuProdutos(MenuProdutos menuProdutos) {
        Scanner scan = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\n========| MENU PRODUTOS |========");
            System.out.println("[1] VISUALIZAR LISTA DE PRODUTOS");
            System.out.println("[2] BUSCAR PRODUTO PELO CÓDIGO");
            System.out.println("[3] VOLTAR AO MENU PRINCIPAL");
            System.out.println("================================");

            while(true) {

                try {

                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();

                    while (opcao < 1 || opcao > 3) {
                        System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                        System.out.print("Digite uma opção: ");
                        opcao = scan.nextInt();
                    }

                    break;

                } catch(InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor de entrada inválido! Tente novamente com um número inteiro.");
                    scan.next();
                }

            }

            limparTela();

            switch(opcao) {
                case 1:
                    menuProdutos.printarProdutos();
                    break;

                case 2:
                    int codigo;
                    while(true) {

                        try {

                            System.out.print("Digite o código do produto: ");
                            codigo = scan.nextInt();
                            break;

                        } catch(InputMismatchException inputMismatchException) {
                            System.out.println("-> ERRO: Valor de entrada inválido! " +
                                    "Tente novamente com um número inteiro.");
                            scan.next();
                        }
                    }

                    menuProdutos.buscarProduto(codigo);
                    System.out.println();
            }

        } while(opcao != 3);

    }

    public static void acessarMenuUsuario(MenuUsuario menuUsuario) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0, voltarMenuPrincipal = 0;

        do {

            System.out.println("\n\n=====| MENU USUÁRIO |=====");
            if(menuUsuario.getUsuarioLogado() == null) {
                System.out.println("[1] CADASTRAR NOVO USUÁRIO");
                System.out.println("[2] ENTRAR NA CONTA");
                System.out.println("[3] VOLTAR AO MENU PRINCIPAL");
                voltarMenuPrincipal = 3;
            }
            else {
                System.out.println("[1] SAIR DA CONTA");
                System.out.println("[2] ADICIONAR ENDEREÇO");
                System.out.println("[3] INFORMAÇÕES DA CONTA");
                System.out.println("[4] MUDAR ENDEREÇO DE ENTREGA");
                System.out.println("[5] VOLTAR AO MENU PRINCIPAL");
                System.out.println("-------------------------");
                System.out.println("Usuário: " + menuUsuario.getUsuarioLogado().getNome());
                voltarMenuPrincipal = 5;
            }

            System.out.println("=========================");
            while(true) {

                try {

                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();

                    switch(voltarMenuPrincipal) {
                        case 3:
                            while(opcao < 1 || opcao > 3) {
                                System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                                System.out.print("Digite uma opção: ");
                                opcao = scan.nextInt();
                            }
                            break;

                        case 5:
                            while(opcao < 1 || opcao > 5) {
                                System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                                opcao = scan.nextInt();
                            }
                            break;
                    }

                    break;

                } catch(InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor de entrada inválido! " +
                            "Tente novamente com um número inteiro.");
                    scan.next();
                }
            }

            limparTela();

            if(menuUsuario.getUsuarioLogado() == null) {
                switch (opcao) {
                    case 1:
                        try {
                            menuUsuario.cadastrar(cadastrarUsuario());
                            System.out.println("Cadastro efetuado com sucesso!");
                        } catch(CadastrarUsuarioException cadastrarUsuarioException) {
                            System.out.println(cadastrarUsuarioException.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            logarUsuario(menuUsuario);
                        } catch (UsuariosCadastradosException usuariosCadastradosException) {
                            System.out.println(usuariosCadastradosException.getMessage());
                        }
                        break;
                }
            }

            else {
                switch(opcao) {
                    case 1:
                        menuUsuario.deslogar();
                        break;

                    case 2:
                        Endereco novoEndereco = cadastrarEndereco();
                        menuUsuario.getUsuarioLogado().adicionarEndereco(novoEndereco);
                        break;

                    case 3:
                        menuUsuario.getUsuarioLogado().informacoesConta();
                        break;

                    case 4:
                        try {
                            mudarEnderecoEntrega(menuUsuario);
                        } catch(MudarEnderecoEntregaException mudarEnderecoEntregaException) {
                            System.out.println(mudarEnderecoEntregaException.getMessage());
                        }
                        break;
                }


            }
        } while(opcao != voltarMenuPrincipal);
    }

    public static Usuario cadastrarUsuario() {
        Scanner scan = new Scanner(System.in);

        String nome, cpf, dataNascimento, senha;
        Endereco endereco;

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("----------------------------");

        System.out.print("Digite seu CPF: ");
        cpf = scan.nextLine();

        System.out.println("----------------------------");

        System.out.print("Digite sua data de nascimento: ");
        dataNascimento = scan.nextLine();

        System.out.println("----------------------------");

        System.out.print("Digite sua senha: ");
        senha = scan.nextLine();

        System.out.println("----------------------------");
        endereco = cadastrarEndereco();

        return new Usuario(nome, cpf, dataNascimento, senha, endereco);
    }

    public static Endereco cadastrarEndereco() {
        Scanner scan = new Scanner(System.in);

        String cep, estado, cidade, bairro, logradouro;

        System.out.print("Digite o CEP: ");
        cep = scan.nextLine();

        System.out.println("----------------------------");

        System.out.print("Digite o Estado: ");
        estado = scan.nextLine();

        System.out.println("----------------------------");

        System.out.print("Digite a Cidade: ");
        cidade = scan.nextLine();

        System.out.println("----------------------------");

        System.out.print("Digite o Bairro: ");
        bairro = scan.nextLine();

        System.out.println("----------------------------");

        System.out.print("Digite o Logradouro: ");
        logradouro = scan.nextLine();

        System.out.println("----------------------------");

        return new Endereco(cep, estado, cidade, bairro, logradouro);
    }

    public static void logarUsuario(MenuUsuario menuUsuario) throws UsuariosCadastradosException {
        Scanner scan = new Scanner(System.in);

        String cpf, senha;

        System.out.print("Digite o CPF: ");
        cpf = scan.nextLine();
        System.out.print("Digite a senha: ");
        senha = scan.nextLine();

        menuUsuario.logar(cpf, senha);
    }

    public static void mudarEnderecoEntrega(MenuUsuario menuUsuario) throws MudarEnderecoEntregaException {
        Scanner scan = new Scanner(System.in);

        int numeroEndereco = 1;
        System.out.println("=====| ENDEREÇOS |=====");
        for(Endereco endereco : menuUsuario.getUsuarioLogado().getEnderecos()) {
            System.out.println("Endereço " + numeroEndereco);
            endereco.informacoesEndereco();
            System.out.println("----------------------------");
            numeroEndereco++;
        }

        System.out.print("\nDigite o CEP do novo endereço de entrega: ");
        String cep = scan.nextLine();

        for(Endereco endereco : menuUsuario.getUsuarioLogado().getEnderecos()) {
            if(endereco.getCep().equals(cep)) {
                menuUsuario.getUsuarioLogado().definirEnderecoEntrega(endereco);
                System.out.println("Endereço alterado com sucesso!");
                return;
            }
        }

        throw new MudarEnderecoEntregaException();
    }

    public static void acessarMenuCompras(MenuVendas menuVendas, MenuUsuario menuUsuario) {
        Scanner scan = new Scanner(System.in);

        menuVendas.setUsuarioAtual(menuUsuario.getUsuarioLogado());

        int opcao = 0, voltarMenuPrincipal = 0;

        do {

            System.out.println("\n\n=====| MENU COMPRAS |=====");
            if(menuVendas.getCarrinhoAtual() == null) {
                System.out.println("[1] ABRIR NOVO CARRINHO");
                System.out.println("[2] CONFIRMAR ENTREGA");
                System.out.println("[3] VOLTAR AO MENU PRINCIPAL");
                voltarMenuPrincipal = 3;
            }
            else {
                System.out.println("------------ Carrinho ------------");
                menuVendas.getCarrinhoAtual().printarProdutos();
                System.out.println("----------------------------------");
                System.out.printf("Valor Total: R$%.2f\n", menuVendas.getCarrinhoAtual().getValorTotal());
                System.out.println("----------------------------------");
                System.out.println("[1] ADICIONAR PRODUTO AO CARRINHO");
                System.out.println("[2] REMOVER PRODUTO DO CARRINHO");
                System.out.println("[3] FECHAR CARRINHO");
                System.out.println("[4] CANCELAR COMPRA");
                voltarMenuPrincipal = 5;
            }

            while(true) {
                try {

                    System.out.println("=========================");
                    System.out.print("Digite uma opção: ");
                    opcao = scan.nextInt();

                    if(menuVendas.getCarrinhoAtual() == null) {
                        while(opcao < 1 || opcao > 3) {
                            System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                            System.out.print("Digite uma opção: ");
                            opcao = scan.nextInt();
                        }
                    }
                    else {
                        while(opcao < 1 || opcao > 4) {
                            System.out.println("-> ERRO: Opção inválida! Tente novamente.");
                            System.out.print("Digite uma opção: ");
                            opcao = scan.nextInt();
                        }
                    }

                    break;

                } catch(InputMismatchException inputMismatchException) {
                    System.out.println("-> ERRO: Valor de entrada inválido! " +
                            "Tente novamente com um número inteiro.");
                    scan.next();
                }
            }

            limparTela();

            if(menuVendas.getCarrinhoAtual() == null) {
                switch(opcao) {
                    case 1:
                        menuVendas.abrirCarrinho(menuUsuario.getUsuarioLogado());
                        break;

                    case 2:
                        try {
                            confirmarEntrega(menuVendas);
                            System.out.println("Compra confirmada com sucesso!");
                            break;
                        } catch(ComprasUsuarioAguardandoException comprasUsuarioAguardandoException) {
                            System.out.println(comprasUsuarioAguardandoException.getMessage());
                        }
                }
            }
            else {
                switch(opcao) {
                    case 1:
                        adicionarProdutoCarrinho(menuVendas);
                        break;

                    case 2:
                        if(menuVendas.getCarrinhoAtual().getProdutos().isEmpty()) {
                            System.out.println("-> ERRO: Carrinho vazio! Impossível realizar a remoção de produto.");
                            break;
                        }
                        removerProdutoCarrinho(menuVendas);
                        break;

                    case 3:
                        try {
                            menuVendas.fecharCarrinho();
                            System.out.println("Carrinho fechado com sucesso!");
                            break;
                        } catch(FecharCarrinhoException fecharCarrinhoException) {
                            System.out.println(fecharCarrinhoException.getMessage());
                            break;
                        }

                    case 4:
                        menuVendas.cancelarCompra();
                }
            }

        } while(opcao != voltarMenuPrincipal || menuVendas.getCarrinhoAtual() != null);
    }

    public static void confirmarEntrega(MenuVendas menuVendas) throws ComprasUsuarioAguardandoException {
        if(menuVendas.getUsuarioAtual().getCompras().isEmpty()) {
            throw new ComprasUsuarioAguardandoException();
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("=====| COMPRAS EM ABERTO |=====");
        menuVendas.comprasAguardandoUsuario();
        System.out.println("===============================");

        int codigo = 0;
        while(true) {
            try {
                System.out.print("Digite o código da compra que deseja confirmar entrega (-1 para cancelar): ");
                codigo = scan.nextInt();

                while(!menuVendas.validarCodigoCompra(codigo) && codigo != -1) {
                    System.out.println("-> ERRO: Código inválido! Tente novamente.");
                    System.out.print("Digite o código da compra que deseja confirmar entrega (-1 para cancelar): ");
                    codigo = scan.nextInt();
                }

                if(codigo == -1) {
                    return;
                }

                menuVendas.confirmarEntrega(codigo);
                break;
            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();
            }
        }
    }

    public static void adicionarProdutoCarrinho(MenuVendas menuVendas) {
        Scanner scan = new Scanner(System.in);

        System.out.println("CÓDIGO -> PRODUTO");
        menuVendas.getMenuProdutos().printarProdutos();

        System.out.println("\n=======================");

        while(true) {

            try {

                System.out.print("Digite o código do produto que deseja adicionar (-1 para cancelar): ");
                int codigo = scan.nextInt();

                if(codigo == -1) {
                    return;
                }

                Produto produto = menuVendas.getMenuProdutos().retornarProduto(codigo);
                menuVendas.getCarrinhoAtual().adicionarProduto(produto);
                break;

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();

            } catch(BuscarProdutoException buscarProdutoException) {
                System.out.println(buscarProdutoException.getMessage());
            } catch(AdicionarProdutoException adicionarProdutoException) {
                System.out.println(adicionarProdutoException.getMessage());
            }
        }
    }

    public static void removerProdutoCarrinho(MenuVendas menuVendas) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------------ Carrinho ------------");
        menuVendas.getCarrinhoAtual().printarProdutos();
        System.out.println("----------------------------------");

        while(true) {

            try {

                System.out.print("Digite o código do produto que deseja remover (-1 para cancelar): ");
                int codigo = scan.nextInt();

                if(codigo == -1) {
                    return;
                }

                menuVendas.getCarrinhoAtual().removerProduto(codigo);
                return;

            } catch(InputMismatchException inputMismatchException) {
                System.out.println("-> ERRO: Valor de entrada inválido! " +
                        "Tente novamente com um número inteiro.");
                scan.next();

            } catch(RemoverProdutoCarrinhoException removerProdutoCarrinhoException) {
                System.out.println(removerProdutoCarrinhoException.getMessage());
            }
        }

    }

    public static void estocar(Commerce commerce) {
        Random random = new Random();

        try {

            for (Produto produto : commerce.getListaProdutos()) {
                for (int contador = 0; contador < random.nextInt(10); contador++) {
                    commerce.aumentarEstoqueProduto(produto.getCodigo());
                }
            }

        } catch(AlterarEstoqueException alterarEstoqueException) {
            System.out.println(alterarEstoqueException.getMessage());
        }
    }

    public static void limparTela() {
        for(int contador = 0; contador < 50; contador++) {
            System.out.println();
        }
    }
}
