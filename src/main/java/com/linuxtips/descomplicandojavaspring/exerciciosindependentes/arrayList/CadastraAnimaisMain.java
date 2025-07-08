package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.arrayList;

import com.linuxtips.descomplicandojavaspring.classeobject.ToStringMain;

import java.util.ArrayList;

public class CadastraAnimaisMain {

    public static void main(String[] Args) {
        ArrayList<CadastraAnimais> animais = new ArrayList<CadastraAnimais>();
        CadastraAnimais animal = new CadastraAnimais();
        animal.setNome("a");
        animal.setIdade(2);
        animal.setPeso(2.0);

        CadastraAnimais animal2 = new CadastraAnimais();
        animal2.setNome("b");
        animal2.setIdade(3);
        animal2.setPeso(3.0);

        animais.add(animal);
        animais.add(animal2);

        for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));

        }
        for (CadastraAnimais itemLista : animais)
            System.out.println(itemLista);

        buscarNome(animais,"a");
        buscarNome(animais,"b");
        buscarNome(animais,"c");
    }

    public static void buscarNome(ArrayList<CadastraAnimais> animais, String nome) {
        boolean encontrado = false;
        for (CadastraAnimais itemdalista : animais) {
            if (itemdalista.getNome().equalsIgnoreCase(nome)) {
                System.out.println("nome " + nome + " encontrado");
                encontrado = true;
            }

        }
        if (!encontrado) {
            System.out.println("nome " + nome + " nao encontrado na lista");
        }

    }


}
