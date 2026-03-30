
package com.mycompany.sem05.oo;

import classes.ControleEstoque;
import classes.Produto;

public class LojaEstoque {
    public static void main(String[] args) {
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
    }
}
