package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.entity.Cliente;
import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.service.ClienteService;
import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.service.VendedorService;

import java.util.Scanner;

public class CadastroMain {
    public static void main(String[] Args) {

        VendedorService vendedorService = new VendedorService();
        ClienteService clienteService = new ClienteService();
        Scanner entrada = new Scanner(System.in);

        //CADASTRO
        System.out.println("Digite o documento do vendedor");
        String documento = entrada.nextLine().trim();
        System.out.println("Digite o nome do vendedor");
        String nome = entrada.nextLine();
        System.out.println("Digite o email do vendedor");
        String email = entrada.nextLine();
        System.out.println("Digite o telefone do vendedor");
        Integer telefone = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite o salario do vendedor");
        Integer salario = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite a comissão do vendedor");
        Integer comissao = Integer.parseInt(entrada.nextLine());

        vendedorService.cadastraVendedor(nome, email, documento, telefone, salario, comissao);

        //LISTAR

        System.out.println("Deseja listar os vendedores? Digite sim ou nao");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            vendedorService.listaVendedor();
        } else {
            System.out.println(" os dados nao serao listados");

        }

        //EXCLUÍR
        System.out.println("Para exclusao informe o documento");
        String doc = entrada.nextLine();
        System.out.println(" os dados foram excluidos");
        vendedorService.excluiVendedor(documento);

        //LISTAR POR DOCUMENTO

        System.out.println("Informe o documento que deseja pesquisar");
        String dc = entrada.nextLine();
        System.out.println(" os dados foram excluidos");
        vendedorService.listaPordocumento(documento);


    }



}
