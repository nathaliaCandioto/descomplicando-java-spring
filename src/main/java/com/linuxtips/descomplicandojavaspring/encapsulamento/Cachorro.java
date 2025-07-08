package com.linuxtips.descomplicandojavaspring.encapsulamento;

    public class Cachorro{

        // private-> modificador de acesso: só acessa dentro da classe
        private Double peso;
        private Integer idade;

        //public -> modificador de acesso:o projeto inteiro tem acesso
        public Double pesoPublic;
        public Integer idadePublic;

        //protected -> modificador de acesso: somente dentro do pacote
        protected Double pesoProtected;
        protected Integer idadeProtected;
        //todo o projeto acessa

        // todo o projeto tem acesso
        public String latir (){
        return"auau";
        }

        //so o pacote acessa pacote
            protected String dormir (){
            return"zzzz";
        }

        //so acessa dentro da classe
        public String comer(String quantidade){
            return "hora da racao " +quantidade;
        }
    }

