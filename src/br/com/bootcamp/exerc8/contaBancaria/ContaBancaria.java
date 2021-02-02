package br.com.bootcamp.exerc8.contaBancaria;


import java.math.BigDecimal;

public abstract class ContaBancaria {
    private Integer numeroDaConta;
    private BigDecimal saldo;

    public ContaBancaria(Integer numeroDaConta,
                         BigDecimal saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public BigDecimal Sacar(BigDecimal saque){
        return saldo.subtract(saque);
    }

    public BigDecimal Depositar(BigDecimal deposito){
        return saldo.add(deposito);
    }
}
