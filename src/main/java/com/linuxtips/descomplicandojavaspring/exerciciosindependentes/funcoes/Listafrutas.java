package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.funcoes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Listafrutas {

    int numeroFrutas;
    String[] frutas;
    Scanner entrada = new Scanner(System.in);

    public void listarFrutas() {

        System.out.println("quantidade de frutas a cadastrar");
        numeroFrutas = Integer.parseInt(entrada.nextLine());
        frutas = new String[numeroFrutas];
        for (int i = 0; i < numeroFrutas; i++) {

            System.out.println("Nome da fruta");
            frutas[i] = entrada.nextLine();
            //System.out.println("" + frutas[i]);

        }
        List<String> frutasInformadas = Arrays.asList(frutas);//convertendo arrY EM LISTA
        frutasInformadas.forEach(System.out::println);
    }
}


