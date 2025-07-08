package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue;

import java.util.HashSet;
//itens d cada item é unico
//implementa a interface SET
//Objetos sao inseridos com base no seu código hash
//elementos null tambem sao permitidos

public class HashSetCollections {
    public static void main (String[]args) {

        HashSet<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");
        linguagens.add("Kotlin");
        linguagens.add("Rust");
        linguagens.add("Scala");
        System.out.println(linguagens);
        System.out.println(linguagens.size());
        System.out.println(linguagens.hashCode());
        System.out.println(linguagens.contains("Java"));
        for(String language : linguagens){
            System.out.println(language);
        }


    }
}
