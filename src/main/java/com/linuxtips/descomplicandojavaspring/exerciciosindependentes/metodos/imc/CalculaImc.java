package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos.imc;

public class CalculaImc {
    Double peso;
    Double altura;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double calImc(){
        Double imc = this.peso / Math.pow(altura, 2);
        return imc;

    }

    public String imc(Double imc) {

        if (imc < 18.5) {
            return "Abaixo do peso";

        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";

        } else if (imc == 25 && imc <= 29.9) {
            return "Sobrepeso";

        } else {
            return "obesidade";
        }

    }
}
