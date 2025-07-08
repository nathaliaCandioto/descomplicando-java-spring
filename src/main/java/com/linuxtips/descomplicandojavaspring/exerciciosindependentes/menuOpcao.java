package com.linuxtips.descomplicandojavaspring.exerciciosindependentes;

import java.util.Scanner;

public class menuOpcao {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        System.out.println("Digite 0 para entrar no Menu");
        opcao = scanner.nextInt();

        while (opcao != 4) {

            System.out.println("escolha 1 opção");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Multiplicar dois números");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();


            if (opcao == 1) {
                System.out.println("Digite um numero");
                int entrada1 = scanner.nextInt();

                System.out.println("Digite outro numero");
                int entrada2 = scanner.nextInt();

                int soma = entrada1 + entrada2;
                System.out.println("A soma dos dois é igual a " + soma);


            } else if (opcao == 2) {

                System.out.println("Digite um numero");
                int entrada1 = scanner.nextInt();

                System.out.println("Digite outro numero");
                int entrada2 = scanner.nextInt();

                int subtracao = entrada1 - entrada2;
                System.out.println("A subtracao entre os dois é igual a " + subtracao);

            } else if (opcao == 3) {

                System.out.println("Digite um numero");
                int entrada1 = scanner.nextInt();

                System.out.println("Digite outro numero");
                int entrada2 = scanner.nextInt();

                int multiplicacao = entrada1 * entrada2;
                System.out.println("A multiplicação entre os dois é igual a " + multiplicacao);
            }
        }
    }
}
