package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.streams;

import java.util.Arrays;
import java.util.List;

public class SortedAndForEach {
    //sorted -> ordena os itens do array no caso Array/Stream
    public static void main(String[] Args) {
       List<String>unsortedList = Arrays.asList("9","2","3","java", "linux", "Tips","Spring","AAA");
       List<String>sortedList =unsortedList.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
       //for-each -> interar sobre os elementos do stream
        sortedList.forEach(System.out::println);
    }
}
