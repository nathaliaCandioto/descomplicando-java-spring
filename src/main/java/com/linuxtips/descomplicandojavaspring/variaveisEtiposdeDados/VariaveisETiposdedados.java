package com.linuxtips.descomplicandojavaspring.variaveisEtiposdeDados;

public class VariaveisETiposdedados {

    public static void main(String[] args) {
        //Tipos de variaveis
        byte mybyte = 127;
        System.out.println("meu byte" + " " + mybyte);

        // Tipos de operadores
//_____________________________________________________________________________________________________

        //Operador incremento
        int incremento = 15;
        System.out.println("antes do decremento " + incremento);
        incremento++;
        System.out.println("após o decremento " + incremento);

        //operador decremento
        int decremento = 20;
        System.out.println("antes do decremento " + decremento);
        decremento--;
        System.out.println("após o decremento " + decremento);
//--------------------------------------------------------------------------------------------------------------
        //Operador igualdade

        long valorIgualdade1 = 3L;
        long valorIgualdade2 = 3L;

        if (valorIgualdade1==valorIgualdade2) {

            System.out.println("As variaveis  valorIgualdade1 de valor =  " +valorIgualdade1 + " e valorIgualdade2 de valor  " +valorIgualdade2+ "  são iguais.");

        } else {
            System.out.println("As variaveis  valorIgualdade1 de valor =  " +valorIgualdade1 + " e valorIgualdade2 de valor  " +valorIgualdade2+ "  são diferentes.");
        }
//_____________________________________________________________________________________________________
        //Operador diferença

        double valorDiferença1 = 100.999D;
        double valorDiferença2 = 99.999D;

        if (valorDiferença1 != valorDiferença2) {

            System.out.println("Os valores " +valorDiferença1 + " e " +valorDiferença2+ "  são diferentes.");
            valorDiferença1++;
        }
        else {

            System.out.println("Os valores " +valorDiferença1 + " e " +valorDiferença2+ " são iguais.");

        }
        //______________________________________________________________________________________________________
         /*
        //Operador Diferença exata  Usando tolerância para evitar problemas de precisão

        if (Math.abs(valorDiferençaExata1 - valorDiferençaExata2) > 0.000001) {
            System.out.println("Os valores " + valorDiferençaExata1 + " e " + valorDiferençaExata2 + " são diferentes.");
        } else {
            System.out.println("Os valores absolutos das variaveis declaradas são " + valorDiferençaExata1 + " e " + valorDiferençaExata2 + " isso quer dizer que são iguais.");
        }

        if (Math.abs(valorDiferença1 - valorDiferença2) > 0.000001) {
            System.out.println("Os valores " + valorDiferença1 + " e " + valorDiferença2 + " são diferentes Teste2.");
        } else {
            System.out.println("Os valores absolutos das variaveis declaradas são " + valorDiferença1 + " e " + valorDiferença2 + " isso quer dizer que são iguais.");
        }
        */
    //Operadorores relacionais

        if (valorDiferença1 > valorDiferença2) {//maior

            System.out.println("Os valor " +valorDiferença1 + " é maior que " +valorDiferença2);
            valorDiferença1--;
        }

        if (valorDiferença1 < valorDiferença2) {//menor

            System.out.println("Os valor " +valorDiferença1 + " é menor que " +valorDiferença2);

        }
        //Operadorores logicos
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro || falso);

        System.out.println(verdadeiro && falso);

    }
}
