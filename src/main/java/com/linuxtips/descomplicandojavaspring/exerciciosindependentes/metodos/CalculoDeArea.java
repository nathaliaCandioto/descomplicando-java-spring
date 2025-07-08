package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos;


public class CalculoDeArea {

    public Double areaRetangulo(Double base, Double altura) {
        Double areaRetangulo = base * altura;
        //System.out.format("A area do retangulo é %d", areaRetangulo);
        return areaRetangulo;

    }
public  Double trianguloRetangulo(Double catetoA, Double catetoB){
        Double hipotenuza=Math.pow(catetoA,2)+Math.pow(catetoB,2);
        return  hipotenuza;
}

}