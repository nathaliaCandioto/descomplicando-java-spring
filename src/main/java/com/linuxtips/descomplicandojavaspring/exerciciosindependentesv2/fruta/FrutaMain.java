package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.fruta;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.fruta.frutaEntity.Fruta;
import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.fruta.frutaService.FrutaService;

import java.util.Scanner;

public class FrutaMain {


    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in);
        Fruta fruta = new Fruta();
        FrutaService frutaService = new FrutaService();

        System.out.println("Quantos cadastros deseja incluir?");
        int contador = Integer.parseInt(entrada.nextLine());

        for (int i = 0; i < contador; i++) {
            frutaService.cadastrarFruta();

        }


        System.out.println("Deseja listar Frutas?");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("As frutas cadastradas são");
            frutaService.listarFruta();
        }
        if (resposta.equalsIgnoreCase("não")) {
            System.out.println("Ok.Os itens nao serao listados");
        }

        System.out.println("Deseja Buscar uma Fruta?");
        String respostaBusca = entrada.nextLine();

        if (respostaBusca.equalsIgnoreCase("sim")) {
            frutaService.buscarfrutaPeloNome();
        }
        if (respostaBusca.equalsIgnoreCase("não")) {
            System.out.println("Ok.Nenhuma busca será realizada");
        }

        System.out.println("Deseja remover uma fruta?");
        String respostaRemove = entrada.nextLine();
        if (respostaRemove.equalsIgnoreCase("sim")) {
            System.out.println("Qual o nome da Fruta?");
            String frutaRemove = entrada.nextLine();
            frutaService.removeFruta(frutaRemove);
            frutaService.listarFruta();
        }

    }


}
