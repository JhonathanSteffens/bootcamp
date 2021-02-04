package br.com.bootcamp.Exerc13;

import org.w3c.dom.ls.LSOutput;

public class Resultado {
    private Especie especie;
    private Integer quantidade;

    public Resultado(Especie especie,
                     Integer quantidade){
        this.especie = especie;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "especie=" + especie +
                ", quantidade=" + quantidade +
                '}';
    }
}
