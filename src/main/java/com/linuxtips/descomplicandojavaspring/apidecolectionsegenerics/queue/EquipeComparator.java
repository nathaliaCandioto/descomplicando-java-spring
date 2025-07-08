package com.linuxtips.descomplicandojavaspring.apidecolectionsegenerics.queue;

import java.util.Comparator;

public class EquipeComparator implements Comparator<Equipe> {

    @Override
    public int compare(Equipe posicao1, Equipe posicao2) {
        if (posicao1.saldoDepontos < posicao2.saldoDepontos)
            return 1;

         else if (posicao1.saldoDepontos > posicao2.saldoDepontos)
            return -1;

         return 0;
        }

    }
