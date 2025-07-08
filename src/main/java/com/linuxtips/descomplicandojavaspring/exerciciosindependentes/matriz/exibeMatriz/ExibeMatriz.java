package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.matriz.exibeMatriz;

import java.util.Scanner;

public class ExibeMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] exibeMatriz = new int[2][2];

        for (int i = 0; i < exibeMatriz.length; i++) {
            for (int j = 0; j < exibeMatriz.length; j++) {
                System.out.print("Insira o valor da posicao [" + i + "] [" + j + "]");
                exibeMatriz[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < exibeMatriz.length; i++) {
            for (int j = 0; j < exibeMatriz.length; j++) {
                System.out.println("["+exibeMatriz[i][j]+"]" +" ");

            }

        }
    }
}
