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
            Cliente c1 = clientes.get(i);
            if (c1.getDocumento().equalsIgnoreCase(cliente1.getDocumento())) {
                c1.setNome(nome);
                c1.setEmail(email);
                c1.setTelefone(telefone);
                c1.setPagamento(pagamento);
                c1.setPedido(pedido);

                System.out.println("Documento ja existe. Os dados foram atualizados");
                existe=true;
                break;
            }


        }
        if(!existe){
            clientes.add(cliente1);
            System.out.println("1 Cliente foi adcionado");
        }

    }

}
