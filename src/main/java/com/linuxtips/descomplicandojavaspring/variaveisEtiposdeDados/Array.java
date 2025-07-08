package com.linuxtips.descomplicandojavaspring.variaveisEtiposdeDados;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[]args){
        //forma mais comum de delarar uma array
        int[]arrayDeint;

        //forma menos comum
        int arrayDeInt2[];
        //************


        int arrayDeInt3[]= new int [20];

        String [] arrayDeFrutas = {"maca", "banana", "uva", "pera", "morango", "abacate", "carambola", "caqui"};
        int arraySize = arrayDeFrutas.length;
        System.out.println("Tem "+arraySize+" tipos de frutas na geladeira");

        //convertendo o arrayDefrutas em uma lista
        List<String> itensDaGeladeira = Arrays.asList(arrayDeFrutas); // O metodo asList esta convertendo arrayDeFrutas em uma lista
        itensDaGeladeira.forEach(System.out::println);
        System.out.println();

        //copiando um array - copyofrange
        System.out.println("Lista de frutas vermelhas :\n");

        String [] arrayFrutasVermelhas = Arrays.copyOfRange(arrayDeFrutas,0,3);
        //convertendo para lista
        List<String>arrayFrutasVermelhasLista = List.of(arrayFrutasVermelhas); //o metodo .Of é outra forma de conversao de array em lista
        arrayFrutasVermelhasLista.forEach(System.out::println);

        System.out.println();

        //copiando um array - copy of -> nao consegue escolher o range
        String[]arrayFrutasAmarelas = Arrays.copyOf(arrayDeFrutas,4);
        List<String>arrayFrutasAmarelasList = List.of(arrayFrutasAmarelas);
        arrayFrutasAmarelasList.forEach(System.out::println); //metodo forEach é usado para imprimir coleçoes(listas,conjuntos ou mapas)

        //preenchendo um array - fill

        String[] java = new String [10];
       Arrays.fill(java,"java"); //O método Arrays.fill pertence à classe java.util.Arrays e é utilizado para preencher um array com um valor específico.
       List<String>javaList = List.of(java);
       javaList.forEach(System.out::println);

       //comparar arrays -equals

        Integer [] arrayInteiros= {1,2,3,4,5,6,7,8,9,10};

        Integer [] arrayInteiros2= {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Os arrays são Iguais? "+Arrays.equals(arrayInteiros,arrayInteiros2));

        //sorted
        Integer[] arraySorted = Arrays.copyOf(arrayInteiros2,5);
        Arrays.sort(arraySorted);
        List<Integer> arraySortedList=List.of(arraySorted);
        arraySortedList.forEach(System.out::println);

        Integer a = 1;
        int b = 2;

//        a = b;
        b = a;

    }

}
