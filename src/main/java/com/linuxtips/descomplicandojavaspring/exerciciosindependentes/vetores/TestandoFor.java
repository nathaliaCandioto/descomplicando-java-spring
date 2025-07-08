package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.vetores;

public class TestandoFor {

    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length;i++) {
            numeros[i]=i+3;

            System.out.println(numeros[i]);

        }
    }

}
