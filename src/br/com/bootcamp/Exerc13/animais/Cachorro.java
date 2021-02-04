package br.com.bootcamp.Exerc13.animais;

import br.com.bootcamp.Exerc13.Animal;
import br.com.bootcamp.Exerc13.Especie;

public class Cachorro implements Animal {

    @Override
    public Especie getEspecie() {
        return Especie.MAMIFEROS;
    }

    @Override
    public String getNome() {
        return "Cachorro";
    }
}
