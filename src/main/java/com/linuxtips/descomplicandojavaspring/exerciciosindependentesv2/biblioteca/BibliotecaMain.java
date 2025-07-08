package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.biblioteca;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.biblioteca.bibliotecaService.BibliotecaService;

public class BibliotecaMain {
    public static void main(String[] Args) {

        BibliotecaService bibliotecaService = new BibliotecaService();

        System.out.println("*******CADASTRO DE LIVROS");
        bibliotecaService.cadastraLivros("Dom Casmurro", "Machado de Assis", "Romance", 3);

        inicializa(bibliotecaService);

        System.out.println("*******LISTA DE LIVROS");
        bibliotecaService.listaLivros();

        System.out.println("*******LISTAR POR AUTOR");
        bibliotecaService.listaPorAutor("Machado de Assis");

        System.out.println("*******EMPRESTAR LIVRO");
        bibliotecaService.emprestarLivro("Dom Casmurro");

        System.out.println("*******DEVOLVER LIVRO");
        bibliotecaService.devolverLivro("Dom Casmurro");
    }

    public static void inicializa(BibliotecaService bibliotecaService) {
        bibliotecaService.cadastraLivros("Dom Casmurro", "Machado de Assis", "Romance", 3);
        bibliotecaService.cadastraLivros("O Iluminado", "Stephen King", "Terror", 2);
        bibliotecaService.cadastraLivros("Orgulho e Preconceito", "Jane Austen", "Romance", 4);
        bibliotecaService.cadastraLivros("O Código Da Vinci", "Dan Brown", "Suspense", 5);
        bibliotecaService.cadastraLivros("Drácula", "Bram Stoker", "Terror", 3);
        bibliotecaService.cadastraLivros("A Garota no Trem", "Paula Hawkins", "Suspense", 2);


    }


}
