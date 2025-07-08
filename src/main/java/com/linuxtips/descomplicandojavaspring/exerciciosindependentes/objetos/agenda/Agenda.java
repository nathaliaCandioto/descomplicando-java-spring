package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.objetos.agenda;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentes.objetos.Contato;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void armazenarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removeContato(Contato contato) {
        this.contatos.remove(contato);
    }

   public int buscaContatos(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome() == nome) {
                return i;

            }

        }
        return -1;
    }

    public void imprimeAgenda() {

        System.out.println("===AGENDA===");
        for (Contato contato : contatos) {
            contato.imprimir();
        }
    }

    public void imprimeContato(int index) {
        contatos.get(index).imprimir();
    }

}

