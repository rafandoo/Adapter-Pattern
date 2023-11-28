package com.pay;

import com.pay.existente.Pagamento;
import com.pay.existente.SistemaPagamento;
import com.pay.terceiro.AdaptadorPagamento;
import com.pay.terceiro.PagamentoTerceiros;
import com.pay.terceiro.SistemaPagamentoTerceiros;

public class Main {

    public static void main(String[] args) {

        // Sistema de pagamento ja existente
        SistemaPagamento pagamentoExistente = new Pagamento(500);

        // Sistema de pagamento de terceiros adaptado para a interface existente
        SistemaPagamentoTerceiros pagamentoTerceiros = new PagamentoTerceiros(500);
        SistemaPagamento adaptador = new AdaptadorPagamento(pagamentoTerceiros);

        Cliente c1 = new Cliente(pagamentoExistente);
        c1.realizarPagamento();

        Cliente c2 = new Cliente(adaptador);
        c2.realizarPagamento();

    }
}
