package br.com.bootcamp.Exerc15;

import java.math.BigDecimal;

public class PedidoItem {
    private double quantidade;
    private double valorUnitario;
    private double valorDesconto;

    public PedidoItem(double quantidade, double valorUnitario, double valorDesconto) {
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorDesconto = valorDesconto;
    }

    public double getValorTotal(){
        return quantidade* valorUnitario - valorDesconto;
    }

    public double getValorTotalSemDesconto(){
        return quantidade * valorUnitario;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}
