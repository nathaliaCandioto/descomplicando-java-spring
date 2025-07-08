package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.produto;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.produto.produtoEntity.Produto;
import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.produto.produtoService.ProdutoService;

import java.util.Scanner;

public class ProdutoMain {

    public static void main(String[] Args) {

        ProdutoService produtoService = new ProdutoService();
        inicializa(produtoService);
        Scanner entrada = new Scanner(System.in);

//        System.out.println("Quantos cadastros deseja fazer?");
//        Integer resposta = Integer.parseInt(entrada.nextLine());
//
//        for (int i = 0; i < resposta; i++) {
//
//            System.out.println("Informe o nome do produto");
//            String nome = entrada.nextLine().trim();
//            System.out.println("Informe a quantidade produto");
//            Integer quantidade = Integer.parseInt(entrada.nextLine().trim());
//            System.out.println("Informe o preço produto");
//            Double preco = Double.parseDouble(entrada.nextLine().trim());
//
//            produtoService.cadastraProdutos(nome, quantidade, preco);
//        }

        System.out.println("Informe o nome do produto que deseja consultar estoque");
        String prodEstoque = entrada.nextLine().trim();
        produtoService.checarEstoque(prodEstoque);

        System.out.println("Informe o nome do produto que deseja ATUALIZAR no estoque");
        String nome=entrada.nextLine().trim();
        System.out.println("Informe a QUANTIDADE Do produto que deseja ATUALIZAR do estoque");
        Integer quantidade=Integer.parseInt(entrada.nextLine().trim());

        produtoService.atualizaEstoque(nome,quantidade);
        produtoService.listarProduto();
        produtoService.exibeProdutos();

        System.out.println("Produto ordenado por preço");
        produtoService.ordenaPreco();
        produtoService.listarProduto();

        System.out.println("Atualizar preço do produto");
        produtoService.atualizaPreco("d",10.5);
        produtoService.listarProduto();
        System.out.println("REMOVER PRODUTO");
        produtoService.removeProduto("c");

        System.out.println("NOVA LISTA DE PRODUTOS");
        produtoService.listarProduto();


    }

    private static void inicializa(ProdutoService produtoService){
        produtoService.cadastraProdutos("a",2,10.5);
        produtoService.cadastraProdutos("b",3,8.5);
        produtoService.cadastraProdutos("c",3,5.5);
        produtoService.cadastraProdutos("d",3,9.5);
    }

}
