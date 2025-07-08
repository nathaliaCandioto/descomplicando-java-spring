package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.fruta.frutaService;

import com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.fruta.frutaEntity.Fruta;

import java.util.ArrayList;
import java.util.Scanner;

public class FrutaService {
    ArrayList<Fruta> frutas = new ArrayList<Fruta>();

    public void cadastrarFruta() {

        Scanner entrada = new Scanner(System.in);
        Fruta fruta = new Fruta();

        System.out.println("nome da fruta");
        fruta.setNome(entrada.nextLine());
        System.out.println("cor da fruta");
        fruta.setCor(entrada.nextLine());

        frutas.add(fruta);

    }

    public void listarFruta() {
        for (int i = 0; i < frutas.size(); i++)
            System.out.println(frutas.get(i));
    }

    public void buscarfrutaPeloNome() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual nome da fruta?");
        String frutaBusca = entrada.nextLine();
        for (int i = 0; i < frutas.size(); i++) {
            Fruta f = frutas.get(i);
            if (f.getNome().equalsIgnoreCase(frutaBusca)) {
                System.out.println("O nome " + frutaBusca + " foi encontrado na lista");
            }
        }

    }

    public void removeFruta(String frutaRemove) {
        boolean removido = frutas.removeIf(f->f.getNome().equalsIgnoreCase(frutaRemove));
        System.out.println("A fruta "+frutaRemove+ " foi removida da lista " );
    }
}

