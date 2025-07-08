package com.linuxtips.descomplicandojavaspring.polimorfismo.sobrescrita;

public class Pagamento {
    public Double pagamento(Double valor) {
        return valor;
    }

    public Integer pagamento(Integer valorInteger, Integer parcelas) {
        return valorInteger / parcelas;

    }

    public long pagamento(Integer valorInteger, Integer parcelas, long juros) {
        return (valorInteger / parcelas + juros);
    }
}

