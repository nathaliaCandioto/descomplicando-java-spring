package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.service;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.entity.Vendedor;

import java.util.ArrayList;

public class VendedorService {

    ArrayList<Vendedor>vendedores=new ArrayList<>();

    public void cadastraVendedor(String nome,String email,String documento,Integer telefone,Integer salario,Integer comissao){
        Vendedor vendedor=new Vendedor(nome,email,documento,telefone,salario,comissao);
        boolean existe=false;

        for (int i=0; i< vendedores.size();i++){
            Vendedor vd =vendedores.get(i);
            if(vd.getDocumento().equalsIgnoreCase(vendedor.getDocumento())){
                vd.setNome(nome);
                vd.setEmail(email);
                vd.setTelefone(telefone);
                vd.setSalario(salario);
                vd.setComissao(comissao);
                existe=true;

                System.out.println("Vendedor ja existe.Os dados foram atualizados");
            }

            if(!existe){
                vendedores.add(vendedor);
            }

        }

    }
}
