package br.com.bootcamp.Exerc13.animais;

import br.com.bootcamp.Exerc13.Animal;
import br.com.bootcamp.Exerc13.Especie;

public class Tubarao implements Animal {
    @Override
    public String getNome() {
        return "Tubarão";
    }

    @Override
    public Especie getEspecie() {
        return Especie.PEIXES;
    }
}
