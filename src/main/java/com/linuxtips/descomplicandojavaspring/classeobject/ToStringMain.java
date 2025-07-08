package com.linuxtips.descomplicandojavaspring.classeobject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ToStringMain {

    public static void main (String[]args) {
        Funcionaria funcionaria = new Funcionaria();

        funcionaria.setCargo("Roedora");
        funcionaria.setIdade(4);
        funcionaria.setNome("Francisca");
        funcionaria.setSalario(120.5);
        funcionaria.setSetor("felinianos");

//       System.out.println(funcionaria.dadosFuncionaria());
//       List<Funcionaria>listaAtributos = Collections.singletonList(funcionaria);//convert o objeto em lista
//        // e depois imprimi
//       listaAtributos.forEach(System.out::println);//aqui tabm impri o to string mesmo apos converte em lista
//        System.out.println(funcionaria);//imprimi o toString
//
//        System.out.println(funcionaria.getNome().equals("Frederico"));
//        System.out.println(funcionaria.getNome().equals("Francisca"));
//        System.out.println(funcionaria.hashCode());
//        System.out.println(funcionaria.getNome().hashCode());
        System.out.println(funcionaria.getCargo().hashCode());
//        System.out.println(funcionaria.getIdade().hashCode());

        var setorHashCode = String.valueOf(funcionaria.getCargo().hashCode());
        var setorHashCodeNovo = String.valueOf("Roedora".hashCode());
       System.out.println(setorHashCode.equals(setorHashCodeNovo));

        Integer setorHashCodeINT = funcionaria.getSetor().hashCode();
        Integer setorHashCodeINTnovo = "felinianos".hashCode();
        System.out.println(setorHashCodeINT.equals(setorHashCodeINTnovo));
        System.out.println(funcionaria.hashCode());
            }


}
