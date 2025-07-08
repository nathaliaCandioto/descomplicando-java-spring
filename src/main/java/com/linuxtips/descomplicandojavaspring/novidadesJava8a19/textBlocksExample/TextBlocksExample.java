package com.linuxtips.descomplicandojavaspring.novidadesJava8a19.textBlocksExample;
//apartir de Java 15
// formas de declarar strings com varia linhjas com mais eficiencia e mais clean
public class TextBlocksExample {

    public static void main(String[] Args) {

        String sqlExample = """
                SELECT id,nome,sobrenome
                FROM estudante
                WHERE linguagem = "Java"
                ORDER BY nome
                """;
        System.out.println(sqlExample);
    }
}