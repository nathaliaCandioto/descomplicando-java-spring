package com.linuxtips.descomplicandojavaspring.manipulandoArquivos.leituraArquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class validadorNotaFiscal {
    public static void main(String [] args) throws FileNotFoundException {

        File file = new File ("/home/nathrosa/Documents/aulas/IdeaProjects/descomplicando-java-e-spring/src/main/java/com/linuxtips/descomplicandojavaspring/manipulandoArquivos/nota_fiscal480.txt");
        Scanner sc = new Scanner (file);

        while (sc.hasNextLine()){
        System.out.println(sc.nextLine());
        }
    }
}
