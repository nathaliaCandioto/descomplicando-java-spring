package com.linuxtips.descomplicandojavaspring.classeEnum;

public class StaticPedidos {
    private String id;
    static int pedidosFeitos;
    protected static final String status="PEDIDO_CONCLUIDO";

    public StaticPedidos (String Id) {
        this.id=id;
        pedidosFeitos++;
    }

   static void completarPedidos() {
        pedidosFeitos++;
    System.out.println("Pedido atualizado com sucesso"+status+
            "já tivemos "+pedidosFeitos+ " essa semana");

    }
}
