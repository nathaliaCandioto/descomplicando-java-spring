package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    // filter-> usado para retornar elementos que passam em um filtro indicado
    public static void main(String[] Args) {
        List<String> curso = Arrays.asList("java", "linux", "Tips", "Spring");
        List<String> terminadoscomS = curso.stream().filter(s -> s.endsWith("s")).collect(Collectors.toList());
        System.out.println("terminados com S: "+terminadoscomS);

    }
}

