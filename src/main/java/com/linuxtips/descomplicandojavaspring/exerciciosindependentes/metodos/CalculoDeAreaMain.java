package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos;

public class CalculoDeAreaMain {
    public static void main(String[] Args) {
        CalculoDeArea retangulo = new CalculoDeArea();
        CalculoDeArea trianguloRetangulo =new CalculoDeArea();

        //retangulo.areaRetangulo(10, 15);


        System.out.format("A area do retangulo é %.1f", retangulo.areaRetangulo(10d,15d));
        System.out.format("\nO calculo da hipotenuza é %.1f",trianguloRetangulo.trianguloRetangulo(2d,3d));

    }


}