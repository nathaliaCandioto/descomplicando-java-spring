package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.produto.produtoEntity;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(Integer quantidade, Double preco, String nome) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}
