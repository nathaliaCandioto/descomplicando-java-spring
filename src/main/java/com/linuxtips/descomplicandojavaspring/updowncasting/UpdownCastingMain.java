package com.linuxtips.descomplicandojavaspring.updowncasting;

import java.util.ArrayList;
import java.util.List;

import static com.linuxtips.descomplicandojavaspring.updowncasting.AlimentarAnimais.alimentar;

public class UpdownCastingMain extends Animal {

    public static void main(String[] args) {
//    Passaro passaro = new Passaro();
//    passaro.comer();
//      Animal animal = new Animal();
//      animal.comer();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cachorro());
        animalList.add(new Passaro());

//       for (Animal animal : animalList){
//            alimentar(animal);
//        }

//        Animal animal = new Cachorro();
//        animal.comer();

//        for (Animal animal : animalList){
//            AlimentarAnimais.alimentar(animal);
//        }
        for (Animal animal : animalList){
            alimentar(animal);
            System.out.println(animal);

        }


    }

}
