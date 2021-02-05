package br.com.bootcamp.Exerc15.DAO;

import br.com.bootcamp.Exerc15.Cliente;


import java.util.List;

public interface ClienteDAO {

    List<Cliente> buscarTodos();

    Cliente buscar(Integer id);

    Cliente inserir(Cliente objeto);

    Cliente alterar(Cliente objeto);

    void excluir(Integer id);
}
