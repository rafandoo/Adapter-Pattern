package com.pay;

import com.pay.existente.SistemaPagamento;

public class Cliente {

    private SistemaPagamento pagamento;

    public Cliente(SistemaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void realizarPagamento() {
        this.pagamento.processarPagamento();
    }
}
