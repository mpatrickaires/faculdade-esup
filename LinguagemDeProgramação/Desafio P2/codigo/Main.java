package desafiop2;

import desafiop2.produtos.CategoriaProdutos;
import desafiop2.produtos.Produto;
import desafiop2.produtos.alimenticio.Alimenticio;
import desafiop2.produtos.eletronicos.Eletronico;
import desafiop2.produtos.limpeza.Limpeza;
import desafiop2.produtos.livros.CategoriaLivro;
import desafiop2.produtos.livros.FormatoLivro;
import desafiop2.produtos.livros.Livro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // CRIANDO LISTA DE PRODUTOS
        List<Produto> produtosCadastrados = new ArrayList<Produto>();


        // CADASTRANDO LIVROS
        Livro livro1 = new Livro("O Guia do Mochileiro das Galáxias", 20, CategoriaProdutos.LIVROS,
                "Douglas Adams", "Arqueiro", CategoriaLivro.FICCAO);
        livro1.setFormatoLivro(FormatoLivro.FISICO);
        livro1.setDescricao("Brochura, 208 páginas");
        livro1.setPromocaoAtiva(true);
        produtosCadastrados.add(livro1);

        Livro livro2 = new Livro("HTML, CSS e JavaScript", 45, CategoriaProdutos.LIVROS,
                "Rebeca Marinho", "Novo Horizonte", CategoriaLivro.ACADEMICO);
        livro2.setFormatoLivro(FormatoLivro.DIGITAL);
        livro2.setDescricao("Tamanho do arquivo: 4987 KB, 550 páginas");
        produtosCadastrados.add(livro2);

        Livro livro3 = new Livro("O Iluminado", 30, CategoriaProdutos.LIVROS,
                "Stephen King", "Suma", CategoriaLivro.TERROR);
        livro3.setFormatoLivro(FormatoLivro.FISICO);
        livro3.setDescricao("Capa dura, 513 páginas");
        livro3.setPromocaoAtiva(true);
        produtosCadastrados.add(livro3);


        // CADASTRANDO PRODUTOS ELETRÔNICOS
        Eletronico eletronico1 = new Eletronico("Televisão 4K 40\"", 1500,
                CategoriaProdutos.ELETRONICOS, "LG");
        eletronico1.adicionarComponente("HDMI");
        produtosCadastrados.add(eletronico1);

        Eletronico eletronico2 = new Eletronico("Notebook Acer Aspire 3", 1300,
                CategoriaProdutos.ELETRONICOS, "Acer");
        eletronico2.adicionarComponente("4GB RAM");
        eletronico2.adicionarComponente("1TB HD");
        eletronico2.setPromocaoAtiva(true);
        produtosCadastrados.add(eletronico2);

        Eletronico eletronico3 = new Eletronico("Lavadora de Roupas Turbo", 900,
                CategoriaProdutos.ELETRONICOS, "Electrolux");
        eletronico3.adicionarComponente("Painel digital");
        produtosCadastrados.add(eletronico3);


        // CADASTRANDO PRODUTOS ALIMENTÍCIOS
        Alimenticio alimenticio1 = new Alimenticio("Cereal Sucrilhos", 5,
                CategoriaProdutos.ALIMENTICIOS, "30/05/2022", "Kellogg's");
        alimenticio1.setPromocaoAtiva(true);
        produtosCadastrados.add(alimenticio1);

        Alimenticio alimenticio2 = new Alimenticio("Arroz Cristal 2Kg", 10,
                CategoriaProdutos.ALIMENTICIOS, "10/09/2025", "Cristal Alimentos");
        alimenticio2.setPromocaoAtiva(true);
        produtosCadastrados.add(alimenticio2);

        Alimenticio alimenticio3 = new Alimenticio("Guaraná Antarctica 2L", 2,
                CategoriaProdutos.ALIMENTICIOS, "25/02/2021", "Ambev");
        produtosCadastrados.add(alimenticio3);


        // CADASTRANDO PRODUTOS DE LIMPEZA
        Limpeza limpeza1 = new Limpeza("Água Sanitária 2L", 2.5, CategoriaProdutos.LIMPEZA);
        limpeza1.adicionarComposicao("Hipoclorito de Sódio");
        limpeza1.adicionarComposicao("Cloro Ativo");
        produtosCadastrados.add(limpeza1);

        Limpeza limpeza2 = new Limpeza("Óleo de Peroba", 4, CategoriaProdutos.LIMPEZA);
        limpeza2.adicionarComposicao("Óleo Mineral");
        limpeza2.adicionarComposicao("Óleo Vegetal");
        limpeza2.adicionarComposicao("Solvente Mineral");
        limpeza2.setPromocaoAtiva(true);
        produtosCadastrados.add(limpeza2);

        Limpeza limpeza3 = new Limpeza("Dertergente Líquido Clear", 0.50,
                CategoriaProdutos.LIMPEZA);
        limpeza3.adicionarComposicao("Sal de Amônio Quarternário");
        produtosCadastrados.add(limpeza3);


        // CADASTRANDO USUÁRIOS
        Usuario usuario1 = new Usuario("340.758.250-19", "Alícia Isabella",
                "aliciamoura@gmail.com");

        Usuario usuario2 = new Usuario("548.510.429-06", "Emilly Lúcia",
                "emilly@anbima.com.br");

        Usuario usuario3 = new Usuario("104.225.864-39", "César Leonardo",
                "cesarjosepaz_@agreonoma.eng.br");

        // CRIANDO CARRINHOS
        Carrinho carrinho1 = new Carrinho(usuario1);
        carrinho1.adicionarProduto(produtosCadastrados.get(0));
        carrinho1.adicionarProduto(produtosCadastrados.get(1));
        carrinho1.adicionarProduto(produtosCadastrados.get(8));
        carrinho1.adicionarProduto(produtosCadastrados.get(4));

        Carrinho carrinho2 = new Carrinho(usuario2);
        carrinho2.adicionarProduto(produtosCadastrados.get(7));
        carrinho2.adicionarProduto(produtosCadastrados.get(7));
        carrinho2.adicionarProduto(produtosCadastrados.get(8));
        carrinho2.adicionarProduto(produtosCadastrados.get(11));
        carrinho2.adicionarProduto(produtosCadastrados.get(11));

        Carrinho carrinho3 = new Carrinho(usuario3);
        carrinho3.adicionarProduto(produtosCadastrados.get(3));
        carrinho3.adicionarProduto(produtosCadastrados.get(5));
        carrinho3.adicionarProduto(produtosCadastrados.get(10));


        // FINALIZANDO COMPRAS
        System.out.println("================================");
        finalizarVenda(carrinho1);
        System.out.println("================================\n");

        System.out.println("================================");
        finalizarVenda(carrinho2);
        System.out.println("================================\n");

        System.out.println("================================");
        finalizarVenda(carrinho3);
        System.out.println("================================\n");


        // PRINTANDO LISTA DE PRODUTOS CADASTRADOS
        System.out.println("========== PRODUTOS CADASTRADOS ==========");
        printarProdutosCadastrados(produtosCadastrados);
        System.out.println("==========================================\n");


        // PREÇO TOTAL VENDIDO, PREÇO TOTAL DE COMPRA E LUCRO
        double totalVendas = calcularTotalVendas(produtosCadastrados);
        double totalCompras = calcularTotalCompras(produtosCadastrados);
        double lucro = totalVendas - totalCompras;

        System.out.println("========== E-COMMERCE ==========");
        System.out.printf("Valor Total de Vendas: R$%.2f\n", totalVendas);
        System.out.println("----------------------------------");
        System.out.printf("Valor Total de Compras: R$%.2f\n", totalCompras);
        System.out.println("----------------------------------");
        System.out.printf("Valor Total de Lucro: R$%.2f\n", lucro);
        System.out.println("================================");
    }

    public static void printarProdutosCadastrados(List<Produto> produtosCadastrados) {
        int index = 0;

        for(Produto produto : produtosCadastrados) {
            System.out.printf("[%d]   -> %s{valor=R$%.2f, vendidos=%d, promoção=%s}\n",
                    index, produto.getNome(), produto.getPrecoDeVenda(),
                    produto.getQuantidadeVendidos(), produto.isPromocaoAtiva());
            index++;
        }
    }

    public static void finalizarVenda(Carrinho carrinho) {
        System.out.println("Cliente: " + carrinho.getUsuario().getNome());
        System.out.println("------------ CARRINHO ------------");
        printarCarrinho(carrinho);
        System.out.println("----------------------------------");
        System.out.printf("Total da compra: R$%.2f\n", carrinho.getValorTotal());
        carrinho.finalizarCompra();
    }

    public static void printarCarrinho(Carrinho carrinho) {
        for(Produto produto : carrinho.getListaProdutos()) {
            System.out.printf("%s - R$%.2f\n", produto.getNome(), produto.getPrecoDeVenda());
        }
    }

    public static double calcularTotalVendas(List<Produto> listaProdutos) {
        double totalVendas = 0;

        for(Produto produto : listaProdutos) {
            totalVendas += produto.calcularValorTotalVendas();
        }

        return totalVendas;
    }

    public static double calcularTotalCompras(List<Produto> listaProdutos) {
        double totalCompras = 0;

        for(Produto produto : listaProdutos) {
            totalCompras += produto.calcularValorTotalCompras();
        }

        return totalCompras;
    }
}
