package br.com.bootcamp.Exerc12;

public class Endereco {

    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String complemento;

    public Endereco (String rua,
                     Integer numero,
                     String bairro,
                     String cidade,
                     String cep,
                     String complemento){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.complemento = complemento;
    }
}
