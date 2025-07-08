package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue;

import java.util.HashMap;

public class HashMapCollections {

    //armazena chave-valor
    //chave->indice
    //objeto-> valor
    // permite chaves nulas
    // nao garante a ordem
    public static void main(String[]args){

        HashMap<String,Double> notas = new HashMap<String, Double>();
        notas.put("logica de programação", 7.8);
        notas.put("orientaçao à objetos ", 9.5);
        notas.put("Banco de Dados", 7.2);

        System.out.println(notas.get("Banco de Dados"));
        System.out.println(notas.getOrDefault("Banco do Dados",0.0));
        System.out.println(notas.put("Java",7.2));
        System.out.println(notas.containsKey("Java")); //busca pela a chave
        System.out.println(notas.containsValue(9.5));//busca pelo valor


    }


}
