package com.linuxtips.descomplicandojavaspring.exerciciosindependentesv2.cadastro.entity;

public class Cliente extends Pessoa{
    private Integer pedido;
    private String pagamento;

    public Cliente(String nome, String email, String documento, Integer telefone,Integer pedido,String pagamento) {
        super(nome, email, documento, telefone);
        this.pedido=pedido;
        this.pagamento=pagamento;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "pedido=" + pedido +
                ", pagamento='" + pagamento + '\'' +
                '}';
    }
}
