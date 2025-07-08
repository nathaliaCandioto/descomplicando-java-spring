package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCollections{
    public static void main (String[]args) {

        LinkedHashSet<String> linguagens = new LinkedHashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");
        linguagens.add("Kotlin");
        linguagens.add("Rust");
        linguagens.add("Scala");

        //ignora itens duplicados
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");
        linguagens.add("Kotlin");
        linguagens.add("Rust");
        linguagens.add("Scala");




        System.out.println(linguagens.hashCode());
        System.out.println(linguagens.size());

        for(String language : linguagens){
            System.out.println(language);
           System.out.println(linguagens);
            System.out.println(linguagens.contains("Java"));
            linguagens.remove("Java");
            System.out.println(linguagens);

        }


    }
}
