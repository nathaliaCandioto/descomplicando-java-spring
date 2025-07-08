package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue.generic;

public class GenericMain {

    public static void main(String[] args) {

       GenericExample<Integer> mensagemInteira = new GenericExample<>(1000);
       mensagemInteira.escrever();

        GenericExample<Double> mensagemDecimal= new GenericExample<>(1000.25);
        mensagemDecimal.escrever();

         GenericExample<String> mensagemString = new GenericExample<>("mensagem de texto");
         mensagemString.escrever();
    }





}

