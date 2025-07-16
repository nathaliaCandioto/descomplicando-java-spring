package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.entity;

public class Pessoa {

    private String nome,email,documento;
    private Integer telefone;


    Pessoa(String nome,String email,String documento,Integer telefone){
        this.nome=nome;
        this.email=email;
        this.documento=documento;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", documento='" + documento + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
