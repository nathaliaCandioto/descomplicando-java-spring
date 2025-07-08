package com.linuxtips.descomplicandojavaspring.abstracao.classesAbstratas;

import java.util.Scanner;

class contaPoupanca extends Conta {

    @Override
    public void consultaSaldo() {
        System.out.println("Saldo da conta Poupanca: 1987\n Este valor esta vindo da clas contaPoupanca" );
    }

    @Override
    public void fazerPix() {
        Scanner in = new Scanner(System.in);
        System.out.println("digite o valor do pix . \n Este valor esta vindo de Class Poupanca");
        double valorPix = 0d;
        /* System.out.println("15.5" +valorPix);*/
        valorPix = in.nextDouble();
        System.out.println("o valor digitado do pix foi:"+valorPix);

    }

    @Override
    public void tipoDeconta() {

    }

}
