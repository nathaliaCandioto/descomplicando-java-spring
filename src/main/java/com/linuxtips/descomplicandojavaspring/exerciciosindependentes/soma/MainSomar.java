package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.soma;

import java.util.Scanner;

public class MainSomar {

    public static void main (String[] Args){

        Scanner scanner = new Scanner(System.in);
        int soma =0;

        for (int i=1; i <=3 ; i++){

            System.out.println("Digite um numero");
            int entrada = Integer.parseInt(scanner.nextLine());
            soma = soma +entrada;

        }
        System.out.println(" soma = 10"+soma);
        scanner.close();
    }


    }

