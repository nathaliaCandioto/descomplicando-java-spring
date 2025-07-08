package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.multiplos;

public class CincoMultiplos {

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 5; i++) {
            int multiplo = 3;
            int mutiplicador = multiplo * i;

            System.out.println(" " + mutiplicador);
        }
        for (int i = 1; i <= 100; i++) {

            System.out.println(" " + i);
        }
        while (contador <= 100) {
            System.out.println(" " + contador);
            contador++;
        }
    }
}
