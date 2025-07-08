package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.cliente;

public class contaClienteMain {
    public static void main (String[]Args){
        Cliente cliente1 = new Cliente("joao","fjdhfh hjgfjgf");
        Conta conta1 = new Conta(2525,25f,2000f,cliente1);

        System.out.println("saldo de joao antes do saque "+ conta1.saldo);
    conta1.sacar(5.00f);

        System.out.println("saldo de joao apos o saque "+ conta1.saldo);

    }

}
