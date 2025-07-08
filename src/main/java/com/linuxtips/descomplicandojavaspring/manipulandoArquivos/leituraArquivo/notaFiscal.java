package com.linuxtips.descomplicandojavaspring.manipulandoArquivos.leituraArquivo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class notaFiscal  {

    public static void main (String[]args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor Insira o codigo do produto");
        String codigo = scanner.nextLine();

        System.out.println("Por favor Insira o a quantidade de itens deste produto");
        Integer quantidade = scanner.nextInt();

        System.out.println("Por favor Insira o valor do produto");
        Integer valor = scanner.nextInt();

        int total =  valor*quantidade;
        System.out.println(" O valor total da sua compra é: " +total);
        System.out.println(" Aguarde sua nota fiscal: ");

        //define a variavel fileName e atribui a ela o endereço do arquivo
        Path fileName = Path.of("/home/nathrosa/Documents/aulas/IdeaProjects/descomplicando-java-e-spring/src/main/java/com/linuxtips/descomplicandojavaspring/manipulandoArquivos/nota_fiscal"+codigo+".txt");
       //defini a variavel text e atribui a ela o conteudo do arquivo
        String text = "Codigo do produto: "+codigo+" quantidade "+quantidade+" Valor "+valor+" \n"+" total da compra "+total+"  ";
       //Classe Files chama seu metodo writeString e informa a ela os parametros das variaveis \n
        // fileName e text

        Files.writeString(fileName, text);
        String fileContent = Files.readString(fileName);
        System.out.println(fileContent);

    }

}