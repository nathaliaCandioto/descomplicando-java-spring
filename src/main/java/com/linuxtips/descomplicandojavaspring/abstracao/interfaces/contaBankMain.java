package com.linuxtips.descomplicandojavaspring.abstracao.interfaces;

public class contaBankMain {

        public static void main(String[]args){

            contaCorrente ccCliente1 = new contaCorrente();
            System.out.println("Conta corrente do Cliente: \n" +ccCliente1);
            ccCliente1.consultaSaldo();
            ccCliente1.fazerPix();

            contaCorrente cpCliente1 = new contaCorrente();
            System.out.println("Conta Poupanca do Cliente: \n "+cpCliente1);
            cpCliente1.consultaSaldo();
            cpCliente1.fazerPix();

    }
}
