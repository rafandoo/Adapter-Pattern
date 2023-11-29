package com.payment;

import com.payment.existente.Pagamento;
import com.payment.existente.SistemaPagamento;
import com.payment.terceiro.AdaptadorPagamento;
import com.payment.terceiro.PagamentoTerceiros;
import com.payment.terceiro.SistemaPagamentoTerceiros;

public class Main {

    public static void main(String[] args) {

        // Sistema de pagamento ja existente
        SistemaPagamento pagamentoExistente = new Pagamento(500);

        // Sistema de pagamento de terceiros adaptado para a interface existente
        SistemaPagamentoTerceiros pagamentoTerceiros = new PagamentoTerceiros(500);
        SistemaPagamento adaptador = new AdaptadorPagamento(pagamentoTerceiros);
        // Realizando o pagamento
        Cliente c1 = new Cliente(pagamentoExistente);
        c1.realizarPagamento();

        Cliente c2 = new Cliente(adaptador);
        c2.realizarPagamento();

    }
}
