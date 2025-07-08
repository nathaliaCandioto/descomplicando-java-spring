package com.linuxtips.descomplicandojavaspring.typecasting;

public class Narrowing {
    //Narrowing converte tipos maiores para menores.
    //é explicito e pode gerar perda de dados e por isso  é necessario gerar cast explicito
    //Comum em conversões de float para int, long para int, ou double para float

    public static void main(String[] args) {

        double meuDoble = 1.25;
        System.out.println(+meuDoble);
        int meuInt = (int) meuDoble; // Narrowing, conversão explícita
        System.out.println(+meuInt);

        String minhaString = String.valueOf(meuInt);
        System.out.println("tipo int para String => " +meuInt);
       // String minhaString = String.valueOf(meuInt);

        String s = "1";
        boolean meuboolean = Boolean.parseBoolean(s);
        System.out.println("tipo String para Primitivo => " +meuboolean);

        float meufloat = Float.parseFloat(s);
        System.out.println("tipo String para Float => " +meufloat);

        long meulong = Long.parseLong(s);
        System.out.println("tipo String para long => " +meulong);

        double meudoble2 = Double.parseDouble(s);
        System.out.println("tipo String para double => " +meudoble2);

        byte meuByte = Byte.parseByte(s);
        System.out.println("tipo String para byte => " +meuByte);






    }
}
