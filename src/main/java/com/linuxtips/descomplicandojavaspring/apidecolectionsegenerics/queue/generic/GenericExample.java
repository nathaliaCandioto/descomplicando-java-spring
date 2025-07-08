package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue.generic;

// surgiram para facilitar principalmente  casos de casting entre tipos
//reduzindo a complexidade e volume de codigo escrito de dados
//podemos usar um tipo generico de dados

public class GenericExample <T>{

     //<T> tipo
        T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public GenericExample(T mensagem) {
        this.name = mensagem;
    }

    public void escrever () {
        System.out.println(name);
    }


}
