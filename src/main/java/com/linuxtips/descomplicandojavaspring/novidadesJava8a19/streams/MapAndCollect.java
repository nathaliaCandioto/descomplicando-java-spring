package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {
    public static void main (String[]Args){

        List<String>listaString=Arrays.asList("1","2","3");
        System.out.println();

        List<Integer>minhaListaInteira=listaString.stream().map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(minhaListaInteira);
        //visa retornar uma stream com o resultado de uma operacao que fi realizada com este stream


    }

}
