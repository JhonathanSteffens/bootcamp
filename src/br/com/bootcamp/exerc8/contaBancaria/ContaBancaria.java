package br.com.bootcamp.exerc8.contaBancaria;


import java.math.BigDecimal;

public abstract class ContaBancaria {
    public Integer numeroDaConta;
    public BigDecimal saldo;

    public ContaBancaria(Integer numeroDaConta,
                         BigDecimal saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public abstract void sacar(BigDecimal saque);

    public abstract void depositar(BigDecimal deposito);
}
