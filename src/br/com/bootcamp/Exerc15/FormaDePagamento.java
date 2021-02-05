package br.com.bootcamp.Exerc15;

public enum FormaDePagamento {

    DINHEIRO ("Dinheiro"),
    CARTAO ("Cartão"),
    BOLETO("Boleto");

    private String descricao;

    FormaDePagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
