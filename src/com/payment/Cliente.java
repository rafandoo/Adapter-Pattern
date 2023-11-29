package com.payment;

import com.payment.existente.SistemaPagamento;

public class Cliente {

    private SistemaPagamento pagamento;

    public Cliente(SistemaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void realizarPagamento() {
        this.pagamento.processarPagamento();
    }
}
