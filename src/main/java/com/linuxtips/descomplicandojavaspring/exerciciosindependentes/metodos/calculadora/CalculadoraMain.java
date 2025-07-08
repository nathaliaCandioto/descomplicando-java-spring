package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos.calculadora;

import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {

        Calculadora calc1= new Calculadora();
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o primeiro valor");
        calc1.setValor1(entrada.nextDouble());

        System.out.println("Digite o segundo valor");
        calc1.setValor2(entrada.nextDouble());

         System.out.println("****Multiplicação****\n"+calc1.multiplicar());
        System.out.println("****Soma****\n"+calc1.somar());
        System.out.println("****subtracao****\n"+calc1.subtrair());
        System.out.println("****divisao****\n"+calc1.dividir());

         entrada.close();
    }
}
