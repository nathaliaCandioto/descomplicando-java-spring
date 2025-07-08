package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics;

import java.util.LinkedList;
import java.util.Vector;

public class VectorListCollections {
    public static void main(String[] args) {

        //igual o array list porem com melhor performace para os metodos add e remove
        Vector<Integer> meuVector = new Vector<>();
        for (int i = 1; i <= 10; i++) {
        meuVector.add(i);
        }

        System.out.println(meuVector.elementAt(2));
        System.out.println(meuVector);
        System.out.println(meuVector.firstElement());
       // meuVector.clear();
        meuVector.add(20);
        System.out.println(meuVector);
        meuVector.add(1,10);
        System.out.println(meuVector);

    }
}