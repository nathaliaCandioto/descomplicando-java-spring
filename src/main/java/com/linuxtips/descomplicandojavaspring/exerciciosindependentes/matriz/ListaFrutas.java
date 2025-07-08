package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.matriz;

import java.util.Scanner;

public class ListaFrutas {
    //deve inserir numero de frutas
    //armazernar nº de frutas
    //receber de entrada numero de frutas
    //imprimir lista  de frutas
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdFrutas;
        String ListaFrutas[];

        System.out.println("Informe a qtd de frutas");
        qtdFrutas = Integer.parseInt(entrada.nextLine());

        ListaFrutas = new String[qtdFrutas];

        for (int i=0; i< qtdFrutas; i++) {
            System.out.println("Informe o nome de fruta");
            ListaFrutas[i] = entrada.nextLine();

            System.out.println(ListaFrutas[i]);
        }
            entrada.close();
    }
}
