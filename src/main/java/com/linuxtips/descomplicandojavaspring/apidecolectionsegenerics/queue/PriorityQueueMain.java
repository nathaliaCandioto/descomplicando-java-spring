package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue;

import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[]Args){

//        Equipe amarela = new Equipe ("amarela" , 230);
//        Equipe azul = new Equipe ("azul" , 900);
//        Equipe branca = new Equipe ("branca" , 700);
//        Equipe verde = new Equipe ("verde" , 100);
//        Equipe roxa = new Equipe ("roxa" , 6789);

        PriorityQueue<Equipe> priorityQueue = new PriorityQueue<Equipe>(5, new EquipeComparator());

        priorityQueue.add(new Equipe("amarela" ,230));
        priorityQueue.add(new Equipe("azul",900));
        priorityQueue.add(new Equipe("branca",700));
        priorityQueue.add(new Equipe("verde",100));
        priorityQueue.add(new Equipe("roxa",6789));

        //for (Equipe equipe : priorityQueue){
            //System.out.println(priorityQueue);
            //System.out.println(priorityQueue.size());
            //System.out.println(equipe);
       // }
        //System.out.println("##### "+priorityQueue);
        System.out.println("#####"+priorityQueue.size());
        System.out.println("Equipes ordenadas do maior para o menor saldo de pontos:");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
  //          System.out.println(priorityQueue);
//            System.out.println(priorityQueue.size());
        }
//        System.out.println(priorityQueue.size());
//        //System.out.println(priorityQueue.peek());

    }
}
