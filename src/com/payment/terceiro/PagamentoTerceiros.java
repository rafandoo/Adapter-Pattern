package com.payment.terceiro;

import java.text.DecimalFormat;

public class PagamentoTerceiros implements SistemaPagamentoTerceiros {

    private float valorPagamento;

    public PagamentoTerceiros(float valor) {
        this.valorPagamento = valor;
    }

    public float getValor() {
        return valorPagamento;
    }

    public void setValor(float valor) {
        this.valorPagamento = valor;
    }

    @Override
    public void processarPagamento() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Processando o pagamento *terceiros* de R$" + df.format(this.getValor()));
    }
}
