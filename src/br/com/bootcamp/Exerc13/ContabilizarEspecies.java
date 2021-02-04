package br.com.bootcamp.Exerc13;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies {

    public List<Resultado> contar (List<Animal> animais, EspeciesUtil especiesUtil) {
        List<Especie> especies = especiesUtil.classificar(animais);
        List<Resultado> resultados = new ArrayList<>();
        for(int i = 0; i < especies.size(); i++ ){
            Resultado resultado = new Resultado(especies.get(i), especiesUtil.filtrar(animais, especies.get(i)).size());
            resultados.add(resultado);
        }

        return resultados;
        }
    }
