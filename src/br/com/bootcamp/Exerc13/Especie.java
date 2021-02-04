package br.com.bootcamp.Exerc13;

public enum Especie {
    AVES("Aves"),
    MAMIFEROS("Mamiferos"),
    PEIXES("Peixes"),
    REPTEIS("Répteis");

    private String descricao;

    Especie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
