package br.com.bootcamp.exerc11;

import java.time.LocalDateTime;

public class Exerc11 {

    public static void main(String[] args) {

        Voo vooAirlines = new Voo(LocalDateTime.now(), 1, 50);

        System.out.println(vooAirlines.getNumeroVoo());
        System.out.println(vooAirlines.getDataHora());
        vooAirlines.criaAssentos();
        vooAirlines.assentosLivres();
        vooAirlines.vagas();
        vooAirlines.ocupa(12);
        vooAirlines.assentosLivres();
        vooAirlines.vagas();
        vooAirlines.verifica(11);
        vooAirlines.verifica(12);
        vooAirlines.ocupa(1);
        vooAirlines.ocupa(2);
        vooAirlines.primeiroLivre();
        vooAirlines.ocupa(13);
        vooAirlines.proximoLivre(11);
    }
}
