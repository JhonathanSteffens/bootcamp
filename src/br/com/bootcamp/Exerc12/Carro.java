package br.com.bootcamp.Exerc12;

import br.com.bootcamp.Exerc12.excecoes.CarroAceleraException;
import br.com.bootcamp.Exerc12.excecoes.CarroTrocaMarchaException;

public class Carro {
    private String modelo;
    private String cor;
    private String ano;
    private Marca marca;
    private String chassi;
    private Proprietario proprietario;
    private Integer velocidadeMaxima;
    private Integer velocidadeAtual;
    private Integer nrPortas;
    private Integer nrMarchas;
    private Integer marchaAtual;
    private double qtdCombustivel;

    public Carro(Proprietario proprietario,
                 double qtdCombustivel){
        this.proprietario = proprietario;
        this.qtdCombustivel = qtdCombustivel;
        this.velocidadeAtual = 0;
        this.marchaAtual = 0;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setNrPortas(Integer nrPortas) {
        this.nrPortas = nrPortas;
    }

    public void setNrMarchas(Integer nrMarchas) {
        this.nrMarchas = nrMarchas;
    }

    public void setMarchaAtual(Integer marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAno() {
        return ano;
    }


    public String getChassi() {
        return chassi;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Integer getNrPortas() {
        return nrPortas;
    }

    public Integer getNrMarchas() {
        return nrMarchas;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public void acelera(){
        if (velocidadeAtual < velocidadeMaxima){
            velocidadeAtual++;
        }
        else {
           throw new CarroAceleraException("Você atingiu a velocidade máxima!");
        }
    }

    public void freia(){
        velocidadeAtual = 0;
    }

    public void trocaMarcha(){
        if (marchaAtual < nrMarchas){
            marchaAtual++;
            System.out.println("Você trocou a marcha para a " + marchaAtual);
        }
        else{
            throw new CarroTrocaMarchaException("Você está na última marcha");
        }
    }

    public void reduzMarcha(){
        if (marchaAtual > 1) {
            marchaAtual --;
            System.out.println("Você trocou a marcha para a " + marchaAtual);
        } else if (marchaAtual == 1 && velocidadeAtual == 0){
            marchaAtual --;
            System.out.println("Você trocou para a marcha ré");
        }
        else {
            System.out.println("Você está na primeira marcha");
        }
    }

    public double autonomia(double consumoMedio){
        return consumoMedio * qtdCombustivel;
    }
}
