package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.matriz;

import java.util.Scanner;

public class matriz4x4 {

    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 int matriz[][] = new int[4][4];
 int conta_10=0;

 for(int i =0; i < matriz.length; i++){ //linha
     for(int j=0; j < matriz.length;j++){//coluna

         System.out.println("Informe o valor inteiro para a matriz["+i+"]"+"["+j+"] :");
         matriz[i][j]=Integer.parseInt(teclado.nextLine());

         if(matriz[i][j]>10)
             conta_10=conta_10+1;

     }

 }

        System.out.println("a matriz possui" + conta_10+ " valores maiores que 10");

    teclado.close();}
}

