package br.com.bootcamp.exerc7.empregadocomicionado;

import br.com.bootcamp.exerc7.empregado.Empregado;

public class EmpregadoComicionado extends Empregado {
    private double valorProdutosVendidos;
    private double percentualComissao;
    private double valorComissao;



    public EmpregadoComicionado (String nome,
                                 String cpf,
                                 double valorSalarioBase,
                                 double valorImpostos,
                                 double valorProdutosVendidos,
                                 double percentualComissao){
        super(nome, cpf, valorSalarioBase, valorImpostos);
        this.valorProdutosVendidos = valorProdutosVendidos;
        this.percentualComissao = percentualComissao;
        this.valorComissao = valorProdutosVendidos * percentualComissao / 100;
    }
    @Override
    public double calculaValorTotalSalario() {
        return getValorSalarioBase() + valorComissao - getValorImpostos();
    }

    public double getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }

    public void setValorProdutosVendidos(double valorProdutosVendidos) {
        this.valorProdutosVendidos = valorProdutosVendidos;
    }
}
