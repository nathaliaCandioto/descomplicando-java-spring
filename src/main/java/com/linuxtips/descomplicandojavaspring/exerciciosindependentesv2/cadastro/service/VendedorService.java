package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.service;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.entity.Vendedor;

import java.util.ArrayList;

public class VendedorService {

    ArrayList<Vendedor> vendedores = new ArrayList<>();

    public void cadastraVendedor(String nome, String email, String documento, Integer telefone, Integer salario, Integer comissao) {
        Vendedor vendedor = new Vendedor(nome, email, documento, telefone, salario, comissao);
        boolean existe = false;

        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor vd = vendedores.get(i);
            if (vd.getDocumento().equalsIgnoreCase(vendedor.getDocumento())) {
                vd.setNome(nome);
                vd.setEmail(email);
                vd.setTelefone(telefone);
                vd.setSalario(salario);
                vd.setComissao(comissao);
                existe = true;

                System.out.println("Vendedor ja existe.Os dados foram atualizados");
            }

        }
        if (!existe) {
//                vendedores.add(vendedor);
            vendedores.add(new Vendedor(nome, email, documento, telefone, salario, comissao));
            System.out.println("Novo vendedor adicionado com sucesso "+vendedor);

        }

    }

    public void listaVendedor() {
        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor vd = vendedores.get(i);
            System.out.println(vendedores.get(i));
        }
    }

    public void excluiVendedor(String documento) {
        boolean excluir = vendedores.removeIf(vd -> vd.getDocumento().equalsIgnoreCase(documento));
        if (excluir) {
            System.out.println("O vendedor" + documento + " foi excluido");
        }
    }

    public void listaPordocumento(String documento) {
        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor vd = vendedores.get(i);
            if (vd.getDocumento().equalsIgnoreCase(documento)) {
                System.out.println(vd.toString());
            }

        }
    }

    public Vendedor atualizaVendedor(String documento) {
        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor vd = vendedores.get(i);
            if (vd.getDocumento().equalsIgnoreCase(documento)) {
                return vd;
            }
        }

        System.out.println("Documento nao encontrado");
        return null;

    }


//    public void atualizaVendedor(String documento) {
//        for (int i = 0; i < vendedores.size(); i++) {
//            Vendedor vd = vendedores.get(i);
//            if (vd.getDocumento().equalsIgnoreCase(documento)) {
//                vd.setNome(nome);
//                vd.setEmail(email);
//                vd.setTelefone(telefone);
//                vd.setSalario(salario);
//                vd.setComissao(comissao);
//
//                System.out.println("Os dados foram atualizados");
//            }
//        }
//
//    }
}
