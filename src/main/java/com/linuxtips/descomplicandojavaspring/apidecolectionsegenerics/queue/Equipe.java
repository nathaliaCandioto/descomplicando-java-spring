package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue;

public class Equipe {

    public String nome;
    public int saldoDepontos;
    public int contadorDeEquipes=5;

    //define o construtor da classe Equipe, inicializa os atributos nome e saldodepontos
    //o this diferencia os atributos da classe(nome esaldodepontos) das variaveis do construtor.

    public Equipe(String equipe, int saldoDepontos) {
        this.nome = equipe;
        this.saldoDepontos = saldoDepontos;


    }

    @Override
    public String toString() {
        return "Equipe " +nome+ " está com a pontuação " +saldoDepontos;
    }
}