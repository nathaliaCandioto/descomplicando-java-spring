package com.linuxtips.descomplicandojavaspring.heranca;

public class PessoaMain {
    public static void  main (String[]Args){
        PessoaDesenvolvedoraBackend PessoaDesenvolvedoraBackend = new PessoaDesenvolvedoraBackend("PessoaDesenvolvedoraBackend1","Java e Spring",1223133.6);
        System.out.println("Este é:\n"+ PessoaDesenvolvedoraBackend.getNome()
        );
        PessoaDesenvolvedoraBackend.codar();

        PessoaDesenvolvedoraFrontEnd PessoaDesenvolvedoraFrontEnd = new PessoaDesenvolvedoraFrontEnd("PessoaDesenvolvedoraFrontEnd","FrontEnd",122212.5);
        System.out.println("Este é: "+PessoaDesenvolvedoraFrontEnd.getNome()+"\n" +PessoaDesenvolvedoraFrontEnd.getStack()+"\n"+PessoaDesenvolvedoraFrontEnd.getSalario()
        );
        PessoaDesenvolvedoraFrontEnd.codar();


    }
}
