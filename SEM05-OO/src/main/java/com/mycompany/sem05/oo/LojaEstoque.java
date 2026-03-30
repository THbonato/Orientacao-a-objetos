
package com.mycompany.sem05.oo;

import classes.ControleEstoque;
import classes.Produto;
import java.util.Scanner;

public class LojaEstoque {
    public static void main(String[] args) {
        /*
        // Criando o controle de estoque
        ControleEstoque controleDeEstoque = new ControleEstoque();

        // Criando produtos
        Produto produto1 = new Produto();
        produto1.setCodigo("P001");
        produto1.setNome("Teclado Mecânico");
        produto1.setQuant_estoque(10);

        Produto produto2 = new Produto();
        produto2.setCodigo("P002");
        produto2.setNome("Mouse Gamer");
        produto2.setQuant_estoque(15);

        // Adicionando produtos ao estoque
        controleDeEstoque.adicionarProduto(produto1);
        controleDeEstoque.adicionarProduto(produto2);

        // Listando produtos no estoque
        System.out.println("Produtos no estoque após adição: ");
        controleDeEstoque.listarProdutos();

        // Atualizando a quantidade de um produto
        controleDeEstoque.atualizaQuantidade("P001", 8);

        // Listando produtos no estoque após atualização
        System.out.println("Produtos no estoque após atualização: ");
        controleDeEstoque.listarProdutos();

        // Buscando e mostrando um produto específico
        Produto buscado = controleDeEstoque.buscarProduto("P002");
        if (buscado != null) {
            System.out.println("Produto buscado: " + buscado);
        } else {
            System.out.println("Produto não encontrado.");
        }

        // Removendo um produto
        controleDeEstoque.removerProduto("P002");

        // Listando produtos no estoque após remoção
        System.out.println("Produtos no estoque após remoção: ");
        controleDeEstoque.listarProdutos();
        */
        
        ControleEstoque gerente = new ControleEstoque();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        
        do {            
            System.out.println("__________________________");
            System.out.println("__Gerenciador de Estoque__");
            System.out.println("Press 1: Adicionar Produto");
            System.out.println("Press 2: Remover Produto");
            System.out.println("Press 3: Atualizar Quantidade no Estoque");
            System.out.println("Press 4: Listar Produtos");
            System.out.println("Press 5: Buscar Produto");
            System.out.println("Press 0: Sair");
            System.out.println("__________________________");
            System.out.print("Escolha uma das Opções: ");
            opcao = ler.nextInt();
            ler.nextLine();
            
            if(opcao == 1){
                System.out.print("Informe o Código do Produto: ");
                String codigoProduto = ler.nextLine();
                System.out.print("Informe o Nome do Produto: ");
                String nomeProduto = ler.nextLine();
                System.out.print("Informe a Quantidade: ");
                int quantidadeEmEstoque = ler.nextInt();
                ler.nextLine();

                Produto novoProduto = new Produto();
                novoProduto.setCodigo(codigoProduto);
                novoProduto.setNome(nomeProduto);
                novoProduto.setQuant_estoque(quantidadeEmEstoque);
                gerente.adicionarProduto(novoProduto);
            }else if(opcao == 2){
                System.out.print("Informe o Código do Produto que deseja Remover: ");
                String codigoProduto = ler.nextLine();
                gerente.removerProduto(codigoProduto);
            }else if(opcao == 3){
                System.out.print("Informe o Código do Produto: ");
                String codigoProduto = ler.nextLine();
                System.out.print("Informe a Nova Quantidade: ");
                int novaQuantidade = ler.nextInt();
                ler.nextLine();
                gerente.atualizaQuantidade(codigoProduto, novaQuantidade);  
            }else if(opcao == 4){
                gerente.listarProdutos();
            }else if(opcao == 5){
                System.out.print("Informe o Código do Produto que deseja Buscar: ");
                String codigoProduto = ler.nextLine();
                Produto encontrado = gerente.buscarProduto(codigoProduto);
                System.out.println(encontrado);
            }else{
                System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }
}
