package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos;

public class Saudacao {

    String nome;


    public static void saudacao(String nome) {
        System.out.format("Olá, %s ! Bem-vindo(a)!", nome);

    }

    public static int somar(int a, int b) {
        int soma = a + b;
        System.out.format(" a soma de %d com %d é igual a %d", a, b, soma);
        return soma;

    }

    public boolean ehPar(int c) {
        //return c % 2 == 0;
        if (c % 2 == 0) {
            //System.out.format("%d", c);
            return true;
        } else {
            //System.out.format("\n%d  é impar", c);
            return false;
        }

    }
}

