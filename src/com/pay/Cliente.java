package com.pay;

public class Cliente {

    private SistemaPagamento pagamento;

    public Cliente(SistemaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void realizarPagamento() {
        this.pagamento.processarPagamento();
    }
}
