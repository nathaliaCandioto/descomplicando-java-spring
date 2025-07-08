package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.contato;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.contato.entity.Contato;
import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.contato.service.ContatoService;

import java.util.Scanner;

public class ContatoMain {

    public static void main(String[] Args) {
        Scanner entrada=new Scanner(System.in);
        ContatoService contatoService=new ContatoService();
        Integer contador=0;

        //System.out.println("Quantos contatos deseja cadastrar? ");
       // contador=Integer.parseInt(entrada.nextLine());


        //for (int i = 0; i<contador; i++) {
           // System.out.println("Quantos contatos deseja cadastrar? ");

            contatoService.AdicionaContato("a",22222);
            contatoService.listarContato();
            contatoService.buscaNome("a");
            contatoService.buscaNome("b");
            contatoService.removeNome("a");

       // }
    }
}
