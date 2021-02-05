package br.com.bootcamp.Exerc15;

import java.math.BigDecimal;

public class Item {
    private Integer id;
    private String descricao;
    private Boolean inativo;
    private double qtdEstoque;
    private double VlrUnit;

    public Item(Integer id, String descricao, Boolean inativo, double qtdEstoque, double vlrUnit) {
        this.id = id;
        this.descricao = descricao;
        this.inativo = inativo;
        this.qtdEstoque = qtdEstoque;
        VlrUnit = vlrUnit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getInativo() {
        return inativo;
    }

    public void setInativo(Boolean inativo) {
        this.inativo = inativo;
    }

    public double getVlrUnit() {
        return VlrUnit;
    }

    public void setVlrUnit(double vlrUnit) {
        VlrUnit = vlrUnit;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", inativo=" + inativo +
                ", qtdEstoque=" + qtdEstoque +
                ", VlrUnit=" + VlrUnit +
                '}';
    }

    public void resumo(Pedido pedido){
        System.out.println(toString());
    }
}
