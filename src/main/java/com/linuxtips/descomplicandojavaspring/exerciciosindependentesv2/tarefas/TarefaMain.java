package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.tarefas;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.tarefas.entity.Tarefa;
import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.tarefas.service.TarefaService;

import java.text.Normalizer;
import java.util.Scanner;

public class TarefaMain {
    public static void main(String[] Args) {

        TarefaService tarefaService=new TarefaService();

        Scanner entrada = new Scanner(System.in);
        int option = -1;


        while (option != 0) {
            System.out.println("********Menu******");

            System.out.println("1 - Cadastrar uma tarefa");
            System.out.println("2 - Listar uma tarefa");
            System.out.println("3 - buscar uma tarefa");
            System.out.println("4 - filtrar uma tarefa por status");
            System.out.println("5 - deletar uma tarefa");
            System.out.println("6 - Atualiza uma tarefa");
            System.out.println("7 - Ordenar tarefa por nome");
            System.out.println("0 - Sair");


            System.out.println("Digite uma das opçoes acima");
            option = Integer.parseInt(entrada.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Deseja cadastrar uma tarefa?");
                    String respostaCadastrar = entrada.nextLine();

                    if (respostaCadastrar.equalsIgnoreCase("sim")) {
                        System.out.println("Quantas tarefas deseja cadastrar?");
                        int numTarefas=Integer.parseInt(entrada.nextLine());

                        for (int i=0; i<numTarefas;i++) {

                            System.out.println("Digite o nome da tarefa");
                            String nome = entrada.nextLine();
                            System.out.println("Digite o status da tarefa");
                            String status = entrada.nextLine();
                            tarefaService.cadastrarTarefa(nome, status);
                        }

                    } else if (respostaCadastrar.equalsIgnoreCase("não")) {
                        System.out.println("Selecione uma das opções do menu para continuar ");
                        break;
                    }

                case 2:
                    System.out.println("Deseja listar as tarefas cadastradas?");
                    String respostaListar = entrada.nextLine();

                    if (respostaListar.equalsIgnoreCase("sim")) {
                        //System.out.println("Digite o nome da tarefa que deseja listar");
                        //String tarefaListar = entrada.nextLine();
                        tarefaService.listarTarefa();


                    } else if (respostaListar.equalsIgnoreCase("não")) {
                        System.out.println("Selecione uma das opções do menu para continuar ");
                        break;
                    }
                case 3:
                    System.out.println("Deseja buscar uma tarefa?");
                    String respostaBuscar = entrada.nextLine();

                    if (respostaBuscar.equalsIgnoreCase("sim")) {
                        System.out.println("Digite o nome da tarefa que deseja buscar");
                        String tarefaBuscar = entrada.nextLine();
                       tarefaService.buscarTarefa(tarefaBuscar);

                    } else if (respostaBuscar.equalsIgnoreCase("não")) {
                        System.out.println("Selecione uma das opções do menu para continuar ");
                        break;
                    }
                case 4:
                    System.out.println("Deseja filtar as tarefas por prioridade?");
                    String respostafiltrar = entrada.nextLine();

                    if (respostafiltrar.equalsIgnoreCase("sim")) {
                        System.out.println("Digite o status das tarefas que deseja filtrar");
                        String prioridade = entrada.nextLine();
                        tarefaService.filtrarPrioridadeTarefa(prioridade);

                    } else if (respostafiltrar.equalsIgnoreCase("não")) {
                        System.out.println("Selecione uma das opções do menu para continuar ");
                        break;
                    }

                case 6:
                    System.out.println("Deseja atualizar uma tarefa?");
                    String respostaDeletar = entrada.nextLine();

                    if (respostaDeletar.equalsIgnoreCase("sim")) {
                        System.out.println("Digite o nome da tarefa que deseja atualizar");
                        String tarefaAtual = entrada.nextLine();

                        System.out.println("Digite o novo valor da tarefa");
                        String tarefaAtualizada = entrada.nextLine();

                        tarefaService.atualizaTarefa(tarefaAtual,tarefaAtualizada);

                    } else if (respostaDeletar.equalsIgnoreCase("não")) {
                        System.out.println("Selecione uma das opções do menu para continuar ");
                        break;
                    }

                case 7:
                    System.out.println("Tarefas Ordenadas por nome");
                    tarefaService.ordenaListaPorNome();
                    tarefaService.listarTarefa();

                default:
                    System.out.println("Selecione uma das opções acima");
                    break;
            }

        }

    }



}
