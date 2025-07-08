package com.linuxtips.descomplicandojavaspring.exerciciosindependentes.metodos.pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoasMain {
    public static void main(String[] Args) {
        List<Pessoas> pessoas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos cadastros deseja incluir?");
        int numCadastro = Integer.parseInt(entrada.nextLine());
        Pessoas pessoa = new Pessoas();

        for (int i = 0; i < numCadastro; i++) {

            System.out.println("Insira nome");
            pessoa.setNome(entrada.nextLine());
            System.out.println("Insira idade");
            pessoa.setIdade(Integer.parseInt(entrada.nextLine()));
            System.out.println("Insira email");
            pessoa.setEmail(entrada.nextLine());

            pessoas.add(pessoa);
            //pessoa1.setEmail(Integer.parseInt(entrada.nextLine()));
            System.out.println(pessoas.get(i));
        }

        for (int i = pessoas.size() - 1; i >= 0; i--) {
            System.out.println(pessoas.get(i));

        }

        System.out.println("Insira um nome para buscar");
        pessoa.setBuscar(entrada.nextLine().toLowerCase());


        for (Pessoas p: pessoas) {
            Boolean encontrado=false;

            if (p.getNome().toLowerCase().contains(pessoa.getBuscar())){
                System.out.println("pessoa" + p + "encontrada");
                encontrado = true;

            }
            if (!encontrado){
                System.out.println("pessoa"+p+"encontrada");
            }

        }
        entrada.close();
    }
}




