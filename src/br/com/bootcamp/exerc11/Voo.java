package br.com.bootcamp.exerc11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    LocalDateTime dataHora;
    Integer numeroVoo;
    Integer qtdMaxima;
    List<Assento> assentoList = new ArrayList<>();

    public Voo(
            LocalDateTime dataHora,
            Integer numeroVoo,
            Integer qtdMaxima)
    {
        this.dataHora = dataHora;
        this.numeroVoo = numeroVoo;
        this.qtdMaxima = qtdMaxima;
    }

    public void primeiroLivre(){
        for (int i = 0; i < qtdMaxima; i++){
            if (assentoList.get(i).estaLivre) {
                System.out.println("O primeiro assento livre é: "+ assentoList.get(i));
                return;
            }
        }
    }

    public void proximoLivre(Integer assento){
        for (int i = assento; i < qtdMaxima; i++){
            if (assentoList.get(i).estaLivre) {
                System.out.println("O próximo assento livre é: "+ assentoList.get(i));
                return;
            }
        }
    }

    public void criaAssentos(){

        for (int i = 0; i < qtdMaxima; i++){
            Assento assento = new Assento(i+1, true);
            assentoList.add(assento);
        }
    }

    public void assentosLivres(){
        for (int i = 0; i < qtdMaxima; i++){
            if (assentoList.get(i).estaLivre) {
                System.out.println(assentoList.get(i));
            }
        }
    }

    public void vagas(){
        int contador = 0;
        for (int i = 0; i < qtdMaxima; i++){
            if (assentoList.get(i).estaLivre) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    public void ocupa(Integer numeroOcupado){
        for (int i = 0; i < qtdMaxima; i++){
            if (assentoList.get(i).numeroAssento.equals(numeroOcupado)) {
                assentoList.get(i).estaLivre = false;
            }
        }
    }

    public void verifica(Integer numeroOcupado){
        for (int i = 0; i < qtdMaxima; i++){
            if (assentoList.get(i).numeroAssento.equals(numeroOcupado)) {
                if(!assentoList.get(i).estaLivre){
                    System.out.println("O assento verificado está ocupado");
                    return;
                }
            }
        }
        System.out.println("O assento está livre");
    }



    public Integer getNumeroVoo() {
        return numeroVoo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
