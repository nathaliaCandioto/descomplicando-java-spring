package com.linuxtips.descomplicandojavaspring.exerciciosindependentes;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentes.arrayList.Tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefasMain {
    static ArrayList<Tarefas> listaDeTarefas = new ArrayList<Tarefas>();


    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in);

        Integer numeroTarefas = 0;
        System.out.println("Quantos tarefas deseja incluir?");
        numeroTarefas = Integer.parseInt(entrada.nextLine());

        for (int i = 0; i < numeroTarefas; i++) {
            Tarefas tarefa = new Tarefas();

            System.out.println("Insira o nome da tarefas");
            tarefa.setNome(entrada.nextLine());

            System.out.println("Insira o status da tarefas");
            tarefa.setStatus(entrada.nextLine());

            listaDeTarefas.add(tarefa);


        }
        System.out.println("Deseja remover alguma tarefa? Digite o nome ou deixe em branco para pular:");
        String nomeRemover = entrada.nextLine();

        if (!nomeRemover.isEmpty()) {
            removeTarefa(nomeRemover);
            listarTarefas(); // mostra lista atualizada
        }

    }

    //    public static void listarTarefas() {
//        for (Tarefas ListTarefas : listaDeTarefas) {
//            System.out.println(listaDeTarefas);
//        }
    public static void listarTarefas() {
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println(listaDeTarefas.get(i));
        }
    }

    public static void removeTarefa(String nome) {
        boolean removido = listaDeTarefas.removeIf(tarefa -> tarefa.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }


}


