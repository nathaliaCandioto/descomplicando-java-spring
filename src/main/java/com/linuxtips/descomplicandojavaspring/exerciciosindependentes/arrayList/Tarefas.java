package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
     private String nome;
     private String status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Tarefas{" +
                "nome='" + nome + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

