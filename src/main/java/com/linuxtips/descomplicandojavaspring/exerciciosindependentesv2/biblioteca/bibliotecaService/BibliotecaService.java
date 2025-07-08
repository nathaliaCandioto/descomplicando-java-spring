package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.biblioteca.bibliotecaService;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.biblioteca.bibliotecaEntity.Biblioteca;

import java.util.ArrayList;

public class BibliotecaService {
    ArrayList<Biblioteca> livros = new ArrayList<>();

    public void cadastraLivros(String titulo, String autor, String categoria, Integer quantidade) {
        boolean existe = false;

        Biblioteca livro = new Biblioteca(titulo, autor, categoria, quantidade);
        for (int i = 0; i < livros.size(); i++) {
            Biblioteca l = livros.get(i);

            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                l.setQuantidade(l.getQuantidade() + quantidade);
                existe = true;
                break;
            }

        }
        if (!existe) {
            livros.add(livro);
        }
    }

    public void listaLivros() {
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }

    }

    public void listaPorAutor(String autor) {
        for (Biblioteca l : livros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(l);

            }

        }
    }

    public void emprestarLivro(String titulo) {
        for (Biblioteca l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                l.setQuantidade(l.getQuantidade() - 1);
                System.out.println("Unidades restantes: " + l.getQuantidade());
            }
        }
    }

    public void devolverLivro(String titulo) {
        for (Biblioteca l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                if (l.getQuantidade() > 0) {
                    l.setQuantidade(l.getQuantidade() + 1);
                    System.out.println("Unidades restantes: " + l.getQuantidade());
                }
            }
        }
    }

    public void removeLivros(String titulo, String autor) {
            livros.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo) && l.getAutor().equalsIgnoreCase(autor));
    }
}
