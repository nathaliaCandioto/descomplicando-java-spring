package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.produto.produtoService;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.produto.produtoEntity.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProdutoService {

    ArrayList<Produto> produtos = new ArrayList<>();
//    public void adcionarEstoque(nome){

    //    }
    public void cadastraProdutos(String nome, Integer quantidade, Double preco) {
        Produto produto = new Produto(quantidade, preco, nome);

        boolean encontrado = false;

        for (int i = 0; i < produtos.size(); i++) {
            //System.out.println(produtos.get(i));
            Produto p = produtos.get(i);

            if (p.getNome().equalsIgnoreCase(nome)) {
                p.setQuantidade(p.getQuantidade() + quantidade);
                p.setPreco(preco);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            produtos.add(produto);
        }
    }

    public void listarProduto() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }

    public void checarEstoque(String prodEstoque) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getNome().equalsIgnoreCase(prodEstoque)) {
                i++;
                System.out.println(" - " + p.getQuantidade() + " " + p.getNome() + "(s) no estoque");

            }
        }

    }

    public void atualizaEstoque(String nome, Integer quantidade) {
        for (Produto p : produtos) {

            if (p.getNome().equals(nome)) {
                Integer quantAntiga = p.getQuantidade();
                Integer quantidadeNova = quantAntiga - quantidade;
                p.setQuantidade(p.getQuantidade() - quantidade);

                System.out.println("quantidade antiga => " + quantAntiga + " quantidade nova = > " + quantidadeNova);
            }

        }
    }

    public void exibeProdutos() {
        for (Produto p : produtos) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: R$ " + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade());
            Double valorEmEstoque = p.getPreco() * p.getQuantidade();
            System.out.println("Valor em estoque: " + valorEmEstoque);
        }
    }

    public void ordenaPreco() {

        Collections.sort(produtos, new Comparator<Produto>() {
            @Override
            public int compare(Produto o1, Produto o2) {
                if (o1.getPreco() < o2.getPreco()) {
                    return -1;
                } else if (o1.getPreco() > o2.getPreco()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });


    }

    public void ordenaPreco2() {
        Collections.sort(produtos,(p1,p2)->p1.getPreco().compareTo(p2.getPreco()));
    }

    public void atualizaPreco(String Nomeproduto,Double preco){
        for(Produto p:produtos){
            if (p.getNome().equalsIgnoreCase(Nomeproduto)){
                p.setPreco(preco);
            }
        }
    }

    public void removeProduto(String nome){

        produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }
}

