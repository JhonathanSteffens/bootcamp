package br.com.bootcamp.Exerc13.animais;

import br.com.bootcamp.Exerc13.Animal;
import br.com.bootcamp.Exerc13.Especie;

public class Jacare implements Animal {

    @Override
    public String getNome() {
        return "Jacaré";
    }

    @Override
    public Especie getEspecie() {
        return Especie.REPTEIS;
    }
}
