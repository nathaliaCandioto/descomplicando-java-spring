package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.Virtualthreads;

import java.util.Random;

//threads sao equivalentes a instancias da cPU rodondo
// ocupando espaço em memoria e processamento
//threads virtual -> 1 ou varias threads fisicas rodando e varias
// threads virtuais rodando dentro destas threads
public class Virtualthreads {

    public static void main(String[] Args) {
        //tread  que controla o uso de threads virtuais
        boolean threadsVirtuaisHabilitadas =false;
        System.out.println("threads virtuais ligadas? "+threadsVirtuaisHabilitadas);

        long HoraDeInicio  = System.currentTimeMillis();
        Random random = new Random();
        // cria numeros inteiros aleatorios ate o valor de bound
        Runnable runnable = () -> {
            Integer i = random.nextInt(999999999);
        };

        for (int i=0; i<100; i++){
            if (threadsVirtuaisHabilitadas){
                Thread.startVirtualThread(runnable);
        }else{
                //caso esteja falso usa threads fisicas
                Thread thread = new Thread(runnable);
                thread.start();
            }

        }

        long horaDefim =System.currentTimeMillis();
        long tempoGasto = horaDefim - HoraDeInicio;
        System.out.println("Tempo gasto em execuçao "+tempoGasto);
    }


}
