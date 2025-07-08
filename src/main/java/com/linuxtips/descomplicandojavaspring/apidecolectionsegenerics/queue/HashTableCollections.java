package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue;

import java.util.Hashtable;

public class HashTableCollections {

    //armazena chave-valor
    //chave->indice
    //objeto-> valor
    // nao permite vlores nulas
    // nao permite valores duplicados

    public static void main(String[] args) {

        Hashtable<String, Double> notas = new Hashtable<String, Double>();
        notas.put("logica de programação", 7.8);
        notas.put("orientaçao à objetos ", 9.5);
        notas.put("Banco de Dados", 7.2);

        System.out.println(notas.get("Banco de Dados"));
        System.out.println(notas.getOrDefault("Banco do Dados", 0.0));
        //System.out.println(notas.put("Java", 7.2));
        System.out.println(notas.containsKey("Java")); //busca pela a chave
        System.out.println(notas.containsValue(9.5));//busca pelo valor
        System.out.println(notas.replace("Banco de Dados",10.0));
        System.out.println(notas);
        System.out.println(notas.putIfAbsent("Java",10.0));
        System.out.println(notas.containsKey("Java"));
        System.out.println(notas);
    }
}