package br.com.bootcamp.Exerc13;

import br.com.bootcamp.Exerc13.animais.Cachorro;
import br.com.bootcamp.Exerc13.animais.Gato;
import br.com.bootcamp.Exerc13.animais.Jacare;
import br.com.bootcamp.Exerc13.animais.Tubarao;

import java.util.ArrayList;
import java.util.List;

public class Exerc13 {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal tubarao = new Tubarao();
        Animal jacare = new Jacare();
        cachorro.getEspecie();
        cachorro.getNome();
        gato.getNome();
        gato.getEspecie();
        tubarao.getNome();
        tubarao.getEspecie();
        jacare.getNome();
        jacare.getEspecie();

        ContabilizarEspecies contabiliza = new ContabilizarEspecies();
        Util util = new Util();
        List<Animal> animais = new ArrayList<>();

        animais.add(gato);
        animais.add(cachorro);
        animais.add(tubarao);
        animais.add(jacare);

        System.out.println(contabiliza.contar(animais, util));
    }
}
