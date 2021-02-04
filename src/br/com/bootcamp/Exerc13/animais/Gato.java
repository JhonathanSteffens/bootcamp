package br.com.bootcamp.Exerc13.animais;

import br.com.bootcamp.Exerc13.Animal;
import br.com.bootcamp.Exerc13.Especie;

public class Gato implements Animal {


    @Override
    public String getNome() {
        return "gato";
    }

    @Override
    public Especie getEspecie() {
        return Especie.MAMIFEROS;
    }
}
