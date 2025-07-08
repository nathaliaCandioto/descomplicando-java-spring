package com.linuxtips.descomplicandojavaspring.updowncasting;

public class AutoboxingAndUnboxing {
    public static void main (String[]Args){
        //autoboxing-> conversO VALOR PRIMITIVO EM UM OBJETO WRApper
        int valorInt = 10;
        Integer integer = valorInt;
        System.out.println(integer);

        //unboxing converte do wrapper para o primitivo
        Integer wrapperInteger = 13;
        int primitivoInteger =wrapperInteger;
       System.out.println(wrapperInteger);
    }



}
