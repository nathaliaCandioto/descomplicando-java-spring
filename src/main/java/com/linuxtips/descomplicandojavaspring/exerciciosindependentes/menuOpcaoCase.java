package com.linuxtips.descomplicandojavaspring.exerciciosindependentes;

import java.util.Scanner;

public class menuOpcaoCase {


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

            if (opcao != 4) {
                System.out.println("Digite um numero");
                int entrada1 = scanner.nextInt();

                System.out.println("Digite outro numero");
                int entrada2 = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        int soma = entrada1 + entrada2;
                        System.out.println("A soma dos dois é igual a " + soma);
                        break;
                    case 2:
                        int subtracao = entrada1 - entrada2;
                        System.out.println("A subtracao entre os dois é igual a " + subtracao);
                        break;

                    case 3:
                        int multiplicacao = entrada1 * entrada2;
                        System.out.println("A multiplicação entre os dois é igual a " + multiplicacao);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}