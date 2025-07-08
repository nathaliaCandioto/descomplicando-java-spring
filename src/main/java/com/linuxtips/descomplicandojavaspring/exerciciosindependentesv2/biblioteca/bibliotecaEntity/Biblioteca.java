package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.biblioteca.bibliotecaEntity;

public class Biblioteca {
    private String titulo;
    private String autor;
    private String categoria;
    private Integer quantidade;

    public Biblioteca(String titulo, String autor, String categoria, Integer quantidade){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.quantidade=quantidade;

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
