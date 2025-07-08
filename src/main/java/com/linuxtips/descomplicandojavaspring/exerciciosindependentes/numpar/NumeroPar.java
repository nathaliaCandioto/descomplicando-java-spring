package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.numpar;

import java.util.Scanner;

public class NumeroPar {

public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero inteiro");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero " + numero + " par");
        } else {
            System.out.println("numero " + numero + " impar");
        }
        scanner.close();
    }

}
