package br.com.bootcamp.exer3;


import br.com.bootcamp.exer3.pessoa.Pessoa;
import br.com.bootcamp.exer3.grupoDePessoas.GrupoDePessoas;

import java.time.LocalDate;


public class exer3 {

    public static void main(String[] args) {
        Pessoa jhonathan = new Pessoa("Jhonathan","abc",LocalDate.of(1998,12,22));
        Pessoa pessoa2 = new Pessoa("Pessoa2","abc",LocalDate.of(1991,9,22));
        Pessoa pessoa3 = new Pessoa("Pessoa3","abc",LocalDate.of(1991,4,22));
        GrupoDePessoas grupoDePessoas = new GrupoDePessoas();
        grupoDePessoas.adicionar(jhonathan);
        grupoDePessoas.adicionar(pessoa2);
        grupoDePessoas.adicionar(pessoa3);

        for(int i = 0; i < grupoDePessoas.getPessoasList().size(); i++){
            Pessoa pessoaAtual = grupoDePessoas.getPessoasList().get(i);
            System.out.println("pessoaAtual"+pessoaAtual);
        }

        grupoDePessoas.encontraMaiorIdade(grupoDePessoas.pessoasList);
        grupoDePessoas.encontraMenorIdade(grupoDePessoas.pessoasList);
    }
}
