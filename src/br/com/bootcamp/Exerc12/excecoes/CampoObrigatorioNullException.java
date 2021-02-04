package br.com.bootcamp.Exerc12.excecoes;

public class CampoObrigatorioNullException extends RuntimeException {

    public CampoObrigatorioNullException(String mensagem) {
        super(mensagem);
    }

}
