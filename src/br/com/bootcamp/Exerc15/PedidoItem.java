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

    @Override
    public String toString() {
        return "PedidoItem{" +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", valorDesconto=" + valorDesconto +
                '}';
    }

    public void resumo(PedidoItem pedidoItem){
        System.out.println(toString());
    }
}
