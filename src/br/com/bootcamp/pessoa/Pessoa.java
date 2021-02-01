package br.com.bootcamp.pessoa;

import br.com.bootcamp.endereco.Endereco;
import br.com.bootcamp.telefone.Telefone;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    private List<Endereco> enderecoList;
    private List<Telefone> telefoneList;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }
}
