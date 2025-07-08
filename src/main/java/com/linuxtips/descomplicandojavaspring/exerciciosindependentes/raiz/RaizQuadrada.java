package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.raiz;

import java.util.Scanner;

public class RaizQuadrada {

    static Scanner scanner=new Scanner(System.in);


    public static void main(String[] Args){

        System.out.println("Digite um numero");
        int numero = Integer.parseInt(scanner.nextLine());
        double raiz = Math.sqrt(numero);

        //float quadrado = numero*numero;
        System.out.println("Sua raiz quadratica é "+raiz);
        scanner.close();
    }

}
