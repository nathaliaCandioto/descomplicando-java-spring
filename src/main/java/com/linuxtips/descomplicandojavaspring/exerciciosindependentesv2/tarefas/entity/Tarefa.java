package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.tarefas.entity;

public class Tarefa {
    private String nome;
    private String Status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
