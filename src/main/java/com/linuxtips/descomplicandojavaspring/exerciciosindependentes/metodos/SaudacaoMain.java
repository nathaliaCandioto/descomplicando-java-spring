package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos;

public class SaudacaoMain {
    public static void main (String[]Args){
    Saudacao nome1 = new Saudacao();

    nome1.saudacao("Joaquim");
    nome1.somar(10,20);
    nome1.ehPar(21);
    System.out.println(nome1.ehPar (21));

    }
}
