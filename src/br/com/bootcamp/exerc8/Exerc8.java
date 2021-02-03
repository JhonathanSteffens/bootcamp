package br.com.bootcamp.exerc8;


import br.com.bootcamp.exerc8.contaBancaria.ContaBancaria;
import br.com.bootcamp.exerc8.contaCorrente.ContaCorrente;
import br.com.bootcamp.exerc8.contaPoupanca.ContaPoupanca;

import java.math.BigDecimal;


public class Exerc8 {

    public static void main(String[] args) {

        System.out.println("------- Conta Poupança -------");
        BigDecimal saldoPoupanca = new BigDecimal(150000);
        BigDecimal taxaOperacao = new BigDecimal(2);
        BigDecimal saquePoupanca = new BigDecimal(17000);
        BigDecimal depositoPoupanca = new BigDecimal(15000);

        ContaBancaria contaDoJhonyPoupanca = new ContaPoupanca(1,saldoPoupanca,taxaOperacao);
        contaDoJhonyPoupanca.depositar(depositoPoupanca);
        contaDoJhonyPoupanca.sacar(saquePoupanca);

        System.out.println("------- Conta Corrente -------");

        BigDecimal saldoCorrente = new BigDecimal(150000);
        BigDecimal depositoCorrente = new BigDecimal(2000);
        BigDecimal limite = new BigDecimal(10000);
        BigDecimal saqueCorrente = new BigDecimal(165000);
        BigDecimal saqueCorrente2 = new BigDecimal(5000);

        ContaBancaria contaDoJhonyCorrente = new ContaCorrente(2,saldoCorrente, limite);

        contaDoJhonyCorrente.sacar(saqueCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.sacar(saqueCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);
        contaDoJhonyCorrente.depositar(depositoCorrente);

        Relatorio relatorio = new Relatorio();
        relatorio.gerar((Imprimivel) contaDoJhonyCorrente);

        Relatorio relatorio2 = new Relatorio();
        relatorio2.gerar((Imprimivel) contaDoJhonyPoupanca);

        Banco banco = new Banco();

        banco.inserir(contaDoJhonyPoupanca);
        banco.inserir(contaDoJhonyCorrente);
        banco.inserir(contaDoJhonyCorrente);
        System.out.println("O banco procurado é: "+  banco.procurar(2));
    }
}
