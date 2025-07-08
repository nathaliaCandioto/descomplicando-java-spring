package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofLocalizedPattern;

public class LocalDateimeExemplo {
    public static void main(String[] Args) {

        LocalDate dataDehoje = LocalDate.now();
        System.out.println("Data de hoje : "+dataDehoje);

        LocalDate dataDeOntem = dataDehoje.minusDays(1);
        System.out.println("Data de Ontem : "+dataDeOntem);

        LocalDate anteontem = dataDehoje.minusDays(2);
        System.out.println("Data de anteontem : "+anteontem);

        LocalDate dataTransformada =LocalDate.of(2024,2,5);
        System.out.println("Data Transformatada : "+dataTransformada);

        LocalDateTime horatransformada = dataTransformada.atTime(11,10,6);
        System.out.println("Data Transformatada : "+horatransformada);

        LocalTime queHorasSao= LocalTime.now();
        LocalTime adcionaHora = queHorasSao.plusMinutes(2);
        System.out.println("Que horas são + 2 minutos: " +adcionaHora);

        YearMonth anoMes = YearMonth.now();
        System.out.println("Ano e mes atual: " +anoMes);

        String anoMesFormatado= dataTransformada.format(DateTimeFormatter.ofPattern("M yy"));


    }
}
