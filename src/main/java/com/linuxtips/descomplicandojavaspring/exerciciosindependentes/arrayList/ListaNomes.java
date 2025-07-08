package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.arrayList;

import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] Args){

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("a");
        nomes.add("b");
        nomes.add("c");
        nomes.add("d");
        for (int indice =0; indice < nomes.size(); indice++){
            System.out.println(nomes.get(indice));
        }
        for(String listadenomes : nomes ) {
            System.out.println(listadenomes);
        }
    }

}
