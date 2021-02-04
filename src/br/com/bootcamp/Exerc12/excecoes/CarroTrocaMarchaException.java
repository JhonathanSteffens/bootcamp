package br.com.bootcamp.Exerc12.excecoes;

public class CarroTrocaMarchaException extends  RuntimeException {

    public CarroTrocaMarchaException(String mensagem) {
        super(mensagem);
    }
}
