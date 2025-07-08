package com.linuxtips.descomplicandojavaspring.exerciciosindependentes;

import java.util.Scanner;

public class senhaCorreta {

    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);

        int senha=123;

        System.out.println("Digite a senha");
        int entrada= scanner.nextInt();

        while (senha!= entrada){
            System.out.println("senha incorreta");
            entrada= scanner.nextInt();

        }
        System.out.println("ok");
    }
}
