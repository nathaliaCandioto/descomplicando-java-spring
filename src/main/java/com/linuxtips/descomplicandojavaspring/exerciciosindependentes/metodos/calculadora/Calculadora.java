package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos.calculadora;

public class Calculadora {

    private Double valor1 =159d;
    private Double valor2=59d;

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public Double somar() {
        Double soma = valor1 + valor2;
        return soma;

    }

    public Double multiplicar() {
        Double multiplicacao = valor1 * valor2;
        return multiplicacao;
    }

    public  Double subtrair(){
        return  valor1 - valor2;
    }

    public  Double dividir(){
        return  valor1 / valor2;
    }


}
