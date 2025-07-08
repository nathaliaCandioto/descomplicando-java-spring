package com.linuxtips.descomplicandojavaspring.variaveisEtiposdeDados;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[]args){
        for (int i = 0; i<=100; i++){
            System.out.println("O contador i esta valendo "+i);
        }
Scanner in = new Scanner(System.in);
        var valorSecreto = 0;
        while (valorSecreto!=12345){
            System.out.println("Adivinhe o valor secretor");
            valorSecreto = in.nextInt();
        if(valorSecreto==12345){
                System.out.println("Parabens voce acertou");
            }else{
                System.out.println("Numero incorreto. Continue tentando");
            }
        }
        //do while
        Integer valor = 0;
        do {
            System.out.println(valor);
            valor++;
        }while (valor<=2);

    }
}
