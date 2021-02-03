package br.com.bootcamp.exerc8.contaCorrente;

import br.com.bootcamp.exerc8.contaBancaria.ContaBancaria;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {

    private final BigDecimal limiteTotal;
    private BigDecimal limite;

    public ContaCorrente (Integer numerodaConta,
                          BigDecimal saldo,
                          BigDecimal limite){
        super(numerodaConta, saldo);
        this.limiteTotal = limite;
        this.limite = limite;
    }
    public void sacar(BigDecimal saque) {

        if (saldo.compareTo(saque) > 0){
            saldo = saldo.subtract(saque);
            System.out.println("Seu saque foi efetuado com sucesso!");
            System.out.println("Seu novo saldo é: " + saldo);
            System.out.println("Seu limite é: " + limite);
        } else if (saldo.add(limite).compareTo(saque) > 0){
            limite = saldo.add(limite).subtract(saque);
            saldo = saldo.subtract(saque);
            System.out.println("Seu saque foi efetuado com sucesso!");
            System.out.println("Seu limite é: " + limite);
            System.out.println("Seu novo saldo é: " + saldo);
        } else {
            System.out.println("O valor Solicitado para saque é maior do que o valor disponível!");
        }
    }

    @Override
    public void depositar(BigDecimal deposito) {
        BigDecimal valorComparacao = new BigDecimal(0);
        saldo = saldo.add(deposito);
        if (saldo.compareTo(valorComparacao) > 0){
            System.out.println("Seu deposito foi efetuado com sucesso!");
            System.out.println("Seu novo saldo é: " + saldo);
            System.out.println("Seu novo limite é: " + limiteTotal);
            limite = limiteTotal;
        } else {
            System.out.println("Seu deposito foi efetuado com sucesso!");
            System.out.println("Seu novo saldo é: " + saldo);
            System.out.println("Seu novo limite é: " + limiteTotal.add(saldo));
        }
    }

}
