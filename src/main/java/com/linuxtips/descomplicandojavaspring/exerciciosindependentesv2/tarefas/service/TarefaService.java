package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.tarefas.service;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.tarefas.entity.Tarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TarefaService {
    ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void cadastrarTarefa(String nome, String status) {
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(nome);
        tarefa.setStatus(status);
        tarefas.add(tarefa);

    }

    public void listarTarefa() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(tarefas.get(i));
        }
    }

    public void buscarTarefa(String tarefaBuscar) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (tarefa.getNome().equalsIgnoreCase(tarefaBuscar)) {
                System.out.println("A tarefa " + tarefaBuscar + " foi encontrada na lista");
            } else {
                System.out.println("A tarefa " + tarefaBuscar + " nao existe na lista");

            }
        }
    }

    public void filtrarPrioridadeTarefa(String prioridade) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            if (t.getStatus().equalsIgnoreCase(prioridade)) {
                System.out.println(t);
            }
        }
    }

    public void deletarTarefa(String tarefaDeletar) {
        boolean deletado = tarefas.removeIf(t -> t.getNome().equalsIgnoreCase(tarefaDeletar));

        if (deletado) {
            System.out.println("A tarefa " + tarefaDeletar + " foi removida da lista ");
        } else {
            System.out.println("Tarefa \"" + tarefaDeletar + "\" não encontrada na lista.");
        }
    }


    public void atualizaTarefa(String tarefaAtual, String tarefaAtualizada) {
        boolean tarefaEncontrada = false;
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (tarefa.getNome().equalsIgnoreCase(tarefaAtual)) {
                tarefa.setNome(tarefaAtualizada);
                tarefaEncontrada = true;
            }
        }
        if (tarefaEncontrada) {
            System.out.println("Tarefa atualizada com sucesso!");
        } else {
            System.out.println("Tarefa \"" + tarefaAtual + "\" não encontrada.");
        }
    }

    public void ordenaListaPorNome() {
        Collections.sort(tarefas, new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa f1, Tarefa f2) {
                if (f1.getNome().compareTo(f2.getNome()) < 0) {
                    return -1;

                } else if (f1.getNome().compareTo(f2.getNome()) > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
    });
}

}





