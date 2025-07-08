package com.linuxtips.descomplicandojavaspring.updowncasting;

public class AlimentarAnimais {

//    public void alimentar(Animal animal){
//    animal.comer();
    //     }

    public static void alimentar(Animal animal) {
        animal.comer();
        //downcasting quando for cachorro
        if (animal instanceof Cachorro) {
            ((Cachorro) animal).latir();
        }
    }
}
