package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.records;

public class Main {
    public static void main(String[] Args) {
        DepoisDoRecord depoisDoRecord = new DepoisDoRecord("francisca","debaixodatelha","123456");
        System.out.println( depoisDoRecord.nome() +" estava "+ depoisDoRecord.endereco());
        System.out.println (depoisDoRecord.nome().equals("frederico"));
    }
}

