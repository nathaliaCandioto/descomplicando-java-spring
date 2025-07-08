package com.linuxtips.descomplicandojavaspring.classeobject;

public class Funcionaria {
    private String funcionaria;
    private String nome;
    private String cargo;
    private String setor;
    private Integer idade;
    private Double salario;

    public String getFuncionaria() {
        return funcionaria;
    }

    public void setFuncionaria(String funcionaria) {
        this.funcionaria = funcionaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String dadosFuncionaria() {
        return
                "funcionaria: " +nome+'\n' +
                " cargo: " +cargo+ '\n' +
                " setor: " +setor+ '\n' +
                " idade: " +idade+ '\n' +
                " salario: " +salario ;

    }

    @Override
    public String toString() {
        return dadosFuncionaria();
    }

}

