package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.faixaetaria;

import java.util.Scanner;

public class FaixaEtaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        //int idade = Integer.parseInt(scanner.nextLine());

        if (idade <= 12) {
            System.out.println("A idade " + idade + " é classificada como Criança");

        } else if (idade >= 13 || idade <= 17) {
            System.out.println("A idade " + idade + " é classificada como Adolescente");
        } else if (idade >= 18 || idade <= 59) {
            System.out.println("A idade " + idade + " é classificada como Adulto");
        } else {

            System.out.println("A idade " + idade + " é classificada como idoso");

        }

    scanner.close();
    }
}
