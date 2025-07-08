package com.linuxtips.descomplicandojavaspring.manipulandoArquivos.leituraArquivo;

import java.util.Scanner;

public class pedidoScanner {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor Insira o codigo do produto");
        String codigo = scanner.nextLine();

        System.out.println("Por favor Insira o a quantidade de itens deste produto");
        Integer quantidade = scanner.nextInt();

        System.out.println("Por favor Insira o valor do produto");
        Integer valor = scanner.nextInt();

        int total =  valor*quantidade;
        System.out.println(" O valor total da sua compra é: " +total);


    }

}
