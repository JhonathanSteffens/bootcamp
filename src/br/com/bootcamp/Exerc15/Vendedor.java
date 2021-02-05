package br.com.bootcamp.Exerc15;

public class Vendedor {
    private Integer id;
    private String nome;
    private double percentualComissao;
    private double percentualDescontoMax;

    public Vendedor(Integer id, String nome, double percentualComissao, double percentualDescontoMax) {
        this.id = id;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
        this.percentualDescontoMax = percentualDescontoMax;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setPercentualDescontoMax(double percentualDescontoMax) {
        this.percentualDescontoMax = percentualDescontoMax;
    }

    public Integer getId() {
        return id;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public double getPercentualDescontoMax() {
        return percentualDescontoMax;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", percentualComissao=" + percentualComissao +
                ", percentualDescontoMax=" + percentualDescontoMax +
                '}';
    }
}
