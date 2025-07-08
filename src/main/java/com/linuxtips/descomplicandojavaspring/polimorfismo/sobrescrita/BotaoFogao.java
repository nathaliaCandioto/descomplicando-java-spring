package com.linuxtips.descomplicandojavaspring.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao{

    @Override
    public void ligar() {
  //      super.desligar();
        System.out.println("hora de esquentar a comida");
    }

    @Override
    public void desligar() {
        super.ligar();
    }
}
