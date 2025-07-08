package com.linuxtips.descomplicandojavaspring.objetos;

public class ObjetoGato {
    public static void main(String[] args) {
        //Instanciar o objeto
//chamar o nome da classe do obetos = nome do objeto;
        Gato frederico = new Gato();
        frederico.setNome("frederico");
        frederico.setSexo("macho");
        frederico.setCor("Amarela");
        frederico.setRaca("SRD");

        System.out.println(frederico.getNome());
        System.out.println(frederico.getSexo());
        System.out.println(frederico.getCor());
        System.out.println(frederico.getRaca());

    }

    public String comer() {
        return "estou com fome";

    }

    public String domir() {
        return "estou com sono";

    }
}