package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.streams;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] Args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int listaReduzida =integerList.stream()//reduz a 1 unico elemento
                .reduce(0,Integer::max);
            System.out.println(listaReduzida);

    }

    }
