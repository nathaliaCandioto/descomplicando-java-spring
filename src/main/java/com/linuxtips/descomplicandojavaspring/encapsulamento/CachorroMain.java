package com.linuxtips.descomplicandojavaspring.encapsulamento;

public class CachorroMain {

    public static void main (String []args){

        Cachorro dog = new Cachorro();
        dog.pesoProtected = 1.0;
        dog.idadeProtected=2;
        dog.idadePublic=5;
        dog.pesoPublic=11.5;
        dog.dormir();
        System.out.println(dog.comer("hjkkk") );
        System.out.println(dog.comer("asahsh"));

    }

    public static class CachorroProtectedMain {
        public static void main (String[]Args){

            Cachorro dog = new Cachorro();
            dog.pesoPublic=1d;
            dog.idadePublic=2;
            dog.latir();
        }
    }
}
