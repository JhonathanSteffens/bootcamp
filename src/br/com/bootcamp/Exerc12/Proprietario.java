package br.com.bootcamp.Exerc12;

import br.com.bootcamp.Exerc12.excecoes.CampoObrigatorioNullException;

import java.util.Date;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;
    private Date dataNascimento;

    public Proprietario(String nome,
                        String cpf,
                        String rg,
                        Endereco endereco){
        if(nome == null ){
            throw new CampoObrigatorioNullException("O campo nome é obrigatório");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
}
