package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.entity;

public class Vendedor extends Pessoa{
    private Integer salario;
    private Integer comissao;

    public  Vendedor(String nome,String email,String documento,Integer telefone,Integer salario,Integer comissao){
        super(nome,email, documento,telefone);
        this.comissao=comissao;
        this.salario=salario;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getComissao() {
        return comissao;
    }

    public void setComissao(Integer comissao) {
        this.comissao = comissao;
    }
}
