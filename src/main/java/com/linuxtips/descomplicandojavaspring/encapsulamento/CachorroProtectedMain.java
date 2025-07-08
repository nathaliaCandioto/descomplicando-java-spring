package com.linuxtips.descomplicandojavaspring.encapsulamento;

    public class CachorroProtectedMain {
        public static void main (String[]Args){

            Cachorro dog = new Cachorro();
            dog.pesoPublic=1d;
            dog.idadePublic=2;
            dog.latir();
        }
    }

