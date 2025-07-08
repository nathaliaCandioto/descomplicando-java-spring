package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics;

import java.util.LinkedList;

public class LinkedListCollections {

    public static void main(String []args){

    LinkedList<Integer> minhaLinkedlist = new LinkedList<>();
        for (int i=1; i<=10; i++) {
            minhaLinkedlist.add(+i);

        }
            System.out.println(minhaLinkedlist);
            //retorna o primeiro elemento e o remove
            System.out.println(minhaLinkedlist.pop());
            System.out.println(minhaLinkedlist);

        //retorna o primeiro elemento porem nao remove
        System.out.println(minhaLinkedlist.peek());
        System.out.println(minhaLinkedlist);

        //retorna o primeiro elemento e tambem remove
        System.out.println(minhaLinkedlist.poll());
        System.out.println(minhaLinkedlist);

        //limpa a lista inteira
         minhaLinkedlist.clear();
        System.out.println(minhaLinkedlist);

      }
    }

