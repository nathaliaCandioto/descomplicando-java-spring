package com.linuxtips.descomplicandojavaspring.classeEnum;

import jdk.jshell.Snippet;

import static com.linuxtips.descomplicandojavaspring.classeEnum.StaticPedidos.completarPedidos;
import static com.linuxtips.descomplicandojavaspring.classeEnum.StaticPedidos.status;

import static com.linuxtips.descomplicandojavaspring.classeEnum.StaticPedidos.pedidosFeitos;
import static com.linuxtips.descomplicandojavaspring.classeEnum.StaticPedidos.status;

public class StaticMain {
    public static void main (String[] args){
    //pedidosFeitos;
    //status.toLowerCase(Locale.ROOT);

       StaticPedidos staticPedidos = new StaticPedidos("1234");
        StaticPedidos staticPedidos2= new StaticPedidos("1234");

        completarPedidos();

           //System.out.println(" x " +status);

       }

    }


