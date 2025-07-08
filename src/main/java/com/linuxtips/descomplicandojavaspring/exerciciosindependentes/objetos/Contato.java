package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.objetos;

public class Contato {

    private String nome;
    private int telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimir() {
        String nome = "dhfhdg";
        System.out.println(nome);
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.telefone);

    }

}

