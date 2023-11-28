package com.pay;

public class Main {

    public static void main(String[] args) {


        SistemaPagamentoTerceiros pagTerceiros = new PagamentoTerceiros(500);

        SistemaPagamento adaptador = new AdaptadorPagamento(pagTerceiros);

        Cliente c1 = new Cliente(adaptador);
        c1.realizarPagamento();

    }
}
