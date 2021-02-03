package br.com.bootcamp.exerc8.contaPoupanca;

import br.com.bootcamp.exerc8.contaBancaria.ContaBancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {

    public BigDecimal taxaOperacao;

    public ContaPoupanca(
            Integer numeroDaConta,
            BigDecimal saldo,
            BigDecimal taxaOperacao){
        super(numeroDaConta, saldo);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void sacar(BigDecimal saque) {
        if (saque.compareTo(saldo) == 1){
            System.out.println("O valor Solicitado para saque é maior do que o valor disponível!");
        }
        else {
            saldo = saldo.subtract(saque).subtract(taxaOperacao);
            System.out.println("Seu saque foi efetuado com sucesso!");
            System.out.println("Seu novo saldo é: " + saldo );
        }
    }

    @Override
    public void depositar(BigDecimal deposito) {
       saldo = saldo.add(deposito).subtract(taxaOperacao);
       System.out.println("Seu deposito foi efetuado com sucesso!");
        System.out.print("Seu novo saldo é: ");
        System.out.println(saldo);
    }

}
