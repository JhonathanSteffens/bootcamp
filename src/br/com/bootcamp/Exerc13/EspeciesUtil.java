package br.com.bootcamp.Exerc13;

import java.util.List;

public interface EspeciesUtil {
    List<Animal> filtrar (List<Animal> animals, Especie especieFiltrar);
    List<Especie> classificar(List<Animal> animais);
}
