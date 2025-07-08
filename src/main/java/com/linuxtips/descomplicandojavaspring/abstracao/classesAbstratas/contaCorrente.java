package com.linuxtips.descomplicandojavaspring.abstracao.classesAbstratas;

import java.util.Scanner;

class contaCorrente extends Conta {

    @Override
    public void consultaSaldo() {
System.out.println("seu saldo é 1234. este valor esta vindo de class contaCorrente ");
  }
    @Override
    public void fazerPix() {
            Scanner in = new Scanner(System.in);
            System.out.println("digite o valor do pix. esta entrada esta vindo de class contaCorrente");
            double valorPix = 1;
            /* System.out.println("15.5" +valorPix);*/
            valorPix = in.nextDouble();
        System.out.println("o valor digitado do pix foi:"+valorPix);

    }

    @Override
    public void tipoDeconta() {

    }
}
