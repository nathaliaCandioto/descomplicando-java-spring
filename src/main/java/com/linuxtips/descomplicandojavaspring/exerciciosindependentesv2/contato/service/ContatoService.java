package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.contato.service;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.contato.entity.Contato;

import java.util.ArrayList;

public class ContatoService {

    ArrayList <Contato> contatos = new ArrayList<Contato>();

    public void AdicionaContato(String nome,Integer telefone){
        Contato contato=new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);

        contatos.add(contato);

    }

    public void listarContato(){
        for (int i =0; i<contatos.size(); i++){
            System.out.println(contatos.get(i));
        }

    }

    public void buscaNome(String nome){
        for(int i=0; i< contatos.size(); i++){
            Contato c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome)){
                System.out.println("O nome " +c+ " foi encontardo na lista");
                break;
            }
        }
    }

    public void removeNome(String nome){
            boolean removido = contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
            if(removido){
                System.out.println("O item "+nome+" Foi removido da lista");
            }
            if(!removido){
                System.out.println("O item informado não existe");
            }

    }


}
