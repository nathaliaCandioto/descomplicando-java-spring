package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos.imc;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos.CalculoDeArea;

import java.util.Scanner;

public class CalculaImcMain {

    public static void main(String[] Args){
        Scanner entrada  = new Scanner(System.in);
        CalculaImc calcA=new CalculaImc();

        System.out.println("digite a sua altura:");
        calcA.setAltura(entrada.nextDouble());
        System.out.println("Digite seu peso");
        calcA.setPeso(entrada.nextDouble());
        Double imc = calcA.calImc();
        System.out.format("seu imc é igual %f %s",imc,calcA.imc(imc));


    }
}
