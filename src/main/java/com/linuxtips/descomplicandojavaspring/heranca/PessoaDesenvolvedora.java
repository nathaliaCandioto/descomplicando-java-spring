package com.linuxtips.descomplicandojavaspring.heranca;

public class PessoaDesenvolvedora {

    public PessoaDesenvolvedora(String nome, String stack, Double salario) {
        this.nome = nome;
        this.stack = stack;
        this.salario = salario;
    }

    private String nome;
    private String stack;
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

public void codar(){

        System.out.println("bora codar");
}

}
