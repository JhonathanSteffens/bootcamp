package br.com.bootcamp.exerc8.contaPoupanca;

import br.com.bootcamp.exerc8.contaBancaria.ContaBancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {

    private double taxaOperacao;

    public ContaPoupanca(
            Integer numeroDaConta,
            BigDecimal saldo,
            double taxaOperacao){
        super(numeroDaConta, saldo);
        this.taxaOperacao = taxaOperacao;
    }



}
