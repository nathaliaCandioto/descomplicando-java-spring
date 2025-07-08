package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.numnegativo;

import java.util.Scanner;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}
