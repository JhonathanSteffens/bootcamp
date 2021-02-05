package br.com.bootcamp.Exerc15.Service;

import br.com.bootcamp.Exerc15.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> buscarTodos();

    Cliente buscar(Integer id);

    Cliente inserir(Cliente objeto);

    Cliente alterar(Cliente objeto);

    void excluir(Integer id);
}
