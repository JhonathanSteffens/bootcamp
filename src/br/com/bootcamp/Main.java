package br.com.bootcamp;

import br.com.bootcamp.endereco.Endereco;
import br.com.bootcamp.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Debora");
        pessoa.setSobrenome("Steffens");
        pessoa.setCpf("03232323");
        pessoa.setEmail("jhony_steffens@hotmail.com");
        LocalDate dataNascimento = LocalDate.of(1998, Month.FEBRUARY, 11);
        pessoa.setDataNascimento(dataNascimento);
        List<Endereco> enderecoList = new ArrayList<>();
        Endereco endereco = new Endereco("R.Tupy", 123, "Centro");
        enderecoList.add(endereco);
        pessoa.setEnderecoList(enderecoList);
        pessoa.getTelefoneList().add();
    }
}
