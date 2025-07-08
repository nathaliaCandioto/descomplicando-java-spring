package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.objetos;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentes.objetos.agenda.Agenda;

import java.util.List;
import java.util.Objects;

public class ContatoMain {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato();

        contato1.setNome("fulano");
        contato1.setTelefone(3333333);
        contato1.setEmail("fulano@xxx.com");

        Contato contato2 = new Contato();

        contato2.setNome("ciclano");
        contato2.setTelefone(4444444);
        contato2.setEmail("ciclano@xxx.com");

        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.imprimeAgenda();
        agenda.imprimeContato(1);
        agenda.buscaContatos("ciclano");
        agenda.removeContato(contato1);
        agenda.imprimeAgenda();


          }

}
