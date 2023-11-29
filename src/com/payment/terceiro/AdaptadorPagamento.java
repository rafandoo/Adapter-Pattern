package com.payment.terceiro;

import com.payment.existente.SistemaPagamento;

public class AdaptadorPagamento implements SistemaPagamento {

    private SistemaPagamentoTerceiros spt;

    public AdaptadorPagamento(SistemaPagamentoTerceiros sistemaPagamentoTerceiros) {
        this.spt = sistemaPagamentoTerceiros;
    }

    @Override
    public void processarPagamento() {
        this.spt.processarPagamento();
    }
}
