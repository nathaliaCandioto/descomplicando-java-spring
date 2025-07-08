package com.linuxtips.descomplicandojavaspring.novidadesJava8a19;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

//lambda expressions - pqno bloco de codigo que recebe parametros e retorna um valor
// sao semelhantes a metodos
//não precisam de um nome e podemestare dentro do corpo de outro metodo

public class LambdaExample {
    public static void main(String[] Args) {
        List<String> curso = Arrays.asList("java", "linux", "Tips", "Spring");
        List<String> Java = curso.stream().filter(s -> s.equals("Java".toLowerCase(Locale.ROOT))).toList();
        //for-each -> interar sobre os elementos do stream
        System.out.println(Java);
    }
}
