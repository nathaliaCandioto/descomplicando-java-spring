package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.service;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    ArrayList<Cliente> clientes = new ArrayList<>();

    public void ListClient() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }

    }

    public void cadastraCliente(String nome, String email, String documento, Integer telefone, String pagamento, Integer pedido) {
        Cliente cliente1 = new Cliente(nome, email, documento, telefone, pedido, pagamento);

        boolean existe = false;

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cl = clientes.get(i);
            if (cl.getDocumento().equalsIgnoreCase(cliente1.getDocumento())) {
                cl.setNome(nome);
                cl.setEmail(email);
                cl.setTelefone(telefone);
                cl.setPagamento(pagamento);
                cl.setPedido(pedido);

                System.out.println("Documento ja existe. Os dados foram atualizados");
                existe = true;
                break;
            }


        }
        if (!existe) {
            clientes.add(cliente1);
            System.out.println("Documento ja existe. Os dados foram atualizados");
        }

    }

    public void excluiCliente(String documento) {
        boolean exclui = clientes.removeIf(cl -> cl.getDocumento().equalsIgnoreCase(documento));
        if(exclui) {
            System.out.println("O cliente " + documento + " foi excluído");
        }
    }

    public void listaPorDocumento(String documento) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cl = clientes.get(i);
            if (cl.getDocumento().equalsIgnoreCase(documento)) {
                System.out.println(cl.toString());

            }
        }
    }


    public void atualizaCliente(String nome, String email, String documento, Integer telefone, String pagamento, Integer pedido) {
        for (Cliente cl : clientes) {
            if(cl.getDocumento().equalsIgnoreCase(documento)){
                cl.setNome(nome);
                cl.setEmail(email);
                cl.setTelefone(telefone);
                cl.setPagamento(pagamento);
                cl.setPedido(pedido);
                System.out.println("Os dados foram atualizados");
            }

        }

    }
}
