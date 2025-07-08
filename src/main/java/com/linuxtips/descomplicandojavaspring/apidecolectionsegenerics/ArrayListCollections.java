package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics;

import com.linuxtips.descomplicandojavaspring.variaveisEtiposdeDados.Array;

import java.util.ArrayList;

public class ArrayListCollections {
    public static void main(String []args){
        ArrayList<Integer> meuArraylist = new ArrayList<>();
        for (int i=1; i<=10; i++) {
            //adcionando itens no arrayList
            //""+i é uma conversao  improvisada de inteiro em string
            System.out.println(meuArraylist.add(+i));
            //System.out.println(meuArraylist);

        }
        meuArraylist.remove("3");
        System.out.println(meuArraylist);
        //para testar sem imprimir selecione toda a linha sem o ; na janela que listar, procure o botao->evaluate

        //pega o valor da indice/posição informada
        meuArraylist.get(6);

        //retorna true se a posicao tiver vazia
        meuArraylist.isEmpty();

        //valida se encontra o conteudo no array
        meuArraylist.contains("5");

        //copia a array
        meuArraylist.clone();
    //retorna o indice do objeto informado
        meuArraylist.indexOf("5");
        meuArraylist.clear();

    }
}
